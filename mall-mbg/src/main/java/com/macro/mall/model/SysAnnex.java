package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysAnnex implements Serializable {
    private String id;

    private String urlPath;

    @ApiModelProperty(value = "关联id")
    private String refId;

    @ApiModelProperty(value = "类型:1积分商品")
    private Byte type;

    @ApiModelProperty(value = "创建时间")
    private Date intime;

    private Integer width;

    private Integer height;

    @ApiModelProperty(value = "创建人")
    private String inuser;

    @ApiModelProperty(value = "备注")
    private String remark;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrlPath() {
        return urlPath;
    }

    public void setUrlPath(String urlPath) {
        this.urlPath = urlPath;
    }

    public String getRefId() {
        return refId;
    }

    public void setRefId(String refId) {
        this.refId = refId;
    }

    public Byte getType() {
        return type;
    }

    public void setType(Byte type) {
        this.type = type;
    }

    public Date getIntime() {
        return intime;
    }

    public void setIntime(Date intime) {
        this.intime = intime;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getInuser() {
        return inuser;
    }

    public void setInuser(String inuser) {
        this.inuser = inuser;
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
        sb.append(", urlPath=").append(urlPath);
        sb.append(", refId=").append(refId);
        sb.append(", type=").append(type);
        sb.append(", intime=").append(intime);
        sb.append(", width=").append(width);
        sb.append(", height=").append(height);
        sb.append(", inuser=").append(inuser);
        sb.append(", remark=").append(remark);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}