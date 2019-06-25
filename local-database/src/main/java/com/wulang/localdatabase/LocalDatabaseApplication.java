package com.wulang.localdatabase;

import com.github.pagehelper.PageInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.Bean;

import java.util.Properties;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
//@MapperScan(basePackages = "com.wulang.localdatabase.dao")
public class LocalDatabaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(LocalDatabaseApplication.class, args);
    }

//    @Bean
//    public PageInterceptor getP() {
//        PageInterceptor pageInterceptor = new PageInterceptor();
//        Properties p = new Properties();
//        p.setProperty("offsetAsPageNum", "true");
//        p.setProperty("rowBoundsWithCount", "true");
//        p.setProperty("reasonable", "true");
//        p.setProperty("pageSizeZero", "true");
//        p.setProperty("supportMethodsArguments", "true");
//        pageInterceptor.setProperties(p);
//        return pageInterceptor;
//    }
}
