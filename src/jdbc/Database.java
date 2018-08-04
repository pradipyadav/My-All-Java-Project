package jdbc;

import java.sql.*;
import java.util.Scanner;

public class Database
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=
                     DriverManager.getConnection("jdbc:mysql://localhost:3306/javaBatch?useSSL=false","root","root");
        Statement stm= con.createStatement();
        PreparedStatement ps=con.prepareCall("insert into student values(?,?)");

        Scanner scanner=new Scanner(System.in);
        System.out.println("enter id : ");
        int id=scanner.nextInt();

        System.out.println("enter name : ");
        String name=scanner.nextLine();

        ps.setInt(1,id);
        ps.setString(2,name);

        ps.execute();

        ResultSet rs=stm.executeQuery("select * from student");
        while(rs.next())
            System.out.println(rs.getInt(1)+"  "+rs.getString(2));
        con.close();
    }
}
