package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ScDepInfo implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "部门名称")
    private String depName;

    @ApiModelProperty(value = "1通信 2企融")
    private Byte depType;

    @ApiModelProperty(value = "部门状态 0关闭 1开启")
    private Boolean depStatus;

    @ApiModelProperty(value = "创建人")
    private String inuser;

    @ApiModelProperty(value = "创建时间")
    private Date intime;

    @ApiModelProperty(value = "更新人")
    private String updateUser;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public Byte getDepType() {
        return depType;
    }

    public void setDepType(Byte depType) {
        this.depType = depType;
    }

    public Boolean getDepStatus() {
        return depStatus;
    }

    public void setDepStatus(Boolean depStatus) {
        this.depStatus = depStatus;
    }

    public String getInuser() {
        return inuser;
    }

    public void setInuser(String inuser) {
        this.inuser = inuser;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
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
        sb.append(", depName=").append(depName);
        sb.append(", depType=").append(depType);
        sb.append(", depStatus=").append(depStatus);
        sb.append(", inuser=").append(inuser);
        sb.append(", intime=").append(intime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}