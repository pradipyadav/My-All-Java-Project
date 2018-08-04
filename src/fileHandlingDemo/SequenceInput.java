package fileHandlingDemo;

import controlStatement.While;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class SequenceInput
{
    public static void main(String[] args)throws IOException {
        FileInputStream f1=new FileInputStream("/media/sony/96D0-6DBE/STUDY/FileHandling/f1");
        FileInputStream f2=new FileInputStream("/media/sony/96D0-6DBE/STUDY/FileHandling/f2");
        FileInputStream f3=new FileInputStream("/media/sony/96D0-6DBE/STUDY/FileHandling/f3");
        FileInputStream f4=new FileInputStream("/media/sony/96D0-6DBE/STUDY/FileHandling/f4");

        Vector v=new Vector();
        v.add(f1);
        v.add(f2);
        v.add(f3);
        v.add(f4);

        Enumeration e=v.elements();

        SequenceInputStream s=new SequenceInputStream(e);

        int i=0;
        while((i=s.read())!=-1)
        {
            System.out.print((char)i);
        }


    }
}
