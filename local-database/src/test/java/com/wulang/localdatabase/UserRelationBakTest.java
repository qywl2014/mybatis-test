package com.wulang.localdatabase;

import com.wulang.localdatabase.dao.UserFollowBakMapper;
import com.wulang.localdatabase.dao.UserFollowMapper;
import com.wulang.localdatabase.dao.UserinfoMapper;
import com.wulang.localdatabase.domain.Userinfo;
import com.wulang.localdatabase.domain.UserinfoExample;
import com.wulang.localdatabase.model.UserFollow;
import com.wulang.localdatabase.model.UserFollowBak;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//@RunWith(SpringRunner.class)
//@SpringBootTest
public class UserRelationBakTest {


//    @Autowired
    UserinfoMapper userinfoMapper;

    @Test
    public void selectByUserId() throws Exception{
        SqlSession sqlSession=getSqlSession();
        UserFollowMapper userFollowMapper=sqlSession.getMapper(UserFollowMapper.class);
        long startTime=System.currentTimeMillis();
        List<UserFollow> list=userFollowMapper.selectByUserId(10);
        long endTime=System.currentTimeMillis();
        System.out.println("--------"+(endTime-startTime));//(10) 421 216 234 513 296 1162 428 302 219
        System.out.println("size:"+list.size());

        //2100 651 428 328 383
    }
    @Test
    public void selectByFollowedId() throws Exception{
        SqlSession sqlSession=getSqlSession();
        UserFollowMapper userFollowMapper=sqlSession.getMapper(UserFollowMapper.class);
        long startTime=System.currentTimeMillis();
        List<UserFollow> list=userFollowMapper.selectByFollowedId(11);
        System.out.println(list);
        long endTime=System.currentTimeMillis();
        System.out.println("--------"+(endTime-startTime));//(11) 221 358 849 202 559

    }
    @Test
    public void selectInterFollowByIn() throws Exception{
        SqlSession sqlSession=getSqlSession();
        UserFollowMapper userFollowMapper=sqlSession.getMapper(UserFollowMapper.class);
        long startTime=System.currentTimeMillis();
        List<UserFollow> list=userFollowMapper.selectInterFollowByIn(2);
        long endTime=System.currentTimeMillis();
        System.out.println("--------"+(endTime-startTime));//(12) 365 586 463
        System.out.println("size:"+list.size());
                                                           //(13) 1021 327 374 390
                                                           //(15) 610 612 234 218 531
        //407 308 359 429
        //1 百万粉丝 2225 1570 1479 1553 1287 1424
        //2 858 437 374 435 328

    }
    @Test
    public void selectInterFollowByInFansFirst() throws Exception{
        SqlSession sqlSession=getSqlSession();
        UserFollowMapper userFollowMapper=sqlSession.getMapper(UserFollowMapper.class);
        long startTime=System.currentTimeMillis();
        List<UserFollow> list=userFollowMapper.selectInterFollowByInFansFirst(1);
        long endTime=System.currentTimeMillis();
        System.out.println("--------"+(endTime-startTime));
        System.out.println("size:"+list.size());

        //1 百万粉丝 1424 1364 1567
    }
    @Test
    public void selectInterFollowByIntersect() throws Exception{
        SqlSession sqlSession=getSqlSession();
        UserFollowMapper userFollowMapper=sqlSession.getMapper(UserFollowMapper.class);
        long startTime=System.currentTimeMillis();
        List<UserFollow> list=userFollowMapper.selectInterFollowByIntersect(1);
        long endTime=System.currentTimeMillis();
        System.out.println("--------"+(endTime-startTime));//(13) 1513 281 218 754         1732 273 327 390 343
        System.out.println("size:"+list.size());
                                                           //(12) 518 187 297 936 631 438
                                                           //(14) 344 265 443 784 291 748 newsql: 1186 210 309 358  269 266 222 294 438
        //(14) 421 499 542 406 437 383 534 574
        //(10) 405 578 468 461
        //(1) 701 558 376 327
        //1 百万粉丝 1492 1420 1444
    }

    @Test
    public void selectByEachOtherColumn() throws Exception{
        SqlSession sqlSession=getSqlSession();
        UserFollowMapper userFollowMapper=sqlSession.getMapper(UserFollowMapper.class);
        long startTime=System.currentTimeMillis();
        List<UserFollow> list=userFollowMapper.selectByEachOtherColumn(2);
        long endTime=System.currentTimeMillis();
        System.out.println("--------"+(endTime-startTime));//0:426 469 440 468 1: 281 312 284 249 205 288 236
        System.out.println("size:"+list.size());

        //2100 651 428 328 383
        //1 百万粉丝 483 403 513 998 436
        //2 484 309 436
    }

    /**
     * 最近一次结束 打印的i的值500006000
     */
    @Test
    public void userFollowInsertTest() throws Exception{
        int init=500000000;
        int iinit=init;
        int iend=init+1000;
        int Jinit=init;
        int Jend=init+1000;
        SqlSession sqlSession=getSqlSession();
        UserFollowBakMapper userFollowMapper=sqlSession.getMapper(UserFollowBakMapper.class);
        UserFollowBak userFollow=new UserFollowBak();
        long startTime=System.currentTimeMillis();
        for(int i=iinit;i<=iend;i++){
            for(int j=Jinit;j<=Jend;j++){
                userFollow.setDtime(new Date());
                userFollow.setConfirmtag(0);
                userFollow.setUserid(i);
                userFollow.setFollowedid(j);
                userFollowMapper.insert(userFollow);
            }
            if(i%100==0){
                sqlSession.commit();
                System.out.println("-------"+i);
            }
        }
        long endTime=System.currentTimeMillis();
        System.out.println("--------"+(endTime-startTime));
    }

    @Test
    public void insertFans() throws Exception{
        SqlSession sqlSession=getSqlSession();
        UserFollowMapper userFollowMapper=sqlSession.getMapper(UserFollowMapper.class);
        UserFollow userFollow=new UserFollow();
        long startTime=System.currentTimeMillis();
        for(int i=700000001;i<=701000000;i++){
                userFollow.setDtime(new Date());
            userFollow.setConfirmtag(0);
                userFollow.setUserid(i);
                userFollow.setFollowedid(2);
                userFollowMapper.insert(userFollow);
        }
        sqlSession.commit();
        long endTime=System.currentTimeMillis();
        System.out.println("--------"+(endTime-startTime));
    }

    public static SqlSession getSqlSession()throws Exception{
        InputStream inputStream=Resources.getResourceAsStream("Configuration.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
    }

}
