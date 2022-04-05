package com.macro.mall.mapper;

import com.macro.mall.model.ScProductInfo;
import com.macro.mall.model.ScProductInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScProductInfoMapper {
    long countByExample(ScProductInfoExample example);

    int deleteByExample(ScProductInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScProductInfo record);

    int insertSelective(ScProductInfo record);

    List<ScProductInfo> selectByExample(ScProductInfoExample example);

    ScProductInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScProductInfo record, @Param("example") ScProductInfoExample example);

    int updateByExample(@Param("record") ScProductInfo record, @Param("example") ScProductInfoExample example);

    int updateByPrimaryKeySelective(ScProductInfo record);

    int updateByPrimaryKey(ScProductInfo record);
}