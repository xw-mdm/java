package api;

import dao.User;
import dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 如果不做任何限定, 此时服务器这边读取 Parameter 的时候默认不是按照 utf-8 的方式来理解字符编码的.
        req.setCharacterEncoding("utf-8");
        // 1. 先读取用户提交的用户名和密码
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        if (username == null || "".equals(username)
                || password == null || "".equals(password)) {
            resp.sendError(404, "提交的用户名或者密码为空");
            return;
        }
        // 2. 查询数据库, 看看 username 是否存在
        UserDao userDao = new UserDao();
        User existsUser = userDao.selectByName(username);
        if (existsUser != null) {
            // 用户已经存在! 提示注册失败!
            resp.sendError(404, "用户名已经存在, 注册失败!");
            return;
        }
        // 3. 构造 dao.User 对象, 插入到数据库中.
        User newUser = new User();
        newUser.setUsername(username);
        newUser.setPassword(password);
        userDao.insert(newUser);
        // 4. 返回一个结果.
        resp.setContentType("text/html; charset=utf-8");
        resp.getWriter().write("<h3>注册成功!</h3>");
    }
}
