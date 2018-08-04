package javaPractice;

public class StringComparison
{
    public static void main(String[] args) {

        int a=20;
        int b=20;
        int c=30;

        System.out.println("Integer Comparison");
        System.out.println(a==b);
        System.out.println(a==c);

        String s1="Pradip";
        String s2="Pradip";
        String s3="Yadav";
        String s4="Hello";
        String s5=new String("Pradip");

        System.out.println("String Comparison by .equal method");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s1.equals(s5));

        System.out.println("String comparison by == Operator");
        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s1==s4);
        System.out.println(s1==s5);

        System.out.println("String comparison by compareTo() method");
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s1.compareTo(s5));

    }


}
