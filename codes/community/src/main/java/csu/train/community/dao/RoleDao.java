package csu.train.community.dao;

import csu.train.community.util.ConnectionUtil;
import csu.train.community.vo.Role;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

public class RoleDao {

    /**
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
     */

    /**
    //删除数据
    public int deleteRole(int id) {
        int d = -1;

        //删除行的SQL
        String sql = "DELETE FROM role_info WHERE id = ?";
        // 获取连接
        Connection cn = ConnectionUtil.getConnection();
        //声明语句对象
        PreparedStatement pstmt = null;

        try {
            //预编译SQL
            pstmt = cn.prepareStatement(sql);
            //绑定SQL语句中?对应的参数
            pstmt.setInt(1, id);
            //执行SQL
            d = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(cn!=null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return d;
    }
     */

    //通过邮箱查询
    public boolean getRoleByMail(String mail) {
        //获取连接
        Connection cn = ConnectionUtil.getConnection();

        //查找行的SQL
        String sql = "SELECT user_id, user_mailBox FROM citizen_data WHERE user_mailBox = ?";
        //声明语句对象
        PreparedStatement pstmt = null;
        //声明结果集游标，用于获取查询结果中每一行数据
        ResultSet rs = null;

        //绑定到PreparedStatement对象中
        try {
            //预编译SQL
            pstmt = cn.prepareStatement(sql);
            //绑定SQL语句中?对应的参数
            pstmt.setString(1,mail);
            //查询操作，返回结果集
            rs = pstmt.executeQuery();

            //判断查询结果集中是否有数据
            if(rs.next()) {

                //创建对象，并将数据存储到Role对象中
                Role role = new Role();

                //使用rs.getXxx(结果集中的字段名或索引)方法获取结果集中的列数据
                role.setId(rs.getInt("user_id"));
                role.setMailBox(rs.getString("user_mailBox"));

                //System.out.println(role.getMailBox());

                return true;
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
        return false;
    }

    //更新/更改 数据公告的数据
    public int updateNotice(int id, String name) {
        int m = -1;
        //删除行的SQL
        String sql = "UPDATE notice_data SET notice_content = ? WHERE notice_id = ?";
        // 获取连接
        Connection cn = ConnectionUtil.getConnection();
        //声明语句对象
        PreparedStatement pstmt = null;

        try {
            //预编译SQL
            pstmt = cn.prepareStatement(sql);
            //绑定SQL语句中?对应的参数
            pstmt.setString(1, name);
            pstmt.setInt(2, id);

            //执行SQL
            m = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(cn!=null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return m;
    }

    //更新/更改 数据防疫公告的数据
    public int updateNoticeCovid(int id, String name) {
        int m = -1;
        //删除行的SQL
        String sql = "UPDATE covid_notice_data SET covid_notice_content = ? WHERE covid_notice_id = ?";
        // 获取连接
        Connection cn = ConnectionUtil.getConnection();
        //声明语句对象
        PreparedStatement pstmt = null;

        try {
            //预编译SQL
            pstmt = cn.prepareStatement(sql);
            //绑定SQL语句中?对应的参数
            pstmt.setString(1, name);
            pstmt.setInt(2, id);

            //执行SQL
            m = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(cn!=null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return m;
    }

    //读取公告的数据
    public String readNotice() {

        String inform = "公告";
        //删除行的SQL
        String sql = "SELECT notice_content FROM notice_data WHERE notice_id = 1";
        // 获取连接
        Connection cn = ConnectionUtil.getConnection();
        //声明语句对象
        PreparedStatement pstmt = null;
        //声明结果集游标， 用于获取查询结果中的每一行数据
        ResultSet rs = null;

        try {
            //预编译SQL
            pstmt = cn.prepareStatement(sql);

            //执行SQL
            rs = pstmt.executeQuery();

            rs.next();//在getString前面得写这句
            inform = rs.getString("notice_content");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(cn!=null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        //System.out.println(inform);
        return inform;
    }

    //读取防疫公告数据
    public String readNoticeCovid() {

        String inform = "公告";
        //删除行的SQL
        String sql = "SELECT covid_notice_content FROM covid_notice_data WHERE covid_notice_id = 1";
        // 获取连接
        Connection cn = ConnectionUtil.getConnection();
        //声明语句对象
        PreparedStatement pstmt = null;
        //声明结果集游标， 用于获取查询结果中的每一行数据
        ResultSet rs = null;

        try {
            //预编译SQL
            pstmt = cn.prepareStatement(sql);

            //执行SQL
            rs = pstmt.executeQuery();

            rs.next();//在getString前面得写这句
            inform = rs.getString("covid_notice_content");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(cn!=null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        //System.out.println(inform);
        return inform;
    }

    //更改是否接收公告(通过id)
    public int updateIfReceiveNoticeById(int id, int notice) {
        int m = -1;
        //删除行的SQL
        String sql = "UPDATE citizen_data SET receive_notice = ? WHERE user_id = ?";
        // 获取连接
        Connection cn = ConnectionUtil.getConnection();
        //声明语句对象
        PreparedStatement pstmt = null;

        try {
            //预编译SQL
            pstmt = cn.prepareStatement(sql);
            //绑定SQL语句中?对应的参数
            pstmt.setInt(1, notice);
            pstmt.setInt(2, id);

            //执行SQL
            m = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(cn!=null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return m;
    }

    //更改是否接收公告(通过mailBox)，（邮箱地址，0或1）
    public int updateIfReceiveNoticeByMail(String mailBox, int notice) {
        int m = -1;
        //删除行的SQL
        String sql = "UPDATE citizen_data SET receive_notice = ? WHERE user_mailBox = ?";
        // 获取连接
        Connection cn = ConnectionUtil.getConnection();
        //声明语句对象
        PreparedStatement pstmt = null;

        try {
            //预编译SQL
            pstmt = cn.prepareStatement(sql);
            //绑定SQL语句中?对应的参数
            pstmt.setInt(1, notice);
            pstmt.setString(2, mailBox);

            //执行SQL
            m = pstmt.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(cn!=null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return m;
    }

    /**
    //查询所有数据？
    public List<Role> getRoles() {

        String sql = "SELECT id, role_name FROM role_info";
        // 获取连接
        Connection cn = ConnectionUtil.getConnection();
        //声明语句对象
        PreparedStatement pstmt = null;
        //声明结果集游标， 用于获取查询结果中的每一行数据
        ResultSet rs = null;

        //创建集合，用于存储 多条数据
        List<Role> roleList = new ArrayList<>();

        try {
            //预编译SQL
            pstmt = cn.prepareStatement(sql);
            //查询操作，返回结果集
            rs = pstmt.executeQuery();

            //判断查询结果集中是否有数据
            while(rs.next()) {
                //每一行数据都会存储到一个role对象中
                //创建对象，并将数据存储到Role对象中
                Role role = new Role();
                //使用rs.getXxx(结果集中的字段名或索引)方法获取结果集中的列数据
                role.setId(rs.getInt("id"));
                role.setRoleName(rs.getString("role_name"));
                //将一行数据存储到集合中
                roleList.add(role);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if(cn!=null) {
                try {
                    cn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return roleList;
    }
     */

    public static void main(String[] args) {
        RoleDao roleDao = new RoleDao();
        //roleDao.updateNoticeCovid(1,"adc");
    }
}

