package com.zzxia.mysqlwebdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zzxia.mysqlwebdemo.mapper")
public class MysqlwebdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MysqlwebdemoApplication.class, args);
    }
}
