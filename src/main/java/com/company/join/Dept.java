package com.company.join;

import java.io.Serializable;

/**
 * 
 * @TableName dept
 */
public class Dept implements Serializable {
    /**
     * 部门id
     */
    private Integer did;

    /**
     * 部门名
     */
    private String deptName;

    private static final long serialVersionUID = 1L;

    /**
     * 部门id
     */
    public Integer getDid() {
        return did;
    }

    /**
     * 部门id
     */
    public void setDid(Integer did) {
        this.did = did;
    }

    /**
     * 部门名
     */
    public String getDeptName() {
        return deptName;
    }

    /**
     * 部门名
     */
    public void setDeptName(String deptName) {
        this.deptName = deptName;
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
        Dept other = (Dept) that;
        return (this.getDid() == null ? other.getDid() == null : this.getDid().equals(other.getDid()))
            && (this.getDeptName() == null ? other.getDeptName() == null : this.getDeptName().equals(other.getDeptName()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDid() == null) ? 0 : getDid().hashCode());
        result = prime * result + ((getDeptName() == null) ? 0 : getDeptName().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", did=").append(did);
        sb.append(", deptName=").append(deptName);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}