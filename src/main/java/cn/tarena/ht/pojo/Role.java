package cn.tarena.ht.pojo;

public class Role   extends  BaseEntity{
    /* 角色id信息 */
    private  String  roleId;
    /* 角色名称 */
    private  String  name;
    /* 说明 */
    private  String  remarks;
    /* 排序号 */
    private  Integer  orderNo;


    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }


    public String getId(){
         return roleId;
    }


}
