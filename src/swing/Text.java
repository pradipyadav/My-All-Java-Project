package swing;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Text implements ActionListener{
    JTextField tf1,tf2,tf3;
    JButton b1,b2,b3,b4;
    Text(){
        JFrame f= new JFrame();
        tf1=new JTextField();
        tf1.setBounds(50,50,150,20);

        tf2=new JTextField();
        tf2.setBounds(50,100,150,20);

        tf3=new JTextField();
        tf3.setBounds(50,150,150,20);
        tf3.setEditable(false);

        b1=new JButton("/");
        b1.setBounds(10,200,50,50);

        b2=new JButton("*");
        b2.setBounds(160,200,50,50);

        b3=new JButton("+");
        b3.setBounds(85,200,50,50);

        b4=new JButton("-");
        b4.setBounds(230,200,50,50);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        f.add(tf1);f.add(tf2);f.add(tf3);f.add(b1);f.add(b2);f.add(b3);f.add(b4);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String s1=tf1.getText();
        String s2=tf2.getText();
        float a=Float.parseFloat(s1);
        float b=Float.parseFloat(s2);
        float c=0;
        if(e.getSource()==b1){
            c=a/b;

        }else if(e.getSource()==b2){
            c=a*b;

        }
        else if(e.getSource()==b3){
            c=a+b;

        }
            else if(e.getSource()==b4){
            c=a-b;

 }
        String result=String.valueOf(c);
        tf3.setText(result);
        try {
            saveDatabase(a,b,c);
        } catch (Exception o) {
            o.printStackTrace();
        }

    }
    private void saveDatabase(float a, float b, float c)throws SQLException,Exception{

        Class.forName("com.mysql.jdbc.Driver");
        Connection con=
                DriverManager.getConnection("jdbc:mysql://localhost:3306/Math?useSSL=false","root","root");
        Statement stm= con.createStatement();

        PreparedStatement ps=con.prepareCall("insert into addition values(?,?,?)");
        ps.setFloat(1,a);
        ps.setFloat(2,b);
        ps.setFloat(3,c);

        ps.execute();

        ResultSet rs=stm.executeQuery("select * from addition");
        while(rs.next())
            System.out.println(rs.getFloat(1)+"  "+rs.getFloat(2)+" "+rs.getFloat(3));
        con.close();


    }
    public static void main(String[] args)
    {
        new Text();
    }
}