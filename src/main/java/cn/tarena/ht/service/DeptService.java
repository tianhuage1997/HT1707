package cn.tarena.ht.service;

import cn.tarena.ht.pojo.Dept;

import java.util.List;

public interface DeptService {

    public  List<Dept> findAllDept();

    public  Integer stopByDeptId(Integer[] deptIds);

    public  Integer startByDeptId(Integer[] deptIds);

    public  Integer deleteDeptByDeptId(Integer[] deptIds);

    public void saveDept(Dept dept);

    public Dept findByDeptId(Integer deptId);

    public Integer updateDeptById(Dept dept);
}
