package swing;

import javax.swing.*;

public class SwingDemo
{
    public static void main(String[] args) {

        JFrame f=new JFrame();

        JButton a=new JButton();
                a.setBounds(100,60,90, 30);
        JButton b=new JButton();
                a.setBounds(200,60,90, 30);
        JButton c=new JButton("Addition");
                a.setBounds(100,60,90, 30);


        f.add(a);
        f.add(b);
        f.add(c);

        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);


    }
}


