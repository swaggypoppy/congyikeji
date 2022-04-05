package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class ScOrderInfo implements Serializable {
    @ApiModelProperty(value = "主键id")
    private Integer id;

    @ApiModelProperty(value = "订单编号")
    private String orderNumber;

    @ApiModelProperty(value = "产品id 关联sc_product_info.id")
    private Integer productId;

    @ApiModelProperty(value = "产品名称")
    private String productName;

    @ApiModelProperty(value = "产品类型 1通信 2通信自定义 3企融-抵押 4企融-信用 5企融自定义")
    private Byte productType;

    @ApiModelProperty(value = "公司抬头")
    private String comTitle;

    @ApiModelProperty(value = "联系方式")
    private String phoneNumber;

    @ApiModelProperty(value = "公司地址")
    private String comAddress;

    @ApiModelProperty(value = "联系人名称")
    private String customerName;

    @ApiModelProperty(value = "客户id")
    private String customerId;

    @ApiModelProperty(value = "客户经理id")
    private String manageUserId;

    @ApiModelProperty(value = "订单状态 1 待受理，2受理中，3已完成，4已关闭")
    private Byte orderStatus;

    @ApiModelProperty(value = "创建人")
    private String inuser;

    @ApiModelProperty(value = "创建时间")
    private Date intime;

    @ApiModelProperty(value = "更新人")
    private String updateUser;

    @ApiModelProperty(value = "更新时间")
    private Date updateTime;

    @ApiModelProperty(value = "备注")
    private String remark;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
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

    public String getComTitle() {
        return comTitle;
    }

    public void setComTitle(String comTitle) {
        this.comTitle = comTitle;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getComAddress() {
        return comAddress;
    }

    public void setComAddress(String comAddress) {
        this.comAddress = comAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getManageUserId() {
        return manageUserId;
    }

    public void setManageUserId(String manageUserId) {
        this.manageUserId = manageUserId;
    }

    public Byte getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Byte orderStatus) {
        this.orderStatus = orderStatus;
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderNumber=").append(orderNumber);
        sb.append(", productId=").append(productId);
        sb.append(", productName=").append(productName);
        sb.append(", productType=").append(productType);
        sb.append(", comTitle=").append(comTitle);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", comAddress=").append(comAddress);
        sb.append(", customerName=").append(customerName);
        sb.append(", customerId=").append(customerId);
        sb.append(", manageUserId=").append(manageUserId);
        sb.append(", orderStatus=").append(orderStatus);
        sb.append(", inuser=").append(inuser);
        sb.append(", intime=").append(intime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}