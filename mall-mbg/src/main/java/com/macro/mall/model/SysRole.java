package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysRole implements Serializable {
    @ApiModelProperty(value = "主键")
    private String id;

    @ApiModelProperty(value = "角色名称")
    private String roleName;

    @ApiModelProperty(value = "角色类型(1系统内置,2用户自定义)")
    private Byte roleType;

    @ApiModelProperty(value = "所属用户类别 100平台/系统 101客户经理 102部门经理 104 员工")
    private Byte roleUserType;

    @ApiModelProperty(value = "角色状态：0启用，1禁用")
    private Byte status;

    @ApiModelProperty(value = "备注")
    private String remarks;

    @ApiModelProperty(value = "录入时间")
    private Date intime;

    @ApiModelProperty(value = "录入人")
    private String inuser;

    @ApiModelProperty(value = "修改人")
    private String updateUser;

    @ApiModelProperty(value = "修改时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Byte getRoleType() {
        return roleType;
    }

    public void setRoleType(Byte roleType) {
        this.roleType = roleType;
    }

    public Byte getRoleUserType() {
        return roleUserType;
    }

    public void setRoleUserType(Byte roleUserType) {
        this.roleUserType = roleUserType;
    }

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public String getInuser() {
        return inuser;
    }

    public void setInuser(String inuser) {
        this.inuser = inuser;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleName=").append(roleName);
        sb.append(", roleType=").append(roleType);
        sb.append(", roleUserType=").append(roleUserType);
        sb.append(", status=").append(status);
        sb.append(", remarks=").append(remarks);
        sb.append(", intime=").append(intime);
        sb.append(", inuser=").append(inuser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}