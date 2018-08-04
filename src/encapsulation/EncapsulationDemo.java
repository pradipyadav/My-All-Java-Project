package encapsulation;

import java.util.Scanner;

public class EncapsulationDemo {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String s=scanner.nextLine();

        EncapsulationD encapsulationD=new EncapsulationD();
        encapsulationD.setName(s);


        System.out.println(encapsulationD.getName());
    }
}
