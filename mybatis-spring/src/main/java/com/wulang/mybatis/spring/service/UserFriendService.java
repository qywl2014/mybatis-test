package com.wulang.mybatis.spring.service;

import com.wulang.mybatis.spring.dao.UserFriendMapper;
import com.wulang.mybatis.spring.model.UserFriend;
import com.wulang.mybatis.spring.model.UserFriendExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserFriendService {

    @Autowired
    private UserFriendMapper userFriendMapper;

    public void printUserFriend(){
        List<UserFriend> userFriendList= userFriendMapper.selectByExample(new UserFriendExample());
        System.out.println(userFriendList);
    }
}
