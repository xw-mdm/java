package api;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/logout")
public class LogoutServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 把当前用户的 session 中的 user 这个数据给删掉.
        HttpSession session = req.getSession(false);
        if (session == null) {
            resp.sendError(404, "当前尚未登陆, 不能注销");
            return;
        }
        session.removeAttribute("user");
        resp.sendRedirect("blogList");
    }
}
