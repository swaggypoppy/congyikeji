package com.macro.mall.mapper;

import com.macro.mall.model.ScDepInfo;
import com.macro.mall.model.ScDepInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScDepInfoMapper {
    long countByExample(ScDepInfoExample example);

    int deleteByExample(ScDepInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScDepInfo record);

    int insertSelective(ScDepInfo record);

    List<ScDepInfo> selectByExample(ScDepInfoExample example);

    ScDepInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScDepInfo record, @Param("example") ScDepInfoExample example);

    int updateByExample(@Param("record") ScDepInfo record, @Param("example") ScDepInfoExample example);

    int updateByPrimaryKeySelective(ScDepInfo record);

    int updateByPrimaryKey(ScDepInfo record);
}