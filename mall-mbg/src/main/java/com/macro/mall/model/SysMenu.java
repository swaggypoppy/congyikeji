package com.macro.mall.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SysMenu implements Serializable {
    @ApiModelProperty(value = "主键")
    private String id;

    @ApiModelProperty(value = "菜单名称")
    private String menuName;

    @ApiModelProperty(value = "菜单层级， 一级菜单为1，二级菜单为2，最大支持到4")
    private Byte menuLevel;

    @ApiModelProperty(value = "菜单类型：1文件夹 2页面 3按钮")
    private Byte menuType;

    @ApiModelProperty(value = "父菜单")
    private String parentId;

    @ApiModelProperty(value = "菜单排序")
    private Integer menuSort;

    @ApiModelProperty(value = "图标url")
    private String iconUrl;

    @ApiModelProperty(value = "菜单功能链接，如果是原生页面，当菜单类型为“页面”时，该字段为页面code，需要与前端保持一致")
    private String menuUrl;

    @ApiModelProperty(value = "按钮code")
    private String menuCode;

    @ApiModelProperty(value = "当菜单类型为按钮时，1查看，2新增，3编辑，4导出，5其他")
    private Byte roleType;

    @ApiModelProperty(value = "是否可见 1可见(正常) 0不可见(停用), 对应管理后台操作是 “开启”，“关闭”操作")
    private Byte visible;

    @ApiModelProperty(value = "菜单层级路径（逗号分隔）上级菜单在前下级菜单在后")
    private String menuPath;

    @ApiModelProperty(value = "录入时间")
    private Date intime;

    @ApiModelProperty(value = "录入用户")
    private String inuser;

    @ApiModelProperty(value = "最后一次修改时间")
    private Date updateTime;

    @ApiModelProperty(value = "最后一次修改人")
    private String updateUser;

    private static final long serialVersionUID = 1L;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public Byte getMenuLevel() {
        return menuLevel;
    }

    public void setMenuLevel(Byte menuLevel) {
        this.menuLevel = menuLevel;
    }

    public Byte getMenuType() {
        return menuType;
    }

    public void setMenuType(Byte menuType) {
        this.menuType = menuType;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getMenuSort() {
        return menuSort;
    }

    public void setMenuSort(Integer menuSort) {
        this.menuSort = menuSort;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getMenuUrl() {
        return menuUrl;
    }

    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode;
    }

    public Byte getRoleType() {
        return roleType;
    }

    public void setRoleType(Byte roleType) {
        this.roleType = roleType;
    }

    public Byte getVisible() {
        return visible;
    }

    public void setVisible(Byte visible) {
        this.visible = visible;
    }

    public String getMenuPath() {
        return menuPath;
    }

    public void setMenuPath(String menuPath) {
        this.menuPath = menuPath;
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

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getUpdateUser() {
        return updateUser;
    }

    public void setUpdateUser(String updateUser) {
        this.updateUser = updateUser;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", menuName=").append(menuName);
        sb.append(", menuLevel=").append(menuLevel);
        sb.append(", menuType=").append(menuType);
        sb.append(", parentId=").append(parentId);
        sb.append(", menuSort=").append(menuSort);
        sb.append(", iconUrl=").append(iconUrl);
        sb.append(", menuUrl=").append(menuUrl);
        sb.append(", menuCode=").append(menuCode);
        sb.append(", roleType=").append(roleType);
        sb.append(", visible=").append(visible);
        sb.append(", menuPath=").append(menuPath);
        sb.append(", intime=").append(intime);
        sb.append(", inuser=").append(inuser);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", updateUser=").append(updateUser);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}