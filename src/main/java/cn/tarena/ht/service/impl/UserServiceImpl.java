package cn.tarena.ht.service.impl;

import cn.tarena.ht.mapper.UserInfoMapper;
import cn.tarena.ht.mapper.UserMapper;
import cn.tarena.ht.pojo.User;
import cn.tarena.ht.pojo.UserInfo;
import cn.tarena.ht.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
