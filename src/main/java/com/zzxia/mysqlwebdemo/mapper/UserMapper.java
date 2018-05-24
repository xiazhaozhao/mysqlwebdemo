package com.zzxia.mysqlwebdemo.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

public interface UserMapper{
    @Insert("insert into Users(Name,Age) values (#{name},#{age})")
    boolean Save(@Param("name") String name, @Param("age") int age);
}
