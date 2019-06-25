package com.wulang.localdatabase.main;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wulang.localdatabase.dao.UserinfoMapper;
import com.wulang.localdatabase.domain.Userinfo;
import com.wulang.localdatabase.domain.UserinfoExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Main {
//    @Autowired
//    UserinfoMapper userinfoMapper;

    @PostConstruct
    public void init(){
////        PageHelper.startPage(2, 3);
//        UserinfoExample example=new UserinfoExample();
//        example.setLimit(4);
//        example.setOffset(2);
////        example.or().andIdGreaterThan(1);
//        List<Userinfo> userinfoList=userinfoMapper.selectByExample(example);
//        System.out.println(new PageInfo<>(userinfoList).getTotal());
//        System.out.println(userinfoList);
    }
}

