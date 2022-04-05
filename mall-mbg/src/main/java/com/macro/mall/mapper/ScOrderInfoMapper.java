package com.macro.mall.mapper;

import com.macro.mall.model.ScOrderInfo;
import com.macro.mall.model.ScOrderInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScOrderInfoMapper {
    long countByExample(ScOrderInfoExample example);

    int deleteByExample(ScOrderInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScOrderInfo record);

    int insertSelective(ScOrderInfo record);

    List<ScOrderInfo> selectByExample(ScOrderInfoExample example);

    ScOrderInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScOrderInfo record, @Param("example") ScOrderInfoExample example);

    int updateByExample(@Param("record") ScOrderInfo record, @Param("example") ScOrderInfoExample example);

    int updateByPrimaryKeySelective(ScOrderInfo record);

    int updateByPrimaryKey(ScOrderInfo record);
}