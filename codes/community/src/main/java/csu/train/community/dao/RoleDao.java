package csu.train.community.dao;

import csu.train.community.util.ConnectionUtil;
import csu.train.community.vo.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RoleDao {

    //添加角色
    public int addRole(String roleName) {
        //获取连接
        Connection cn = ConnectionUtil.getConnection();

        //编写一个SQL语句，使用+拼接SQL串
        String sql = "insert into role_info(role_name) values('"+roleName+"')";
        //发送给MySQL执行
        PreparedStatement pstmt = null;

        int n = -1;
        //绑定到PreparedStatement对象中
        try {
            pstmt = cn.prepareStatement(sql);
            //返回影响的行数
            n = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //最终得给它关上
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }

        return n;
    }

    //删除数据
    public int deleteRole(int id) {
        int d = -1;
        return d;
    }

    //通过id查询
    public Role getRoleById(int id) {
        //获取连接
        Connection cn = ConnectionUtil.getConnection();

        //查找行的SQL
        String sql = "SELECT id, role_name FROM role_info WHERE id = ?";
        //声明语句对象
        PreparedStatement pstmt = null;
        //声明结果集游标，用于获取查询结果中每一行数据
        ResultSet rs = null;

        //绑定到PreparedStatement对象中
        try {
            //预编译SQL
            pstmt = cn.prepareStatement(sql);
            //绑定SQL语句中?对应的参数
            pstmt.setInt(1,id);
            //查询操作，返回结果集
            rs = pstmt.executeQuery();

            //判断查询结果集中是否有数据
            if(rs.next()) {

                //创建对象，并将数据存储到Role对象中
                Role role = new Role();

                //使用rs.getXxx(结果集中的字段名或索引)方法获取结果集中的列数据
                role.setId(rs.getInt("id"));
                role.setRoleName(rs.getString("role_name"));

                return role;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            //最终得给它关上
            if (cn != null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        RoleDao roleDao = new RoleDao();
        int m = roleDao.addRole("ABC");
    }
}
