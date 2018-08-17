package cn.tarena.ht.controller;


import cn.tarena.ht.pojo.Dept;
import cn.tarena.ht.service.DeptService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Hashtable;
import java.util.List;

@Controller
@RequestMapping("/sysadmin/dept")
public class DeptController {

    @Autowired(required = true)
    private DeptService  deptService;

    /**
     * zhuangzhike
     * 显示部门列表清单
     * @param model
     * @return  页面
     */
    @RequestMapping("/list")
    public String  listDept(Model model){
        List<Dept> listDept=deptService.findAllDept();
        model.addAttribute("deptList",listDept);
        return "/sysadmin/dept/jDeptList";
    }

    /**
     * 部门状态停用功能
     * @param deptIds
     * @param model
     * @return
     */
    @RequestMapping("/stop")
    public String stopByDeptId(@RequestParam("deptId") Integer[] deptIds, Model  model){
        Integer i=deptService.stopByDeptId(deptIds);
        List<Dept> listDept=deptService.findAllDept();
        model.addAttribute("deptList",listDept);
        return "/sysadmin/dept/jDeptList";
    }

    /**
     *部门状态启用功能
     * @param deptIds
     * @param model
     * @return
     */
    @RequestMapping("/start")
    public String startByDeptId(@RequestParam("deptId") Integer[] deptIds, Model  model){
        Integer i=deptService.startByDeptId(deptIds);
        List<Dept> listDept=deptService.findAllDept();
        model.addAttribute("deptList",listDept);
        return "/sysadmin/dept/jDeptList";
    }


    /**
     * 部门信息的删除
     * @param deptIds
     * @param model
     * @return
     */
    @RequestMapping("/delete")
    public String deleteDeptByDeptId(@RequestParam("deptId") Integer[] deptIds,Model  model){
        Integer i=deptService.deleteDeptByDeptId(deptIds);
        List<Dept> listDept=deptService.findAllDept();
        model.addAttribute("deptList",listDept);
        return "/sysadmin/dept/jDeptList";
    }

    /**
     * 跳转去增加页面
     * @param model
     * @return
     */
    @RequestMapping("/tocreate")
    public String toCreateDept(Model model){
        //先查询出所有的部门信息
        List<Dept> deptList=deptService.findAllDept();
        model.addAttribute("parentDeptList",deptList);
        Hashtable<String,String>  gg  =new Hashtable<String, String>();
        return "/sysadmin/dept/jDeptCreate";
    }

    /**
     * 保存新增部门的信息
     * @param dept
     * @return
     */
    @RequestMapping("/save")
    public String saveDeptInfo(Dept dept){
        deptService.saveDept(dept);
        return "redirect:/sysadmin/dept/list";
    }

    /**
     * 部门信息的查看
     * @param deptId
     * @param model
     * @return
     */
    @RequestMapping("/toview")
    public String toviewDept(Integer deptId, Model model){
        Dept dept=deptService.findByDeptId(deptId);
        model.addAttribute("dept",dept);
        return  "/sysadmin/dept/jDeptView";
    }

    /**
     * 跳转到修改页面，并回显修改之前的数据
     * @param deptId
     * @param model
     * @return
     */
    @RequestMapping("/toupdate")
    public String toupdate(Integer deptId, Model model){
        //查询所有部门的信息列表
        List<Dept> deptList = deptService.findAllDept();
        model.addAttribute("parentList",deptList);
        Dept dept = deptService.findByDeptId(deptId);
        model.addAttribute("dept",dept);
        //基于deptId去查询对应的部门信息，做回显数据准备
        return  "/sysadmin/dept/jDeptUpdate";
    }

    @RequestMapping("/update")
    public  String updateDept(Dept dept){
        //保存部门修改信息
        Integer i =deptService.updateDeptById(dept);
        return  "redirect:/sysadmin/dept/list";
    }

}
