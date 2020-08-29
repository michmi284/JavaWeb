package Remake.dao.impl;

import Remake.dao.UserDao;
import Remake.domain.User;
import Remake.util.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImpl implements UserDao
{
    private Connection conn = null;
    private PreparedStatement pstmt = null;
    private ResultSet rs = null;
    private User user = null;

    @Override
    public User login(User loginUser) throws SQLException
    {
        String sql = "select * from userlogin where username = ? and password = ?";
        try
        {
            conn = JDBCUtils.getConnection();
            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, "username");
            pstmt.setString(2, "password");
            rs = pstmt.executeQuery();
            while (rs.next())
            {
                user = new User();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));

            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        } finally
        {
            JDBCUtils.close(rs, pstmt, conn);
        }
        return user;
    }
}
