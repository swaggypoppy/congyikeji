package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysAdminUser implements Serializable {
    @ApiModelProperty(value = "主键")
    private String id;

    @ApiModelProperty(value = "姓名")
    private String userName;

    @ApiModelProperty(value = "登陆名")
    private String loginName;

    @ApiModelProperty(value = "密码")
    private String loginPwd;

    @ApiModelProperty(value = "手机号")
    private String mobileNum;

    @ApiModelProperty(value = "用户头像")
    private String headPicName;

    @ApiModelProperty(value = "关联角色")
    private String roleId;

    @ApiModelProperty(value = "状态1正常，0停用")
    private Byte adminStatus;

    @ApiModelProperty(value = "担任职务")
    private String adminDuty;

    @ApiModelProperty(value = "用户类别 100平台/系统 101客户经理 102部门经理 104 员工")
    private Byte userType;

    @ApiModelProperty(value = "业务平台id")
    private String platformId;

    @ApiModelProperty(value = "对应业务平台的用户id")
    private String externalAdminUserId;

    @ApiModelProperty(value = "对应业务平台的用户姓名+登录名")
    private String externalAdminUserName;

    @ApiModelProperty(value = "上一次密码修改时间")
    private Date passwordUpdateTime;

    @ApiModelProperty(value = "录入时间")
    private Date intime;

    @ApiModelProperty(value = "录入用户")
    private String inuser;

    @ApiModelProperty(value = "更新人")
    private String updateUser;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "登录次数")
    private Integer loginCnt;

    @ApiModelProperty(value = "最近登录时间")
    private Date latestLoginTime;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public String getHeadPicName() {
        return headPicName;
    }

    public void setHeadPicName(String headPicName) {
        this.headPicName = headPicName;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public Byte getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(Byte adminStatus) {
        this.adminStatus = adminStatus;
    }

    public String getAdminDuty() {
        return adminDuty;
    }

    public void setAdminDuty(String adminDuty) {
        this.adminDuty = adminDuty;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public String getPlatformId() {
        return platformId;
    }

    public void setPlatformId(String platformId) {
        this.platformId = platformId;
    }

    public String getExternalAdminUserId() {
        return externalAdminUserId;
    }

    public void setExternalAdminUserId(String externalAdminUserId) {
        this.externalAdminUserId = externalAdminUserId;
    }

    public String getExternalAdminUserName() {
        return externalAdminUserName;
    }

    public void setExternalAdminUserName(String externalAdminUserName) {
        this.externalAdminUserName = externalAdminUserName;
    }

    public Date getPasswordUpdateTime() {
        return passwordUpdateTime;
    }

    public void setPasswordUpdateTime(Date passwordUpdateTime) {
        this.passwordUpdateTime = passwordUpdateTime;
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

    public Integer getLoginCnt() {
        return loginCnt;
    }

    public void setLoginCnt(Integer loginCnt) {
        this.loginCnt = loginCnt;
    }

    public Date getLatestLoginTime() {
        return latestLoginTime;
    }

    public void setLatestLoginTime(Date latestLoginTime) {
        this.latestLoginTime = latestLoginTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", loginName=").append(loginName);
        sb.append(", loginPwd=").append(loginPwd);
        sb.append(", mobileNum=").append(mobileNum);
        sb.append(", headPicName=").append(headPicName);
        sb.append(", roleId=").append(roleId);
        sb.append(", adminStatus=").append(adminStatus);
        sb.append(", adminDuty=").append(adminDuty);
        sb.append(", userType=").append(userType);
        sb.append(", platformId=").append(platformId);
        sb.append(", externalAdminUserId=").append(externalAdminUserId);
        sb.append(", externalAdminUserName=").append(externalAdminUserName);
        sb.append(", passwordUpdateTime=").append(passwordUpdateTime);
        sb.append(", intime=").append(intime);
        sb.append(", inuser=").append(inuser);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", loginCnt=").append(loginCnt);
        sb.append(", latestLoginTime=").append(latestLoginTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}