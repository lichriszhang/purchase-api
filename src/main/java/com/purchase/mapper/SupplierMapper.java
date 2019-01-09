package com.purchase.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.purchase.entity.Supplier;
import com.purchase.entity.SupplierExample;

public interface SupplierMapper {
    long countByExample(SupplierExample example);

    int deleteByExample(SupplierExample example);

    int deleteByPrimaryKey(String supplierid);

    int insert(Supplier record);

    int insertSelective(Supplier record);

    List<Supplier> selectByExample(SupplierExample example);

    List<Supplier> selectAll();
    
    Supplier selectByPrimaryKey(String supplierid);

    int updateByExampleSelective(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByExample(@Param("record") Supplier record, @Param("example") SupplierExample example);

    int updateByPrimaryKeySelective(Supplier record);

    int updateByPrimaryKey(Supplier record);
}