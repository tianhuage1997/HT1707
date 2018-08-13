package cn.tarena.ht.service.impl;

import cn.tarena.ht.mapper.UserInfoMapper;
import cn.tarena.ht.mapper.UserMapper;
import cn.tarena.ht.pojo.User;
import cn.tarena.ht.pojo.UserInfo;
import cn.tarena.ht.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl  implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<User> findAllUser() {
        List<User>  userList = userMapper.findAllUser();
        return userList;
    }

    public List<UserInfo> findUserList() {
        List<UserInfo> userInfoList = userInfoMapper.findAllUserInfo();
        return  userInfoList ;
    }

    public Integer saveUser(User user) {
        Integer i = userMapper.saveUser(user);
        return i;
    }

    public Integer savaUserInfo(UserInfo userInfo) {
        Integer i = userInfoMapper.saveUserInfo(userInfo);
        return i;
    }

    public User findUserById(String userId) {
        User user =new User();
        user = userMapper.findUserById(userId);
        return user;
    }

    public Integer updateUser(User user) {
        Integer i = userMapper.updateUser(user);
        //通过user去取的userInfo对象
        UserInfo userInfo = user.getUserInfo();
        //补充userinfo对象的字段
        userInfo.setUserInfoId(user.getUserId());
        userInfo.setCreateTime(user.getCreateTime());
        userInfo.setUpdateTime(new Date());
        System.out.println(userInfo);
        Integer j  = userInfoMapper.updateUserInfo(userInfo);
        return i;
    }

    public Integer deleteUser(String[] userIds) {
        Integer i = userMapper.deleteUser(userIds);
        Integer j = userInfoMapper.deleteUserInfo(userIds);
        return i+j;
    }
}
