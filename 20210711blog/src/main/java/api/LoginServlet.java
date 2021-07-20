package api;

import dao.User;
import dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        req.setCharacterEncoding("utf-8");
        // 1. 从 req 读取用户提交的 username 和 password
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username == null || "".equals(username)
                || password == null || "".equals(password)) {
            resp.sendError(404, "用户名或密码不能为空");
            return;
        }
        // 2. 从数据库中查找指定用户名的用户信息.
        UserDao userDao = new UserDao();
        User user = userDao.selectByName(username);
        if (user == null) {
            resp.sendError(404, "用户名或者密码错误");
            return;
        }
        if (!password.equals(user.getPassword())) {
            // 密码不匹配
            resp.sendError(404, "用户名或者密码错误");
            return;
        }
        // 3. 登陆成功! 创建会话.
        HttpSession session = req.getSession(true);
        session.setAttribute("user", user);
        // 4. 直接把用户页面重定向到博客列表页.
        resp.sendRedirect("blogList");
    }
}
