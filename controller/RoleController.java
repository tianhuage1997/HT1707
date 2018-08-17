package cn.tarena.ht.controller;

import cn.tarena.ht.pojo.Role;
import cn.tarena.ht.service.RoleService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sysadmin/role")
public class RoleController {

    @Autowired(required = true)
    private RoleService roleService;



    /**
     * 展示角色列表
     * @param model
     * @return
     */
    @RequestMapping("/list")
    public String list(Model model){
        List<Role>  roleList=roleService.findAllRole();
        model.addAttribute("roleList",roleList);
        return  "/sysadmin/role/jRoleList";
    }

    /**
     * 跳转到用户新增页面
     * @return
     */
    @RequestMapping("/tocreate")
    public  String  toCreate(){

        return  "/sysadmin/role/jRoleCreate";
    }

    /**
     * 保存用户角色
     * @param role
     * @return
     */
    @RequestMapping("/save")
    public  String saveRole(Role role){
        Integer i =roleService.saveRole(role);
        return  "redirect:/sysadmin/role/list";
    }







}
