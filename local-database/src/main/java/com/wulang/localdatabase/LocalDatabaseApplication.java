package com.wulang.localdatabase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.wulang.localdatabase.dao")
public class LocalDatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocalDatabaseApplication.class, args);
    }
}
