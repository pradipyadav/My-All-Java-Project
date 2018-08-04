package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorInterface
{
    public static void main(String[] args) {

        List<String> l=new ArrayList<>();
        l.add("Pradip");
        l.add("Akshay");
        l.add("Rohit");
        l.add(1,"Daulat");

        System.out.println("Second Possition:  "+l.get(2));
//        for(String s:l)
//        {
//            System.out.println(s);
//        }

        System.out.println("Traversing element in forward direction");
        ListIterator e=l.listIterator();
        while (e.hasNext());
        System.out.println(e);
        System.out.println("Traversing element in backword direction");
//        ListIterator e=l.listIterator();
        while (e.hasPrevious());
        System.out.println(e);
    }
}
