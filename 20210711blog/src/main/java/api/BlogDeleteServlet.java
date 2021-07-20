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

@WebServlet("/blogDelete")
public class BlogDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 1. 从 req 中读取要删除的 blogId
        String blogId = req.getParameter("blogId");
        if (blogId == null || "".equals(blogId)) {
            resp.sendError(404, "blogId 为空!");
            return;
        }
        // 2. 判定用户的登陆状态, 未登陆不能删除.
        HttpSession session = req.getSession(false);
        if (session == null) {
            resp.sendError(404, "当前未登录, 不能删除!");
            return;
        }
        User user = (User) session.getAttribute("user");
        if (user == null) {
            resp.sendError(404, "当前未登录, 不能删除!");
            return;
        }
        // 3. 根据 blogId, 查询 blogId 的作者 id, 看看和当前登陆的用户 id 是否相同
        //    不相同也不能删除.
        BlogDao blogDao = new BlogDao();
        Blog blog = blogDao.selectOne(Integer.parseInt(blogId));
        if (blog == null) {
            resp.sendError(404, "当前博客不存在!");
            return;
        }
        if (blog.getUserId() != user.getUserId()) {
            resp.sendError(403, "不能删除别人的博客!");
            return;
        }
        // 4. 如果用户相同, 从数据库中删除这个博客即可.
        blogDao.delete(Integer.parseInt(blogId));
        // 5. 重定向到博客列表页
        resp.sendRedirect("blogList");
    }
}
