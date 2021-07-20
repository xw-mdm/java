package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    // 注册的时候, 需要新增用户到数据库中.
    // 期望 username 不能重复. (username 是用于登陆的用户名)
    // 注册的时候(insert 之前), 先判定一下该 username 是否已经存在.
    // 如果存在, 就直接不执行后续的 insert 操作.
    // username 的唯一性不一定非得通过 数据库的约束 来完成.
    // 也可以通过用户代码来完成.
    public void insert(User user) {
        // 1. 和数据库建立连接.
        Connection connection = DBUtil.getConnection();
        // 2. 拼装 SQL
        String sql = "insert into user values(null, ?, ?)";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            // 3. 执行 SQL
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 4. 关闭连接.
            DBUtil.close(connection, statement, null);
        }
    }

    // 登陆的时候, 需要根据用户名获取到密码
    public User selectByName(String username) {
        // 1. 和数据库建立连接.
        Connection connection = DBUtil.getConnection();
        // 2. 拼装 SQL
        String sql = "select * from user where username = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, username);
            // 3. 执行 SQL
            resultSet = statement.executeQuery();
            // 4. 遍历结果集. 预期按照名字查找的结果是唯一的记录.
            if (resultSet.next()) {
                User user = new User();
                user.setUserId(resultSet.getInt("userId"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection, statement, resultSet);
        }
        return null;
    }

    // 根据用户 id 来查用户信息
    // 显示博客作者的时候需要用到.
    public User selectById(int userId) {
        // 1. 和数据库建立连接.
        Connection connection = DBUtil.getConnection();
        // 2. 拼装 SQL
        String sql = "select * from user where userId = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, userId);
            // 3. 执行 SQL
            resultSet = statement.executeQuery();
            // 4. 遍历结果集. 预期结果只是有 0 个或者 1 个.
            if (resultSet.next()) {
                User user = new User();
                user.setUserId(resultSet.getInt("userId"));
                user.setUsername(resultSet.getString("username"));
                user.setPassword(resultSet.getString("password"));
                return user;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection, statement, resultSet);
        }
        return null;
    }

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        // 1. 测试 插入用户 功能
//        dao.User user = new dao.User();
//        user.setUsername("zhangsan");
//        user.setPassword("123");
//        userDao.insert(user);
        // 2. 测试根据名字查找.
//        dao.User user = userDao.selectByName("zhangsan");
//        System.out.println(user);

        // 3. 测试根据 id 查找.
//        dao.User user = userDao.selectById(1);
//        System.out.println(user);
    }
}
