package remake.web;

import remake.domain.User;
import remake.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("userListServlet")
public class UserListServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        UserServiceImpl service = new UserServiceImpl();
        List<User> users = service.findAll();
        req.setAttribute("users", users);
        req.getRequestDispatcher("/list.jsp").forward(req, resp);
    }
}
