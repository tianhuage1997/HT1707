package cn.tarena.ht.service.impl;

import cn.tarena.ht.mapper.DeptMapper;
import cn.tarena.ht.pojo.Dept;
import cn.tarena.ht.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

@Service
public class DeptServiceImpl  implements DeptService {

    @Autowired(required = true)
    private DeptMapper deptMapper;

    public List<Dept> findAllDept() {
        List<Dept>   deptList=deptMapper.findAllDept();
        return deptList;
    }

    public Integer stopByDeptId(Integer[] deptIds) {
        Integer i=deptMapper.updateStatusByDeptId(deptIds);
        return i;
    }

    public Integer startByDeptId(Integer[] deptIds) {
        Integer i =deptMapper.updateStartByDeptId(deptIds);
        return  i;
    }

    public Integer deleteDeptByDeptId(Integer[] deptIds) {
        Integer i =deptMapper.deleteDeptByDeptId(deptIds);
        return i;
    }

    public void saveDept(Dept dept) {
         
        dept.setCreateTime(new Date());
        dept.setUpdateTime(dept.getCreateTime());
        deptMapper.saveDept(dept);
    }

    public Dept findByDeptId(Integer deptId) {
        Dept dept =new Dept();
        dept = deptMapper.findByDeptId(deptId);
        return dept;
    }

    public Integer updateDeptById(Dept dept) {
        Integer i = deptMapper.updateDept(dept);
        return i;
    }
}
