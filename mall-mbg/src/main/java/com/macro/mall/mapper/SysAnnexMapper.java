package com.macro.mall.mapper;

import com.macro.mall.model.SysAnnex;
import com.macro.mall.model.SysAnnexExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysAnnexMapper {
    long countByExample(SysAnnexExample example);

    int deleteByExample(SysAnnexExample example);

    int deleteByPrimaryKey(String id);

    int insert(SysAnnex record);

    int insertSelective(SysAnnex record);

    List<SysAnnex> selectByExample(SysAnnexExample example);

    SysAnnex selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") SysAnnex record, @Param("example") SysAnnexExample example);

    int updateByExample(@Param("record") SysAnnex record, @Param("example") SysAnnexExample example);

    int updateByPrimaryKeySelective(SysAnnex record);

    int updateByPrimaryKey(SysAnnex record);
}