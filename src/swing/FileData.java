package swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.*;

    public class FileData implements ActionListener {

        FileOutputStream f;

        {
            try {
                f = new FileOutputStream("/media/sony/96D0-6DBE/STUDY/FileHandling/ans.ods");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        JTextField tf1,tf2,tf3;
        JButton b1,b2,b3,b4;

        FileData()
        {
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
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            float a = Float.parseFloat(s1);
            float b = Float.parseFloat(s2);
            float c = 0;

            if (e.getSource() == b1) {
                c = a / b;

            } else if (e.getSource() == b2)
            {
                c = a * b;
            }
            else if (e.getSource() == b3)
            {
                c = a + b;
            }
            else if (e.getSource() == b4)
            {
                c = a - b;
            }
            String result = String.valueOf(c);
            tf3.setText(result);

            String p="A:";
            byte[] j=p.getBytes();
            try {
                f.write(j);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            String x1=String.valueOf(a);
            byte[] bytes=x1.getBytes();
            try {
                f.write(bytes);
            }
            catch (IOException e1)
            {
                e1.printStackTrace();
            }
            String q=" B:";
            byte[] n=q.getBytes();
            try {
                f.write(n);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            String x2=String.valueOf(b);
            byte[] bytes1=x2.getBytes();
            try {
                f.write(bytes1);
            }
            catch (IOException e1) {
                e1.printStackTrace();
            }
            String r=" = C: ";
            byte[] y=r.getBytes();
            try {
                f.write(y);
                System.out.println("\n");
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            String x3=String.valueOf(c);
            byte[] bytes2=x3.getBytes();
            try {
                f.write(bytes2);
            } catch (IOException e1) {

                e1.printStackTrace();
            }
//            try {
//                f.close();
//            } catch (IOException e1) {
//                e1.printStackTrace();
//            }
        }
        public static void main(String[] args)
        {
            new FileData();

        }
}
