package com.macro.mall.mapper;

import com.macro.mall.model.SysAdminLogin;
import com.macro.mall.model.SysAdminLoginExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAdminLoginMapper {
    long countByExample(SysAdminLoginExample example);

    int deleteByExample(SysAdminLoginExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysAdminLogin record);

    int insertSelective(SysAdminLogin record);

    List<SysAdminLogin> selectByExample(SysAdminLoginExample example);

    SysAdminLogin selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysAdminLogin record, @Param("example") SysAdminLoginExample example);

    int updateByExample(@Param("record") SysAdminLogin record, @Param("example") SysAdminLoginExample example);

    int updateByPrimaryKeySelective(SysAdminLogin record);

    int updateByPrimaryKey(SysAdminLogin record);
}