package keywords;
import java.util.Scanner;
public class StaticKey {

    static int a,c,b;
    int d,e,s;
    String str;
    static Scanner sc=new Scanner(System.in);

    static void add()
    {

        c=a+b;
        System.out.println("additon is  "+c);


    }

    void result()
    {

       add();
       sub();
       getString();

           }

   void getString()
    {

       // Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your First Name : ");
        str = sc.nextLine();

        System.out.print("Hello, " + str);

    }


     void sub(){

        System.out.println("Enter the value of D and E : ");

          d=sc.nextInt();
          e=sc.nextInt();
          s=d-e;
          System.out.println("substraction is  "+s);


    }

    public static void main(String[] args) {

        System.out.println("Enter the value of a and b for Addition");
        a=sc.nextInt();
        b=sc.nextInt();
        StaticKey p=new StaticKey();
        p.result();
    }


}