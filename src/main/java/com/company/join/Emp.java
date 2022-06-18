package com.company.join;

import org.springframework.stereotype.Component;

import java.io.Serializable;

/**
 * 
 * @TableName emp
 */
@Component
public class Emp implements Serializable {
    /**
     * 员工编号
     */
    private Integer eid;

    /**
     * 员工姓名
     */
    private String empName;

    /**
     * 员工性别
     */
    private String sex;

    /**
     * 员工年龄
     */
    private Integer age;

    /**
     * 部门名
     */
    private Integer did;

    private static final long serialVersionUID = 1L;

    /**
     * 员工编号
     */
    public Integer getEid() {
        return eid;
    }

    /**
     * 员工编号
     */
    public void setEid(Integer eid) {
        this.eid = eid;
    }

    /**
     * 员工姓名
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * 员工姓名
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * 员工性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 员工性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 员工年龄
     */
    public Integer getAge() {
        return age;
    }

    /**
     * 员工年龄
     */
    public void setAge(Integer age) {
        this.age = age;
    }

    /**
     * 部门名
     */
    public Integer getDid() {
        return did;
    }

    /**
     * 部门名
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Emp other = (Emp) that;
        return (this.getEid() == null ? other.getEid() == null : this.getEid().equals(other.getEid()))
            && (this.getEmpName() == null ? other.getEmpName() == null : this.getEmpName().equals(other.getEmpName()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getDid() == null ? other.getDid() == null : this.getDid().equals(other.getDid()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEid() == null) ? 0 : getEid().hashCode());
        result = prime * result + ((getEmpName() == null) ? 0 : getEmpName().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getDid() == null) ? 0 : getDid().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", eid=").append(eid);
        sb.append(", empName=").append(empName);
        sb.append(", sex=").append(sex);
        sb.append(", age=").append(age);
        sb.append(", did=").append(did);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}