package api;

import dao.Blog;
import dao.BlogDao;
import dao.User;
import dao.UserDao;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/blogContent")
public class BlogContentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=utf-8");
        // 1. 从 req 中读取出 blogId
        String blogId = req.getParameter("blogId");
        if (blogId == null || "".equals(blogId)) {
            // /rocket_blog/blogContent => blogId = null
            // /rocket_blog/blogContent?blogId=   blogId = ""
            // resp.getWriter().write("<h3>blogId 不存在</h3>");
            resp.sendError(404, "blogId 参数错误!");
            return;
        }
        // 2. 根据 blogId 在数据库中查询出博客的详细内容.
        BlogDao blogDao = new BlogDao();
        Blog blog = blogDao.selectOne(Integer.parseInt(blogId));
        if (blog == null) {
            resp.sendError(404, "blogId 指定的文章不存在!");
            return;
        }
        // 3. 根据 blog.userId 找到对应的 dao.User 对象
        UserDao userDao = new UserDao();
        User user = userDao.selectById(blog.getUserId());
        // 4. 根据详细内容, 渲染到模板中.
        TemplateEngine engine = (TemplateEngine) getServletContext().getAttribute("engine");
        WebContext webContext = new WebContext(req, resp, getServletContext());
        webContext.setVariable("blog", blog);
        webContext.setVariable("username", user.getUsername());
        String html = engine.process("blog_content", webContext);
        // 5. 把渲染好的结果写回客户端.
        resp.getWriter().write(html);
    }
}
