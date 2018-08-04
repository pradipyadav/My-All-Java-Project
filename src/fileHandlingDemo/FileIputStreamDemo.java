package fileHandlingDemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class FileIputStreamDemo {

    public static void main(String[] args) throws IOException {

        FileInputStream f=new FileInputStream("/media/sony/96D0-6DBE/STUDY/FileHandling/file1.odt");
        BufferedInputStream bf=new BufferedInputStream(f);
        int i=0;
        while ((i=bf.read())!=-1) {
            System.out.print((char)i);
        }
        bf.close();
        f.close();
    }
}
