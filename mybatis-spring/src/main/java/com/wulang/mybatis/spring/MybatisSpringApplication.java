package com.wulang.mybatis.spring;

import com.wulang.mybatis.spring.service.UserFriendService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MybatisSpringApplication {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("conf/spring-context.xml");
        UserFriendService userFriendService=(UserFriendService)applicationContext.getBean("userFriendService");
        userFriendService.printUserFriend();
    }
}
