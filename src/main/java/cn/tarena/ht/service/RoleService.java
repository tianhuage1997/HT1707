package cn.tarena.ht.service;

import cn.tarena.ht.pojo.Role;

import java.util.List;

public interface RoleService {

    public List<Role> findAllRole();

    //保存用户角色信息
    public  Integer saveRole(Role role);

    //保存新增的用户角色
    public  void saveUserRole(String userId,String[] roleIds);
}
