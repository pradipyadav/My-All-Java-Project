package fileHandlingDemo;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class FileOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileOutputStream fileOutputStream=new FileOutputStream("/media/sony/96D0-6DBE/STUDY/FileHandling/file1.odt");
        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(fileOutputStream);
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Any String");
        s=sc.nextLine();
        byte[] b=s.getBytes();
        bufferedOutputStream.write(b);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
        fileOutputStream.close();
        System.out.println("File successfully save.....!");
    }
}
