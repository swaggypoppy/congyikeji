package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ScProductInfo implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "产品名称")
    private String productName;

    @ApiModelProperty(value = "产品类型 1通信 2通信自定义 3金融 4金融自定义")
    private Byte productType;

    @ApiModelProperty(value = "产品详情")
    private String productInfo;

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

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Byte getProductType() {
        return productType;
    }

    public void setProductType(Byte productType) {
        this.productType = productType;
    }

    public String getProductInfo() {
        return productInfo;
    }

    public void setProductInfo(String productInfo) {
        this.productInfo = productInfo;
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
        sb.append(", productName=").append(productName);
        sb.append(", productType=").append(productType);
        sb.append(", productInfo=").append(productInfo);
        sb.append(", inuser=").append(inuser);
        sb.append(", intime=").append(intime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}