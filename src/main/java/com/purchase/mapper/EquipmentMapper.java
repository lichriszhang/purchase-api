package com.purchase.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.purchase.entity.Equipment;
import com.purchase.entity.EquipmentExample;

public interface EquipmentMapper {
    long countByExample(EquipmentExample example);

    int deleteByExample(EquipmentExample example);

    int deleteByPrimaryKey(String equipid);

    int insert(Equipment record);

    int insertSelective(Equipment record);

    List<Equipment> selectByExample(EquipmentExample example);
    
    List<Equipment> selectAll();

    Equipment selectByPrimaryKey(String equipid);

    int updateByExampleSelective(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    int updateByExample(@Param("record") Equipment record, @Param("example") EquipmentExample example);

    int updateByPrimaryKeySelective(Equipment record);

    int updateByPrimaryKey(Equipment record);
}