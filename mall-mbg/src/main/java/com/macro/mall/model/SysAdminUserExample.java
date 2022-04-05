package com.macro.mall.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysAdminUserExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysAdminUserExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNull() {
            addCriterion("login_name is null");
            return (Criteria) this;
        }

        public Criteria andLoginNameIsNotNull() {
            addCriterion("login_name is not null");
            return (Criteria) this;
        }

        public Criteria andLoginNameEqualTo(String value) {
            addCriterion("login_name =", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotEqualTo(String value) {
            addCriterion("login_name <>", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThan(String value) {
            addCriterion("login_name >", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("login_name >=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThan(String value) {
            addCriterion("login_name <", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLessThanOrEqualTo(String value) {
            addCriterion("login_name <=", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameLike(String value) {
            addCriterion("login_name like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotLike(String value) {
            addCriterion("login_name not like", value, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameIn(List<String> values) {
            addCriterion("login_name in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotIn(List<String> values) {
            addCriterion("login_name not in", values, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameBetween(String value1, String value2) {
            addCriterion("login_name between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginNameNotBetween(String value1, String value2) {
            addCriterion("login_name not between", value1, value2, "loginName");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIsNull() {
            addCriterion("login_pwd is null");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIsNotNull() {
            addCriterion("login_pwd is not null");
            return (Criteria) this;
        }

        public Criteria andLoginPwdEqualTo(String value) {
            addCriterion("login_pwd =", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotEqualTo(String value) {
            addCriterion("login_pwd <>", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdGreaterThan(String value) {
            addCriterion("login_pwd >", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdGreaterThanOrEqualTo(String value) {
            addCriterion("login_pwd >=", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLessThan(String value) {
            addCriterion("login_pwd <", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLessThanOrEqualTo(String value) {
            addCriterion("login_pwd <=", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdLike(String value) {
            addCriterion("login_pwd like", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotLike(String value) {
            addCriterion("login_pwd not like", value, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdIn(List<String> values) {
            addCriterion("login_pwd in", values, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotIn(List<String> values) {
            addCriterion("login_pwd not in", values, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdBetween(String value1, String value2) {
            addCriterion("login_pwd between", value1, value2, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andLoginPwdNotBetween(String value1, String value2) {
            addCriterion("login_pwd not between", value1, value2, "loginPwd");
            return (Criteria) this;
        }

        public Criteria andMobileNumIsNull() {
            addCriterion("mobile_num is null");
            return (Criteria) this;
        }

        public Criteria andMobileNumIsNotNull() {
            addCriterion("mobile_num is not null");
            return (Criteria) this;
        }

        public Criteria andMobileNumEqualTo(String value) {
            addCriterion("mobile_num =", value, "mobileNum");
            return (Criteria) this;
        }

        public Criteria andMobileNumNotEqualTo(String value) {
            addCriterion("mobile_num <>", value, "mobileNum");
            return (Criteria) this;
        }

        public Criteria andMobileNumGreaterThan(String value) {
            addCriterion("mobile_num >", value, "mobileNum");
            return (Criteria) this;
        }

        public Criteria andMobileNumGreaterThanOrEqualTo(String value) {
            addCriterion("mobile_num >=", value, "mobileNum");
            return (Criteria) this;
        }

        public Criteria andMobileNumLessThan(String value) {
            addCriterion("mobile_num <", value, "mobileNum");
            return (Criteria) this;
        }

        public Criteria andMobileNumLessThanOrEqualTo(String value) {
            addCriterion("mobile_num <=", value, "mobileNum");
            return (Criteria) this;
        }

        public Criteria andMobileNumLike(String value) {
            addCriterion("mobile_num like", value, "mobileNum");
            return (Criteria) this;
        }

        public Criteria andMobileNumNotLike(String value) {
            addCriterion("mobile_num not like", value, "mobileNum");
            return (Criteria) this;
        }

        public Criteria andMobileNumIn(List<String> values) {
            addCriterion("mobile_num in", values, "mobileNum");
            return (Criteria) this;
        }

        public Criteria andMobileNumNotIn(List<String> values) {
            addCriterion("mobile_num not in", values, "mobileNum");
            return (Criteria) this;
        }

        public Criteria andMobileNumBetween(String value1, String value2) {
            addCriterion("mobile_num between", value1, value2, "mobileNum");
            return (Criteria) this;
        }

        public Criteria andMobileNumNotBetween(String value1, String value2) {
            addCriterion("mobile_num not between", value1, value2, "mobileNum");
            return (Criteria) this;
        }

        public Criteria andHeadPicNameIsNull() {
            addCriterion("head_pic_name is null");
            return (Criteria) this;
        }

        public Criteria andHeadPicNameIsNotNull() {
            addCriterion("head_pic_name is not null");
            return (Criteria) this;
        }

        public Criteria andHeadPicNameEqualTo(String value) {
            addCriterion("head_pic_name =", value, "headPicName");
            return (Criteria) this;
        }

        public Criteria andHeadPicNameNotEqualTo(String value) {
            addCriterion("head_pic_name <>", value, "headPicName");
            return (Criteria) this;
        }

        public Criteria andHeadPicNameGreaterThan(String value) {
            addCriterion("head_pic_name >", value, "headPicName");
            return (Criteria) this;
        }

        public Criteria andHeadPicNameGreaterThanOrEqualTo(String value) {
            addCriterion("head_pic_name >=", value, "headPicName");
            return (Criteria) this;
        }

        public Criteria andHeadPicNameLessThan(String value) {
            addCriterion("head_pic_name <", value, "headPicName");
            return (Criteria) this;
        }

        public Criteria andHeadPicNameLessThanOrEqualTo(String value) {
            addCriterion("head_pic_name <=", value, "headPicName");
            return (Criteria) this;
        }

        public Criteria andHeadPicNameLike(String value) {
            addCriterion("head_pic_name like", value, "headPicName");
            return (Criteria) this;
        }

        public Criteria andHeadPicNameNotLike(String value) {
            addCriterion("head_pic_name not like", value, "headPicName");
            return (Criteria) this;
        }

        public Criteria andHeadPicNameIn(List<String> values) {
            addCriterion("head_pic_name in", values, "headPicName");
            return (Criteria) this;
        }

        public Criteria andHeadPicNameNotIn(List<String> values) {
            addCriterion("head_pic_name not in", values, "headPicName");
            return (Criteria) this;
        }

        public Criteria andHeadPicNameBetween(String value1, String value2) {
            addCriterion("head_pic_name between", value1, value2, "headPicName");
            return (Criteria) this;
        }

        public Criteria andHeadPicNameNotBetween(String value1, String value2) {
            addCriterion("head_pic_name not between", value1, value2, "headPicName");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNull() {
            addCriterion("role_id is null");
            return (Criteria) this;
        }

        public Criteria andRoleIdIsNotNull() {
            addCriterion("role_id is not null");
            return (Criteria) this;
        }

        public Criteria andRoleIdEqualTo(String value) {
            addCriterion("role_id =", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotEqualTo(String value) {
            addCriterion("role_id <>", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThan(String value) {
            addCriterion("role_id >", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdGreaterThanOrEqualTo(String value) {
            addCriterion("role_id >=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThan(String value) {
            addCriterion("role_id <", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLessThanOrEqualTo(String value) {
            addCriterion("role_id <=", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdLike(String value) {
            addCriterion("role_id like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotLike(String value) {
            addCriterion("role_id not like", value, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdIn(List<String> values) {
            addCriterion("role_id in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotIn(List<String> values) {
            addCriterion("role_id not in", values, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdBetween(String value1, String value2) {
            addCriterion("role_id between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andRoleIdNotBetween(String value1, String value2) {
            addCriterion("role_id not between", value1, value2, "roleId");
            return (Criteria) this;
        }

        public Criteria andAdminStatusIsNull() {
            addCriterion("admin_status is null");
            return (Criteria) this;
        }

        public Criteria andAdminStatusIsNotNull() {
            addCriterion("admin_status is not null");
            return (Criteria) this;
        }

        public Criteria andAdminStatusEqualTo(Byte value) {
            addCriterion("admin_status =", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusNotEqualTo(Byte value) {
            addCriterion("admin_status <>", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusGreaterThan(Byte value) {
            addCriterion("admin_status >", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("admin_status >=", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusLessThan(Byte value) {
            addCriterion("admin_status <", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusLessThanOrEqualTo(Byte value) {
            addCriterion("admin_status <=", value, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusIn(List<Byte> values) {
            addCriterion("admin_status in", values, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusNotIn(List<Byte> values) {
            addCriterion("admin_status not in", values, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusBetween(Byte value1, Byte value2) {
            addCriterion("admin_status between", value1, value2, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("admin_status not between", value1, value2, "adminStatus");
            return (Criteria) this;
        }

        public Criteria andAdminDutyIsNull() {
            addCriterion("admin_duty is null");
            return (Criteria) this;
        }

        public Criteria andAdminDutyIsNotNull() {
            addCriterion("admin_duty is not null");
            return (Criteria) this;
        }

        public Criteria andAdminDutyEqualTo(String value) {
            addCriterion("admin_duty =", value, "adminDuty");
            return (Criteria) this;
        }

        public Criteria andAdminDutyNotEqualTo(String value) {
            addCriterion("admin_duty <>", value, "adminDuty");
            return (Criteria) this;
        }

        public Criteria andAdminDutyGreaterThan(String value) {
            addCriterion("admin_duty >", value, "adminDuty");
            return (Criteria) this;
        }

        public Criteria andAdminDutyGreaterThanOrEqualTo(String value) {
            addCriterion("admin_duty >=", value, "adminDuty");
            return (Criteria) this;
        }

        public Criteria andAdminDutyLessThan(String value) {
            addCriterion("admin_duty <", value, "adminDuty");
            return (Criteria) this;
        }

        public Criteria andAdminDutyLessThanOrEqualTo(String value) {
            addCriterion("admin_duty <=", value, "adminDuty");
            return (Criteria) this;
        }

        public Criteria andAdminDutyLike(String value) {
            addCriterion("admin_duty like", value, "adminDuty");
            return (Criteria) this;
        }

        public Criteria andAdminDutyNotLike(String value) {
            addCriterion("admin_duty not like", value, "adminDuty");
            return (Criteria) this;
        }

        public Criteria andAdminDutyIn(List<String> values) {
            addCriterion("admin_duty in", values, "adminDuty");
            return (Criteria) this;
        }

        public Criteria andAdminDutyNotIn(List<String> values) {
            addCriterion("admin_duty not in", values, "adminDuty");
            return (Criteria) this;
        }

        public Criteria andAdminDutyBetween(String value1, String value2) {
            addCriterion("admin_duty between", value1, value2, "adminDuty");
            return (Criteria) this;
        }

        public Criteria andAdminDutyNotBetween(String value1, String value2) {
            addCriterion("admin_duty not between", value1, value2, "adminDuty");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNull() {
            addCriterion("user_type is null");
            return (Criteria) this;
        }

        public Criteria andUserTypeIsNotNull() {
            addCriterion("user_type is not null");
            return (Criteria) this;
        }

        public Criteria andUserTypeEqualTo(Byte value) {
            addCriterion("user_type =", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotEqualTo(Byte value) {
            addCriterion("user_type <>", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThan(Byte value) {
            addCriterion("user_type >", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("user_type >=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThan(Byte value) {
            addCriterion("user_type <", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeLessThanOrEqualTo(Byte value) {
            addCriterion("user_type <=", value, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeIn(List<Byte> values) {
            addCriterion("user_type in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotIn(List<Byte> values) {
            addCriterion("user_type not in", values, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeBetween(Byte value1, Byte value2) {
            addCriterion("user_type between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andUserTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("user_type not between", value1, value2, "userType");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNull() {
            addCriterion("platform_id is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIsNotNull() {
            addCriterion("platform_id is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformIdEqualTo(String value) {
            addCriterion("platform_id =", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotEqualTo(String value) {
            addCriterion("platform_id <>", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThan(String value) {
            addCriterion("platform_id >", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdGreaterThanOrEqualTo(String value) {
            addCriterion("platform_id >=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThan(String value) {
            addCriterion("platform_id <", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLessThanOrEqualTo(String value) {
            addCriterion("platform_id <=", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdLike(String value) {
            addCriterion("platform_id like", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotLike(String value) {
            addCriterion("platform_id not like", value, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdIn(List<String> values) {
            addCriterion("platform_id in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotIn(List<String> values) {
            addCriterion("platform_id not in", values, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdBetween(String value1, String value2) {
            addCriterion("platform_id between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andPlatformIdNotBetween(String value1, String value2) {
            addCriterion("platform_id not between", value1, value2, "platformId");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserIdIsNull() {
            addCriterion("external_admin_user_id is null");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserIdIsNotNull() {
            addCriterion("external_admin_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserIdEqualTo(String value) {
            addCriterion("external_admin_user_id =", value, "externalAdminUserId");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserIdNotEqualTo(String value) {
            addCriterion("external_admin_user_id <>", value, "externalAdminUserId");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserIdGreaterThan(String value) {
            addCriterion("external_admin_user_id >", value, "externalAdminUserId");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("external_admin_user_id >=", value, "externalAdminUserId");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserIdLessThan(String value) {
            addCriterion("external_admin_user_id <", value, "externalAdminUserId");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserIdLessThanOrEqualTo(String value) {
            addCriterion("external_admin_user_id <=", value, "externalAdminUserId");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserIdLike(String value) {
            addCriterion("external_admin_user_id like", value, "externalAdminUserId");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserIdNotLike(String value) {
            addCriterion("external_admin_user_id not like", value, "externalAdminUserId");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserIdIn(List<String> values) {
            addCriterion("external_admin_user_id in", values, "externalAdminUserId");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserIdNotIn(List<String> values) {
            addCriterion("external_admin_user_id not in", values, "externalAdminUserId");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserIdBetween(String value1, String value2) {
            addCriterion("external_admin_user_id between", value1, value2, "externalAdminUserId");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserIdNotBetween(String value1, String value2) {
            addCriterion("external_admin_user_id not between", value1, value2, "externalAdminUserId");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserNameIsNull() {
            addCriterion("external_admin_user_name is null");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserNameIsNotNull() {
            addCriterion("external_admin_user_name is not null");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserNameEqualTo(String value) {
            addCriterion("external_admin_user_name =", value, "externalAdminUserName");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserNameNotEqualTo(String value) {
            addCriterion("external_admin_user_name <>", value, "externalAdminUserName");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserNameGreaterThan(String value) {
            addCriterion("external_admin_user_name >", value, "externalAdminUserName");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("external_admin_user_name >=", value, "externalAdminUserName");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserNameLessThan(String value) {
            addCriterion("external_admin_user_name <", value, "externalAdminUserName");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserNameLessThanOrEqualTo(String value) {
            addCriterion("external_admin_user_name <=", value, "externalAdminUserName");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserNameLike(String value) {
            addCriterion("external_admin_user_name like", value, "externalAdminUserName");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserNameNotLike(String value) {
            addCriterion("external_admin_user_name not like", value, "externalAdminUserName");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserNameIn(List<String> values) {
            addCriterion("external_admin_user_name in", values, "externalAdminUserName");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserNameNotIn(List<String> values) {
            addCriterion("external_admin_user_name not in", values, "externalAdminUserName");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserNameBetween(String value1, String value2) {
            addCriterion("external_admin_user_name between", value1, value2, "externalAdminUserName");
            return (Criteria) this;
        }

        public Criteria andExternalAdminUserNameNotBetween(String value1, String value2) {
            addCriterion("external_admin_user_name not between", value1, value2, "externalAdminUserName");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeIsNull() {
            addCriterion("password_update_time is null");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeIsNotNull() {
            addCriterion("password_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeEqualTo(Date value) {
            addCriterion("password_update_time =", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeNotEqualTo(Date value) {
            addCriterion("password_update_time <>", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeGreaterThan(Date value) {
            addCriterion("password_update_time >", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("password_update_time >=", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeLessThan(Date value) {
            addCriterion("password_update_time <", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("password_update_time <=", value, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeIn(List<Date> values) {
            addCriterion("password_update_time in", values, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeNotIn(List<Date> values) {
            addCriterion("password_update_time not in", values, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("password_update_time between", value1, value2, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andPasswordUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("password_update_time not between", value1, value2, "passwordUpdateTime");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNull() {
            addCriterion("intime is null");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNotNull() {
            addCriterion("intime is not null");
            return (Criteria) this;
        }

        public Criteria andIntimeEqualTo(Date value) {
            addCriterion("intime =", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotEqualTo(Date value) {
            addCriterion("intime <>", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThan(Date value) {
            addCriterion("intime >", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThanOrEqualTo(Date value) {
            addCriterion("intime >=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThan(Date value) {
            addCriterion("intime <", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThanOrEqualTo(Date value) {
            addCriterion("intime <=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeIn(List<Date> values) {
            addCriterion("intime in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotIn(List<Date> values) {
            addCriterion("intime not in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeBetween(Date value1, Date value2) {
            addCriterion("intime between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotBetween(Date value1, Date value2) {
            addCriterion("intime not between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andInuserIsNull() {
            addCriterion("inuser is null");
            return (Criteria) this;
        }

        public Criteria andInuserIsNotNull() {
            addCriterion("inuser is not null");
            return (Criteria) this;
        }

        public Criteria andInuserEqualTo(String value) {
            addCriterion("inuser =", value, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserNotEqualTo(String value) {
            addCriterion("inuser <>", value, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserGreaterThan(String value) {
            addCriterion("inuser >", value, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserGreaterThanOrEqualTo(String value) {
            addCriterion("inuser >=", value, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserLessThan(String value) {
            addCriterion("inuser <", value, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserLessThanOrEqualTo(String value) {
            addCriterion("inuser <=", value, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserLike(String value) {
            addCriterion("inuser like", value, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserNotLike(String value) {
            addCriterion("inuser not like", value, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserIn(List<String> values) {
            addCriterion("inuser in", values, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserNotIn(List<String> values) {
            addCriterion("inuser not in", values, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserBetween(String value1, String value2) {
            addCriterion("inuser between", value1, value2, "inuser");
            return (Criteria) this;
        }

        public Criteria andInuserNotBetween(String value1, String value2) {
            addCriterion("inuser not between", value1, value2, "inuser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNull() {
            addCriterion("update_user is null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIsNotNull() {
            addCriterion("update_user is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateUserEqualTo(String value) {
            addCriterion("update_user =", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotEqualTo(String value) {
            addCriterion("update_user <>", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThan(String value) {
            addCriterion("update_user >", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserGreaterThanOrEqualTo(String value) {
            addCriterion("update_user >=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThan(String value) {
            addCriterion("update_user <", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLessThanOrEqualTo(String value) {
            addCriterion("update_user <=", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserLike(String value) {
            addCriterion("update_user like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotLike(String value) {
            addCriterion("update_user not like", value, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserIn(List<String> values) {
            addCriterion("update_user in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotIn(List<String> values) {
            addCriterion("update_user not in", values, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserBetween(String value1, String value2) {
            addCriterion("update_user between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateUserNotBetween(String value1, String value2) {
            addCriterion("update_user not between", value1, value2, "updateUser");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andLoginCntIsNull() {
            addCriterion("login_cnt is null");
            return (Criteria) this;
        }

        public Criteria andLoginCntIsNotNull() {
            addCriterion("login_cnt is not null");
            return (Criteria) this;
        }

        public Criteria andLoginCntEqualTo(Integer value) {
            addCriterion("login_cnt =", value, "loginCnt");
            return (Criteria) this;
        }

        public Criteria andLoginCntNotEqualTo(Integer value) {
            addCriterion("login_cnt <>", value, "loginCnt");
            return (Criteria) this;
        }

        public Criteria andLoginCntGreaterThan(Integer value) {
            addCriterion("login_cnt >", value, "loginCnt");
            return (Criteria) this;
        }

        public Criteria andLoginCntGreaterThanOrEqualTo(Integer value) {
            addCriterion("login_cnt >=", value, "loginCnt");
            return (Criteria) this;
        }

        public Criteria andLoginCntLessThan(Integer value) {
            addCriterion("login_cnt <", value, "loginCnt");
            return (Criteria) this;
        }

        public Criteria andLoginCntLessThanOrEqualTo(Integer value) {
            addCriterion("login_cnt <=", value, "loginCnt");
            return (Criteria) this;
        }

        public Criteria andLoginCntIn(List<Integer> values) {
            addCriterion("login_cnt in", values, "loginCnt");
            return (Criteria) this;
        }

        public Criteria andLoginCntNotIn(List<Integer> values) {
            addCriterion("login_cnt not in", values, "loginCnt");
            return (Criteria) this;
        }

        public Criteria andLoginCntBetween(Integer value1, Integer value2) {
            addCriterion("login_cnt between", value1, value2, "loginCnt");
            return (Criteria) this;
        }

        public Criteria andLoginCntNotBetween(Integer value1, Integer value2) {
            addCriterion("login_cnt not between", value1, value2, "loginCnt");
            return (Criteria) this;
        }

        public Criteria andLatestLoginTimeIsNull() {
            addCriterion("latest_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLatestLoginTimeIsNotNull() {
            addCriterion("latest_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLatestLoginTimeEqualTo(Date value) {
            addCriterion("latest_login_time =", value, "latestLoginTime");
            return (Criteria) this;
        }

        public Criteria andLatestLoginTimeNotEqualTo(Date value) {
            addCriterion("latest_login_time <>", value, "latestLoginTime");
            return (Criteria) this;
        }

        public Criteria andLatestLoginTimeGreaterThan(Date value) {
            addCriterion("latest_login_time >", value, "latestLoginTime");
            return (Criteria) this;
        }

        public Criteria andLatestLoginTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("latest_login_time >=", value, "latestLoginTime");
            return (Criteria) this;
        }

        public Criteria andLatestLoginTimeLessThan(Date value) {
            addCriterion("latest_login_time <", value, "latestLoginTime");
            return (Criteria) this;
        }

        public Criteria andLatestLoginTimeLessThanOrEqualTo(Date value) {
            addCriterion("latest_login_time <=", value, "latestLoginTime");
            return (Criteria) this;
        }

        public Criteria andLatestLoginTimeIn(List<Date> values) {
            addCriterion("latest_login_time in", values, "latestLoginTime");
            return (Criteria) this;
        }

        public Criteria andLatestLoginTimeNotIn(List<Date> values) {
            addCriterion("latest_login_time not in", values, "latestLoginTime");
            return (Criteria) this;
        }

        public Criteria andLatestLoginTimeBetween(Date value1, Date value2) {
            addCriterion("latest_login_time between", value1, value2, "latestLoginTime");
            return (Criteria) this;
        }

        public Criteria andLatestLoginTimeNotBetween(Date value1, Date value2) {
            addCriterion("latest_login_time not between", value1, value2, "latestLoginTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}