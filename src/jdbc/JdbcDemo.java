package jdbc;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

import javax.sql.DataSource;
import java.sql.*;

public class JdbcDemo
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=
                DriverManager.getConnection(   "jdbc:mysql://localhost:3306/javaBatch?useSSL=false","root","root");
        Statement statement=con.createStatement();
        ResultSet resultSet=statement.executeQuery("select * from student");
        while (resultSet.next())
        {
            System.out.println("Id: "+resultSet.getInt(1)+" Name: "+resultSet.getString(2));
            }
        con.close();
    }
}
