package collection;

import java.util.List;

public class ArrayList
{
    public static void main(String[] args) {
        List<String> s=new java.util.ArrayList<>();
        s.add("Pradip");
        s.add("Rohit");
        s.add("Akshay");
        s.add("Daulat");

        for (String f:s)
        System.out.println(f);

    }
}
