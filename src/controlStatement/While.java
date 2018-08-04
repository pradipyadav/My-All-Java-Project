package controlStatement;
import java.util.Scanner;
public class While
{
    public static void main(String[] args) {
        int r,n,sum=0,temp;
        System.out.println("Enter the numbers");
        Scanner sc=new Scanner (System.in);
        n=sc.nextInt();
        temp=n;
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("Given number is Palindrom");
        }
        else
        {
            System.out.println("Given number is not Palindrom");
        }
    }
}
