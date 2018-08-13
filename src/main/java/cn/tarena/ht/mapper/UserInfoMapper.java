package cn.tarena.ht.mapper;

import cn.tarena.ht.pojo.UserInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserInfoMapper {

    public List<UserInfo> findAllUserInfo();

    //入库userInfo用户拓展信息表
    public  Integer saveUserInfo(UserInfo  userInfo);

    //修改userinfo的用户拓展信息表
    public  Integer updateUserInfo(UserInfo userInfo);

    //删除userInfo用户拓展信息表
    public  Integer deleteUserInfo(@Param("userIds") String[] userIs);

}
