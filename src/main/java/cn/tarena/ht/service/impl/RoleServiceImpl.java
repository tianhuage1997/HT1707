package cn.tarena.ht.service.impl;

import cn.tarena.ht.mapper.RoleMapper;
import cn.tarena.ht.pojo.Role;
import cn.tarena.ht.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class RoleServiceImpl implements RoleService {


    @Autowired(required = true)
    private RoleMapper roleMapper;

    public List<Role> findAllRole() {
        List<Role> roleList = roleMapper.findAllRole();
        return roleList;
    }

    public Integer saveRole(Role role) {
        role.setRoleId(UUID.randomUUID().toString());
        role.setCreateTime(new Date());
        role.setUpdateTime(role.getCreateTime());
        Integer i = roleMapper.saveRole(role);
        return null;
    }
}
