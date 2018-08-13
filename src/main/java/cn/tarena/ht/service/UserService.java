package cn.tarena.ht.service;

import cn.tarena.ht.pojo.User;
import cn.tarena.ht.pojo.UserInfo;

import java.util.List;

public interface UserService {

   public List<User> findAllUser();


   //查询上级部门和id信息
   public  List<UserInfo> findUserList();

   //保存user用户表信息
   public   Integer  saveUser(User  user);

   //保存userInfo用户拓展表信息
   public  Integer savaUserInfo(UserInfo  userInfo);

   //查询user用户表信息
   public  User findUserById(String userId);


   //修改用户信息
    public Integer updateUser(User user);

    //删除用户表user和用户拓展信息表userInfo
   public  Integer deleteUser(String[] userIds);
}
