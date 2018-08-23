package newProject;

import java.sql.*;

public class Database
{
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

//        String url="jdbc:mysql://localhost:3306/Student?useSSL=false";
//        String uName="root";
//        String psswd="root";
//        String query="select * from information";
//
//        Class.forName("com.mysql.jdbc.Driver");
//        Connection con= DriverManager.getConnection(url,uName,psswd);
//        Statement st=con.createStatement();
//        ResultSet rs=st.executeQuery(query);
//
//        String userData="";
//
//        while (rs.next()){
//
//            userData=rs.getInt(1)+" "+rs.getString(2);
//            System.out.println(userData);
//        }
//        st.close();
//        con.close();

        String url="jdbc:mysql://localhost:3306/Student?useSSL=false";
        String uName="root";
        String passwd="root";
        int roll_N=4;
        String name="Daulat";
        String query="insert into information values(?,?)";

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection(url,uName,passwd);
        PreparedStatement st=con.prepareStatement(query);

        st.setInt(1,roll_N);
        st.setString(2,name);

        int count=st.executeUpdate();

        System.out.println(count+" row updated");

        st.close();
        con.close();
    }
}
