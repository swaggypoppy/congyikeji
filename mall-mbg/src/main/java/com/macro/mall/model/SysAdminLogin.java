package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysAdminLogin implements Serializable {
    private String id;

    @ApiModelProperty(value = "用户ＩＤ")
    private String userId;

    @ApiModelProperty(value = "登录Token")
    private String token;

    @ApiModelProperty(value = "是否可用, 0可用， 1不可用")
    private Byte isuse;

    @ApiModelProperty(value = "登陆名")
    private String loginName;

    @ApiModelProperty(value = "姓名")
    private String userName;

    @ApiModelProperty(value = "手机号")
    private String mobileNum;

    @ApiModelProperty(value = "用户类别 100平台")
    private Byte userType;

    @ApiModelProperty(value = "年份")
    private String loginYear;

    @ApiModelProperty(value = "月份")
    private String loginMonth;

    @ApiModelProperty(value = "Token过期时间")
    private Date expireTime;

    @ApiModelProperty(value = "Token禁用时间")
    private Date disableTime;

    @ApiModelProperty(value = "1账号在其他设备登录，2修改了账号密码，3管理后台关闭该账号")
    private Byte disableType;

    @ApiModelProperty(value = "登陆时间")
    private Date intime;

    @ApiModelProperty(value = "Ip地址")
    private String ipAddress;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Byte getIsuse() {
        return isuse;
    }

    public void setIsuse(Byte isuse) {
        this.isuse = isuse;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getMobileNum() {
        return mobileNum;
    }

    public void setMobileNum(String mobileNum) {
        this.mobileNum = mobileNum;
    }

    public Byte getUserType() {
        return userType;
    }

    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    public String getLoginYear() {
        return loginYear;
    }

    public void setLoginYear(String loginYear) {
        this.loginYear = loginYear;
    }

    public String getLoginMonth() {
        return loginMonth;
    }

    public void setLoginMonth(String loginMonth) {
        this.loginMonth = loginMonth;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public Date getDisableTime() {
        return disableTime;
    }

    public void setDisableTime(Date disableTime) {
        this.disableTime = disableTime;
    }

    public Byte getDisableType() {
        return disableType;
    }

    public void setDisableType(Byte disableType) {
        this.disableType = disableType;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", token=").append(token);
        sb.append(", isuse=").append(isuse);
        sb.append(", loginName=").append(loginName);
        sb.append(", userName=").append(userName);
        sb.append(", mobileNum=").append(mobileNum);
        sb.append(", userType=").append(userType);
        sb.append(", loginYear=").append(loginYear);
        sb.append(", loginMonth=").append(loginMonth);
        sb.append(", expireTime=").append(expireTime);
        sb.append(", disableTime=").append(disableTime);
        sb.append(", disableType=").append(disableType);
        sb.append(", intime=").append(intime);
        sb.append(", ipAddress=").append(ipAddress);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}