package collection;

import exceptionHandling.Parent;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AddAll
{
    public static void main(String[] args) {

        List<String> l1=new ArrayList<>();
        l1.add("Pradip");
        l1.add("Raj");
        l1.add("Rohit");

        List<String> l2=new ArrayList<>();
        l2.add("Yadav");
        l2.add("Sir");
        l2.add("gaikwad");

        List<String> l3=new ArrayList<>();
        l3.add("Java");
        l3.add("Angular");
        l3.add("Python");

        l1.addAll(l2);
//        for (String f:l1)
//        {
//            System.out.println(f.compareTo("Pradip"));
//        }

        Iterator e=l1.iterator();
        while (e.hasNext()){
            System.out.println(e.next());
        }
    }
}
