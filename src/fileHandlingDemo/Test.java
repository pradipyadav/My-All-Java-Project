package fileHandlingDemo;

import java.io.*;

public class Test
{
    public static void main(String arg[])throws Exception
    {
        Test t = new Test();
        File f = new File("Output.txt");
        FileOutputStream fos = new FileOutputStream(f);
        PrintWriter pw = new PrintWriter(fos);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a text: ");
        String str = br.readLine();
        pw.write(str);
        pw.flush();
        fos.close();
        pw.close();
        }

}