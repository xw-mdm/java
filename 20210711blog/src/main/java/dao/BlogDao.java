package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BlogDao {
    // 往数据库中新增一个 博客
    public void insert(Blog blog) {
        // 1. 和数据库服务器建立连接.
        Connection connection = DBUtil.getConnection();
        // 2. 拼装 SQL
        String sql = "insert into blog values(null, ?, ?, ?, now())";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setString(1, blog.getTitle());
            statement.setString(2, blog.getContent());
            statement.setInt(3, blog.getUserId());
            // 3. 执行 SQL
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 4. 收尾工作.
            DBUtil.close(connection, statement, null);
        }
    }

    // 从数据库删除博客
    public void delete(int blogId) {
        // 1. 和数据库服务器建立连接.
        Connection connection = DBUtil.getConnection();
        // 2. 拼装 SQL
        String sql = "delete from blog where blogId = ?";
        PreparedStatement statement = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, blogId);
            // 3. 执行 SQL
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection, statement, null);
        }
    }

    // 从数据库中查找出所有的博客.
    // 实现博客列表页的时候, 就需要这个方法.
    // 如果博客数目少, 都无所谓. 如果博客数目很多, 应该要支持 "分页查询"
    // limit offset
    public List<Blog> selectAll() {
        List<Blog> blogs = new ArrayList<Blog>();
        // 1. 和数据库服务器建立连接.
        Connection connection = DBUtil.getConnection();
        // 2. 拼装 SQL
        String sql = "select * from blog order by blogId desc";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);
            // 3. 执行 SQL
            resultSet = statement.executeQuery();
            // 4. 遍历结果集合.
            while (resultSet.next()) {
                Blog blog = new Blog();
                blog.setBlogId(resultSet.getInt("blogId"));
                blog.setTitle(resultSet.getString("title"));
                String content = resultSet.getString("content");
                if (content.length() > 40) {
                    content = content.substring(0, 40) + "...";
                }
                blog.setContent(content);
                blog.setUserId(resultSet.getInt("userId"));
                blog.setPostTime(resultSet.getTimestamp("postTime"));
                blogs.add(blog);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection, statement, resultSet);
        }
        return blogs;
    }

    // 从数据库查询出指定的一篇博客.
    // 实现博客详情页的时候, 需要这个方法.
    public Blog selectOne(int blogId) {
        // 1. 和数据库建立连接.
        Connection connection = DBUtil.getConnection();
        // 2. 拼装 SQL
        String sql = "select * from blog where blogId = ?";
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        try {
            statement = connection.prepareStatement(sql);
            statement.setInt(1, blogId);
            // 3. 执行 SQL
            resultSet = statement.executeQuery();
            // 4. 遍历结果集. 要么是 0 个记录, 要么只有 1 条记录.
            if (resultSet.next()) {
                Blog blog = new Blog();
                blog.setBlogId(resultSet.getInt("blogId"));
                blog.setTitle(resultSet.getString("title"));
                blog.setContent(resultSet.getString("content"));
                blog.setUserId(resultSet.getInt("userId"));
                blog.setPostTime(resultSet.getTimestamp("postTime"));
                return blog;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(connection, statement, resultSet);
        }
        return null;
    }

    public static void main(String[] args) {
        // 通过这里的代码对上面的数据库操作进行验证.
        // 1. 验证插入.
        // 此处的测试, 只是一个简单的 "冒烟测试"
        Blog blog = new Blog();
        blog.setTitle("这是第三篇博客");
        blog.setContent("这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文这是博客正文");
        blog.setUserId(1);
        BlogDao blogDao = new BlogDao();
        blogDao.insert(blog);

        // 2. 验证查找.
//        dao.BlogDao blogDao = new dao.BlogDao();
//        List<dao.Blog> blogs = blogDao.selectAll();
//        System.out.println(blogs);
//        dao.Blog blog = blogDao.selectOne(1);
//        System.out.println(blog);

        // 3. 验证删除.
//        dao.BlogDao blogDao = new dao.BlogDao();
//        blogDao.delete(1);
    }
}
