import java.util.Scanner;

public class Addition
{
    public static void main(String[] args) {

        int a,b,c;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Value of A and B");

         a=s.nextInt();
         b=s.nextInt();
         c=a+b;

        System.out.println("Add= "+c);

    }


}
