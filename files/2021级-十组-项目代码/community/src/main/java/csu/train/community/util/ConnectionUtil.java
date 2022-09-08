package csu.train.community.util;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionUtil {
    public static Connection getConnection() {
        //声明一个连接对象
        Connection cn = null;

        //连接数据库的url，用户名和密码
        //用户名和密码自己改
        //格式 jdbc:mysql:// 地址 : 端口 / 名称
        String url = "jdbc:mysql://localhost:3306/communitydb";
        String username = "root";
        String password = "162534";

        //创建一个获取数据库连接的方法，返回数据库连接对象
        try {

            //加载一个驱动类
            Class.forName("com.mysql.cj.jdbc.Driver");
            //获取连接MySQL的连接对象
            cn = DriverManager.getConnection(url,username,password);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return cn;
    }

/*  数据库连接测试
    public static void main(String[] args) {
        Connection cn = getConnection();
        System.out.println(cn);
    }
*/
}


