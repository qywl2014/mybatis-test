package jdbc;

import java.sql.*;
import java.text.SimpleDateFormat;

public class OracleTest {
    private static String driver = "oracle.jdbc.driver.OracleDriver";
    private static String url = "jdbc:oracle:thin:@oramst.kktv2.com:1521:tshow";
    private static String username = "tshow";
    private static String password = "tshowpwd";

    public static void main(String[] args) throws Exception {
        Class.forName(driver);
        Connection connection=DriverManager.getConnection(url,username,password);
        String sql = "call p_weekendHonorRefresh(?,?)";
//        String sql = "call p_star_test3(?,?)";
        //创建专用于调用过程或函数的对象
                CallableStatement cstmt = connection.prepareCall(sql);
                cstmt.setDate(1,getDate());
                cstmt.registerOutParameter(2,Types.VARCHAR);//out值
                cstmt.execute();//抛行调用存储过程
                String ename = cstmt.getString(2);
        System.out.println(ename);
    }
    static Date getDate() throws Exception{
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return new Date(simpleDateFormat.parse("2019-01-06 00:00:00").getTime());
    }
}
