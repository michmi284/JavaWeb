package web.servlet;

import Remake.dao.UserDao;
import Remake.dao.impl.UserDaoImpl;
import Remake.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        req.setCharacterEncoding("utf-8");

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User loginUser = new User();
        loginUser.setUsername(username);
        loginUser.setPassword(password);

        UserDao dao = new UserDaoImpl();
        User user = null;
        try
        {
            user = dao.login(loginUser);
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
        if (user == null)
        {
            System.out.println("登录失败");
            req.getRequestDispatcher("/failServlet").forward(req, resp);
        } else
        {
            System.out.println("登陆成功");
            req.getRequestDispatcher("/successServlet").forward(req, resp);

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doGet(req, resp);
    }
}
