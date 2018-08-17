package cn.tarena.ht.controller;

import cn.tarena.ht.pojo.Dept;
import cn.tarena.ht.pojo.Role;
import cn.tarena.ht.pojo.User;
import cn.tarena.ht.pojo.UserInfo;
import cn.tarena.ht.service.DeptService;
import cn.tarena.ht.service.RoleService;
import cn.tarena.ht.service.UserService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping("/sysadmin/user")
public class UserController  extends  BaseController {

    @Autowired(required = true)
    private UserService userService;

    @Autowired(required = true)
    private DeptService deptService;

    @Autowired
    private RoleService roleService;

    /**
     *显示用户列表信息
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String  UserList(Model model){
        List<User> userList= userService.findAllUser();
        model.addAttribute("userList",userList);
        return  "/sysadmin/user/jUserList";
    }

    /**
     *跳转到新增用户阶段
     * @param model
     * @return
     */
    @RequestMapping("/tocreate")
    public  String  tocreate(Model  model){
        //准备部门列表信息
        List<Dept>  deptList = deptService.findAllDept();
        System.out.println(deptList);
        //准备全部上级信息
        List<UserInfo> userInfoList = userService.findUserList();
        //绑定信息到页面
        //绑定部门表的信息清单
        model.addAttribute("deptList",deptList);
        //绑定上级的信息清单
        model.addAttribute("managerList",userInfoList);
        return  "/sysadmin/user/jUserCreate";
    }


    /**
     * 新增用户和用户拓展信息表
     * @param user
     * @return
     */
    @RequestMapping("/save")
    public String save(User  user){
        //生成全局唯一id。不过这个方法就是错误的。详情请参照 github上面的id-generator-base-on-redis
        String userId= UUID.randomUUID().toString();
        //设置userId
        user.setUserId(userId);
        user.setCreateTime(new Date());
        user.setUpdateTime(user.getCreateTime());
        //从user中获取userinfo
        UserInfo userInfo = user.getUserInfo();
        userInfo.setUserInfoId(userId);
        userInfo.setCreateTime(user.getCreateTime());
        userInfo.setUpdateTime(user.getCreateTime());

        //需要同时入库两个表，先入库主表，再入库从表
        userService.saveUser(user);
        //入库从表
        userService.savaUserInfo(userInfo);
        return  "redirect:/sysadmin/user/list";
    }


    @RequestMapping("/toupdate")
    public  String  toUpateUser(String userId, Model  model){
        //根据userId查询用户信息
        User user =userService.findUserById(userId);
        System.out.println(user);
        //准备部门列表
        List<Dept>  deptList = deptService.findAllDept();
        //准备全部上级信息
        List<UserInfo> userInfoList = userService.findUserList();
        //绑定信息到页面
        model.addAttribute("user",user);
        model.addAttribute("deptList",deptList);
        model.addAttribute("managerList",userInfoList);
        return  "/sysadmin/user/jUserUpdate";
    }

    /**
     * 修改用户表user和用户拓展信息表userInfo
     * @param user
     * @return
     */
    @RequestMapping("/update")
    public  String UpdateUser(User user){
        Integer i = userService.updateUser(user);
        return  "redirect:/sysadmin/user/list";
    }


    @RequestMapping("/")
    public  String deleteUser(String[] userIds){
        Integer i = userService.deleteUser(userIds);
        return  "redirect:/sysadmin/user/list";
    }


    @RequestMapping("/toRole")
    public  String  toRole(String roleId,Model model) throws JsonProcessingException {
        //准备角色信息
        List<Role>   roleList = roleService.findAllRole();
        //将角色信息转换为json
        ObjectMapper objectMapper = new ObjectMapper();
        String roleListJSON = objectMapper.writeValueAsString(roleList);
        System.out.println("roleListJSON :"+roleListJSON );
        model.addAttribute("userId",roleId);
        model.addAttribute("zTreeJSON",roleListJSON);
        return "/sysadmin/user/jUserRole";
    }

    /**
     * 用户角色新增
     * @return
     */
    @RequestMapping("/saveUserRole")
    public  String  saveUserRole(String  userId,String[] roleIds){
        roleService.saveUserRole(userId,roleIds);
        return  "redirect:/sysadmin/user/list";
    }

}
