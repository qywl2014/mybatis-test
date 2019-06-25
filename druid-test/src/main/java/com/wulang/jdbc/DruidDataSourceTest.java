package com.wulang.jdbc;

import com.alibaba.druid.pool.DruidDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DruidDataSourceTest {
    public static void main(String[] args) throws Exception{
        DruidDataSource druidDataSource=new DruidDataSource();
        DataSource dataSource=druidDataSource;
        druidDataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/kkcx");
        druidDataSource.setUsername("postgres");
        druidDataSource.setPassword("123456");
        druidDataSource.setValidationQuery("select 1");
        druidDataSource.setMaxActive(3);
        druidDataSource.setMaxWait(5000);
        Connection connection=druidDataSource.getConnection();
        Statement statement=connection.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from kkcx.user_friend");
        resultSet.next();
        System.out.println(resultSet.getInt("user_id")+" "+resultSet.getInt("friend_id")+" "+resultSet.getDate("create_time"));
        druidDataSource.getConnection();
        connection.close();
        druidDataSource.getConnection();
    }
}
