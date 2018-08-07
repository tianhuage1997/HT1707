package cn.tarena.ht.service;

import cn.tarena.ht.pojo.User;
import cn.tarena.ht.pojo.UserInfo;

import java.util.List;

public interface UserService {

   public List<User> findAllUser();


   //查询上级部门和id信息
   public  List<UserInfo> findUserList();
}
