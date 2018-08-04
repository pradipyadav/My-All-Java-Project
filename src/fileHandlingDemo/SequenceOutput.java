package fileHandlingDemo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class SequenceOutput
{
    public static void main(String[] args) throws IOException
    {
        FileOutputStream f1=new FileOutputStream("/media/sony/96D0-6DBE/STUDY/FileHandling/f1");
        FileOutputStream f2=new FileOutputStream("/media/sony/96D0-6DBE/STUDY/FileHandling/f2");
        FileOutputStream f3=new FileOutputStream("/media/sony/96D0-6DBE/STUDY/FileHandling/f3");
        FileOutputStream f4=new FileOutputStream("/media/sony/96D0-6DBE/STUDY/FileHandling/f4");

        String s1,s2,s3,s4;
        Scanner sc1=new Scanner(System.in);
        System.out.println("Write in file f1");
        s1=sc1.nextLine();
        byte[] b1=s1.getBytes();
        f1.write(b1);
        f1.close();

        Scanner sc2=new Scanner(System.in);
        System.out.println("Write in file f2");
        s2=sc2.nextLine();
        byte[] b2=s2.getBytes();
        f2.write(b2);
        f2.close();

        Scanner sc3=new Scanner(System.in);
        System.out.println("Write in file f3");
        s3=sc3.nextLine();
        byte[] b3=s3.getBytes();
        f3.write(b3);
        f3.close();

        Scanner sc4=new Scanner(System.in);
        System.out.println("Write in file f4");
        s4=sc4.nextLine();
        byte[] b4=s4.getBytes();
        f4.write(b4);
        f4.close();

        System.out.println("File created Successfully");
    }
}
