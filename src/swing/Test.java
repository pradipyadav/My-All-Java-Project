package swing;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class Test extends JFrame
{
    JLabel no1 = new JLabel("Number 1");
    JLabel no2 = new JLabel("Number 2");
    JLabel sum = new JLabel("Sum:", JLabel.CENTER);
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    JTextField F1 = new JTextField(a);
    JTextField F2 = new JTextField(b);
    JLabel no3 = new JLabel();

    public Test() {
        super("Test");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(no1);
        container.add(F1);
        container.add(no2);
        container.add(F2);
        container.add(sum);
        container.add(no3);
        F1.setText(String.valueOf(a)); // set 5 in F1
        F2.setText(String.valueOf(b)); // set 5 in F2
        int n1 = Integer.parseInt((F1.getText())); // 5
        int n2 = Integer.parseInt((F2.getText())); // 5
        int no4 = n1 + n2; // 10
        String s1 = String.valueOf(no4);
        no3.setText(s1);
    }

    public static void main(String[] args) {
        System.out.println("Enter two values: ");
        Test test = new Test();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setSize(500, 400);
        test.setVisible(true);
    }
}
