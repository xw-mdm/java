package api;

import dao.Blog;
import dao.BlogDao;
import dao.User;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

@WebServlet("/blogList")
public class BlogListServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
    }

    private User checkLogin(HttpServletRequest req) {
        HttpSession session = req.getSession(false);
        if (session == null) {
            return null;
        }
        User user = (User) session.getAttribute("user");
        return user;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 0. 从 req 里面读取一下当前用户信息. 判定用户是否登陆.
        User user = checkLogin(req);
        boolean isLogin = false;
        if (user != null) {
            isLogin = true;
        }
        // 1. 先从数据库查询出都有哪些博客.
        BlogDao blogDao = new BlogDao();
        List<Blog> blogList = blogDao.selectAll();
        // 2. 构造博客页面.
        // 1) 通过 Thymeleaf 进行渲染. 渲染的时候需要定义 "数据集合" 这样的概念.
        // WebContext 功能就是把要替换的数据给收集起来, 统一的传给模板引擎.
        WebContext webContext = new WebContext(req, resp, getServletContext());
        // 2) setVariable 可以设置多个键值对. 完全取决于模板代码怎么写.
        // 模板里的每个 ${ } 里面的内容都需要在 webContext 设定进去.
        webContext.setVariable("blogs", blogList);
        webContext.setVariable("isLogin", isLogin);
        webContext.setVariable("user", user);
        // 3) 进行渲染.
        TemplateEngine engine = (TemplateEngine) getServletContext().getAttribute("engine");
        String html = engine.process("blog_list", webContext);
        System.out.println("模板渲染的内容: " + html);
        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().write(html);
    }
}
