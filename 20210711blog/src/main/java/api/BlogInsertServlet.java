package api;

import dao.Blog;
import dao.BlogDao;
import dao.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/blogInsert")
public class BlogInsertServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        // 0. 判定用户是否已经登陆
        HttpSession session = req.getSession(false);
        if (session == null) {
            resp.sendError(404, "当前尚未登陆, 不能发布博客!");
            return;
        }
        User user = (User) session.getAttribute("user");
        if (user == null) {
            resp.sendError(404, "当前尚未登陆, 不能发布博客!");
            return;
        }
        // 1. 读取请求中的参数.
        String title = req.getParameter("title");
        String content = req.getParameter("content");
        if (title == null || "".equals(title)
                || content == null || "".equals(content)) {
            resp.sendError(404, "标题或者正文为空");
            return;
        }
        // 2. 根据读到的数据构造 dao.Blog 对象, 并插入数据库
        Blog blog = new Blog();
        blog.setTitle(title);
        blog.setContent(content);
        blog.setUserId(user.getUserId());
        BlogDao blogDao = new BlogDao();
        blogDao.insert(blog);
        // 3. 重定向到博客列表页, 也能直接看到新的博客
        resp.sendRedirect("blogList");
    }
}
