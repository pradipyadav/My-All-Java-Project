package encapsulation;

import java.util.Scanner;

public class EncapsulationE
{
    public static void main(String[] args) {

        Scanner c=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=c.nextLine();

        EncapsulationExam exam=new EncapsulationExam();
        exam.setName(s);

        System.out.println("Given string is: ");
        System.out.println(exam.getName());

    }
}
