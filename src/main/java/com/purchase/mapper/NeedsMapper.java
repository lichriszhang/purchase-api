package com.purchase.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.purchase.entity.Needs;
import com.purchase.entity.NeedsExample;

public interface NeedsMapper {
    long countByExample(NeedsExample example);

    int deleteByExample(NeedsExample example);

    int deleteByPrimaryKey(String needsid);

    int insert(Needs record);

    int insertSelective(Needs record);

    List<Needs> selectByExample(NeedsExample example);

    Needs selectByPrimaryKey(String needsid);

    int updateByExampleSelective(@Param("record") Needs record, @Param("example") NeedsExample example);

    int updateByExample(@Param("record") Needs record, @Param("example") NeedsExample example);

    int updateByPrimaryKeySelective(Needs record);

    int updateByPrimaryKey(Needs record);
}