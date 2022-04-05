package com.macro.mall.mapper;

import com.macro.mall.model.SysAdminUser;
import com.macro.mall.model.SysAdminUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAdminUserMapper {
    long countByExample(SysAdminUserExample example);

    int deleteByExample(SysAdminUserExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysAdminUser record);

    int insertSelective(SysAdminUser record);

    List<SysAdminUser> selectByExample(SysAdminUserExample example);

    SysAdminUser selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysAdminUser record, @Param("example") SysAdminUserExample example);

    int updateByExample(@Param("record") SysAdminUser record, @Param("example") SysAdminUserExample example);

    int updateByPrimaryKeySelective(SysAdminUser record);

    int updateByPrimaryKey(SysAdminUser record);
}