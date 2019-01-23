package com.wulang.localdatabase.main;

import com.wulang.localdatabase.dao.RoomRobotTaskDAO;
import com.wulang.localdatabase.domain.RoomRobotTask;
import com.wulang.localdatabase.domain.UserInfo;
import com.wulang.localdatabase.model.RoomRobotTaskDO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Component
public class Main {
    @Autowired
    RoomRobotTaskDAO roomRobotTaskDAO;

    @PostConstruct
    public void init(){
//        List<UserInfo> userInfoList = new ArrayList<>();
//        for(int i=1;i<=4000;i++){
//            UserInfo userInfo=new UserInfo();
//            userInfo.setId(i);
//            userInfo.setPoint(0);
//            userInfo.setLastMonthPoint(0);
//            userInfo.setName("a");
//            userInfoList.add(userInfo);
//        }
//        roomRobotTaskDAO.insertListUserInfo(userInfoList);
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=3000;i++){
            list.add(i);
        }
        roomRobotTaskDAO.updateInTest(list);
    }

    private String getStringLong(){
        String a="";
        for(int i=0;i<1000;i++){
            a=a+getString();
        }
        return a;
    }

    private String getString(){
        return "其中：\n" +
                "（1）优质主播是指上月主播K豆收益达20000元的主播，不包含活动奖励等额外K豆收益，单个主播单日最高只能获得1分\n" +
                "（2）新主播是指成功申请成为主播不满30天或者取消主播权限后重新实名认证成功不满30天的主播；优质新主播指主播评级达到A档及以上的新主播。单个主播单日最高只能获得4分\n" +
                "（3）家族长需将引进主播的外站月刷量或后台收益截图提供给KK官方运营，KK官方将根据主播外站月刷量、粉丝数、收入结构等数据进行综合评估，经审核通过方可发放积分奖励\n" +
                "（4）外站引进主播奖励仅针对首次注册成为KK直播的主播且自首次开播之日起30天内满足条件的情形\n" +
                "此外，试运营家族有以下优惠政策：\n" +
                "（1）家族试运营期间可正常享受常规积分和外站主播引进积分\n" +
                "（2）试运营通过后，可额外获得自家族创建之日起30天内，家族所获积分总额的50%作为奖励（不包含活动奖励部分），这部分奖励在家族创建后第31天自动发放。家族后台-主播管理-收入统计-积分信息页面要生成一条奖励记录：主播ID、主播昵称为空，项目为“试运营通过奖励”。\n" +
                "（3）家族试运营通过，平台会一次性发放50积分作为对新家族的扶持，这部分奖励在试运营通过后自动发放。家族后台-主播管理-收入统计-积分信息页面要生成一条奖励记录：主播ID、主播昵称为空，项目为“试运营通过奖励”";
    }
}

