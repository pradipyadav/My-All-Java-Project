package collection;

import java.util.List;

public class LinkedList
{
    public static void main(String[] args) {

        List<String> list=new java.util.LinkedList<>();

        list.add("Pradip");
        list.add("Yadav");
        list.add("Rohit");
        list.add("Pradip");

        for (String s:list)
        {
            System.out.println(s);
        }
    }
}
