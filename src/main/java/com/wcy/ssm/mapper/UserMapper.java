package com.wcy.ssm.mapper;

import com.wcy.ssm.beans.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper //同时支持xml
public interface UserMapper {
    @Select("select * from user")
    List<User> findAll();
}
