package fileHandlingDemo;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TestFile {
    void createFile() throws IOException {
        try {
            Path path = Paths.get("/media/sony/96D0-6DBE/STUDY/file2.odt");
            Files.createDirectories(path.getParent());
            Files.createFile(path);
            System.out.println("File Created");
        } catch (FileAlreadyExistsException e) {
            System.out.println("already exists: " + e.getMessage());
            System.out.println("Ready to write in already creaded file.");
        }
    }

    void writeIntoFile(){
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("\nEnter String to write into file : ");
            String s = br.readLine();
            PrintWriter writer = new PrintWriter("/media/sony/96D0-6DBE/STUDY/file2.odt");
            writer.println(s);
            writer.close();
            System.out.println("\nContent has Written into file.");
        }catch(Exception e){
            System.out.println(e);
        }
    }

    void readFromFile() throws FileNotFoundException, IOException{
        try (BufferedReader br = new BufferedReader(new FileReader("/media/sony/96D0-6DBE/STUDY/file2.odt"))) {
            String line = null;
            System.out.println("\nYou have written : \n");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }
    }

    public static void main(String[] args) throws FileNotFoundException, IOException {

        TestFile tf=new TestFile();
        tf.createFile();
        tf.writeIntoFile();
        tf.readFromFile();

    }

}