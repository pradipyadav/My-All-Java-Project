package fileHandlingDemo;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class InputStream {

    public static void main(String[] args)throws IOException {

        FileInputStream fi;
        fi = new FileInputStream("/media/sony/96D0-6DBE/STUDY/FileHandling/file2.odt");
        BufferedInputStream bi=new BufferedInputStream(fi);
        int i=0;
        while ((i=bi.read())!=-1) {
            System.out.print((char)i);
        }
        bi.close();
        fi.close();
    }
}