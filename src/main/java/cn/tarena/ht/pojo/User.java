package cn.tarena.ht.pojo;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    /* user与dept是一对一关系 */
    private Dept dept;
    /* user与userinfo是一对一关系 */
    private  UserInfo userInfo;
    /* 用户id */
    private  String userId;
    /* 部门id */
    private  String deptId;
    /*用户名 */
    private  String username;
    /* 用户密码 */
    private  String password;
    /* 状态 */
    private  Integer state;
    /* 创建人 */
    private  String   createBy;
    /* 创建部门 */
    private  String   createDept;
    /* 创建时间 */
    private  Date   createTime;
    /* 修改人 */
    private  String updateBy;
    /* 修改时间 */
    private  Date   updateTime;

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

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
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

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getCreateDept() {
        return createDept;
    }

    public void setCreateDept(String createDept) {
        this.createDept = createDept;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }




}
