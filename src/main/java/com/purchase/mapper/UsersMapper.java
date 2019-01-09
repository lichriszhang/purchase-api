package com.purchase.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.purchase.entity.Users;
import com.purchase.entity.UsersExample;

public interface UsersMapper {
    long countByExample(UsersExample example);

    int deleteByExample(UsersExample example);

    int deleteByPrimaryKey(String username);

    int insert(Users record);

    int insertSelective(Users record);

    List<Users> selectByExample(UsersExample example);
    
    List<Users> selectAll();

    Users selectByPrimaryKey(String username);

    int updateByExampleSelective(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByExample(@Param("record") Users record, @Param("example") UsersExample example);

    int updateByPrimaryKeySelective(Users record);

    int updateByPrimaryKey(Users record);
}