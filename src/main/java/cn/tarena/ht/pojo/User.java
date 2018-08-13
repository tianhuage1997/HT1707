package cn.tarena.ht.pojo;

import java.io.Serializable;
import java.util.Date;

public class User   extends BaseEntity  {
    /* user与dept是一对一关系 */
    private Dept dept;
    /* user与userinfo是一对一关系 */
    private  UserInfo userInfo;
    /* 用户id */
    private  String userId;
    /*用户名 */
    private  String username;
    /* 用户密码 */
    private  String password;
    /* 状态 */
    private  Integer state;

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }





}
