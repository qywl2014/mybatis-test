package com.wulang.durid.test;

import static org.junit.Assert.assertTrue;

import com.wulang.mybatis.dao.UserFriendMapper;
import com.wulang.mybatis.model.UserFriend;
import com.wulang.mybatis.model.UserFriendExample;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.InputStream;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void dataSourceTest() throws Exception
    {
        SqlSession sqlSession=getSqlSession();
        UserFriendMapper userFriendMapper=sqlSession.getMapper(UserFriendMapper.class);
        List<UserFriend> userFriendList = userFriendMapper.selectByExample(new UserFriendExample());
        System.out.println(userFriendList);
        sqlSession.close();
    }

    public static SqlSession getSqlSession()throws Exception{
        InputStream inputStream=Resources.getResourceAsStream("Configuration.xml");
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(inputStream);
        return sqlSessionFactory.openSession();
    }
}
