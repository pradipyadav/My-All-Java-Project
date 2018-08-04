package javaPractice;

import java.util.Scanner;

public class StringPrograms
{
    public static void main(String[] args) {
        String s1="Pradip";
        String s2="Yadav";
        String s3="Pradip";
        String s4="yadav";

        String s1lower=s1.toLowerCase();
        String s4upper=s4.toUpperCase();


        System.out.println("Lower case latter: "+s1lower);
        System.out.println("Upper case latter: "+s4upper);

        System.out.println(s1.equalsIgnoreCase(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.equalsIgnoreCase(s4));


        Scanner s=new Scanner(System.in);
        System.out.println("Enter String Which you want to reverse");
        String s5=s.nextLine();
        char temporarry[]=s5.toCharArray();
        int left,right=0;
        right=s5.length()-1;
        for(left=0;left<right;left++,right--)
        {
            char temp=temporarry[left];
            temporarry[left]=temporarry[right];
            temporarry[right]=temp;
        }
        for (char c:temporarry)
            System.out.print(c);
            System.out.println();
        System.out.println("Length of the String is: "+s5.length());

        String s6="The Stampede at Wankhade Stadium";
        String s7=s6.replace('d','f');
        System.out.println("Repalced all the 'd' characters with 'f' characters is: "+s7);

        String s8="  hello Pradip   ";
        System.out.println("Wihout using trim() method: "+s8+"Yadav");//without trim()
        System.out.println("Using trim() method: "+s8.trim()+"Yadav");//with trim()
    }
}
