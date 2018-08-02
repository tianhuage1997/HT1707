package cn.tarena.ht.pojo;

/**
 * 部门表dept
 */
public class Dept   extends  BaseEntity {
    /* 部门id*/
    private String deptId;


    /* 上属部门id*/
    private Dept parentId;
    /* 部门名称*/
    private String deptName;
    /* 状态id*/
    private Integer state;



    public Dept getParentId() {
        return parentId;
    }

    public void setParentId(Dept parentId) {
        this.parentId = parentId;
    }


    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }



    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }



}
