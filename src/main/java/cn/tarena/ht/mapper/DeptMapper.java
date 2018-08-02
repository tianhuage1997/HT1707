package cn.tarena.ht.mapper;


import cn.tarena.ht.pojo.Dept;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DeptMapper {
    public List<Dept> findAllDept();

    public Integer updateStatusByDeptId(@Param("deptIds") Integer[] deptIds);

    public  Integer updateStartByDeptId(@Param("deptIds") Integer[] deptIds);

    public  Integer deleteDeptByDeptId(@Param("deptIds") Integer[] deptIds);

    public void     saveDept(Dept dept);

    public  Dept findByDeptId(@Param("deptId") Integer deptId);

    public  Integer updateDept(Dept dept);
}
