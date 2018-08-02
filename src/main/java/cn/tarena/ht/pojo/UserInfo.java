package cn.tarena.ht.pojo;

import java.io.Serializable;
import java.util.Date;

public class UserInfo   implements Serializable {

    /* 用户id  */
    private	String	userInfoId	;
    /*  真实姓名 */
    private	String	name	;
    /*  身份证号 */
    private	String	cardNo	;
    /*  直属领导 */
    private	String	managerId	;
    /*  入职时间 */
    private Date joinDate	;
    /*  薪水 */
    private	Integer	salary	;
    /*  生日 */
    private	Date	birthday	;
    /*  性别 */
    private	String	gender	;
    /*  岗位 */
    private	String	station	;
    /*  电话 */
    private	String	telephone	;
    /*  等级 */
    private	String	userLevel	;
    /*  说明 */
    private	String	remark	;
    /*  排序号 */
    private	Integer	orderNo	;
    /*  创建人 */
    private	String	createBy	;
    /*  创建部门 */
    private	String	createDept	;
    /*  创建日期 */
    private	Date	createTime	;
    /*  修改人 */
    private	String	updateBy	;
    /*  修改时间 */
    private	Date	updateTime	;

    public String getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(String userInfoId) {
        this.userInfoId = userInfoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public Date getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(Date joinDate) {
        this.joinDate = joinDate;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getStation() {
        return station;
    }

    public void setStation(String station) {
        this.station = station;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getUserLevel() {
        return userLevel;
    }

    public void setUserLevel(String userLevel) {
        this.userLevel = userLevel;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
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
