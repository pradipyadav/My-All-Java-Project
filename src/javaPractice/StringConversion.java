package javaPractice;

public class StringConversion
{
    public static void main(String[] args) {
        System.out.println("Conversion String To integer: ");

        String s="200";

        int in=Integer.parseInt(s);

        System.out.println("\n"+"Conversion using Integer.parseInt(): ");
        System.out.println(s+100);//200100 because + is string concatenation operator
        System.out.println(in+100);//300 because + is binary plus operator

        System.out.println("Conversion using Integer.valueOf(): ");
        int i=Integer.valueOf(s);
        System.out.println(i);

        System.out.println("Conversion using Integer To String: ");
        int a=200;
        String s1=String.valueOf(i);

        System.out.println("/n"+"Conversion using valueOf: ");
        System.out.println(a+100);
        System.out.println(s1+100);

        System.out.println("Conversion using toString(): ");
        String s2=Integer.toString(i);
        System.out.println(a+200);
        System.out.println(s2+200);

        System.out.println("Conversion using format(): ");
        int b=500;
        String s3=String.format("%d",b);
        System.out.println(s3);
    }


}
