package dao;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtil {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/RocketBlog?characterEncoding=utf8&useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "wangxp184219";

    private static DataSource dataSource = null;

    // 在这个代码中还存在一个非常严重的 BUG~
    public static DataSource getDataSource() {
        // 看一下 dataSource 当前是否已经持有一个实例了.
        // 如果没有持有, 就创建一个新的.
        // 如果持有了, 就不必创建新的, 直接返回之前的.
        if (dataSource == null) {
            MysqlDataSource mysqlDataSource = new MysqlDataSource();
            mysqlDataSource.setUrl(URL);
            mysqlDataSource.setUser(USERNAME);
            mysqlDataSource.setPassword(PASSWORD);
            dataSource = mysqlDataSource;
        }
        return dataSource;
    }

    public static Connection getConnection() {
        try {
            return getDataSource().getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void close(Connection connection,
                             PreparedStatement statement,
                             ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
