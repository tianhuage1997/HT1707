package cn.tarena.ht.mapper;


import cn.tarena.ht.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {

   public  List<User> findAllUser();

   public  Integer saveUser( User user);

   public  User findUserById(@Param("userId") String userId);

   public  Integer updateUser(User user);

   public  Integer deleteUser(@Param("userIds") String[] userIds);


}
