package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveAll
{

    public static void main(String[] args) {

        List<String> l1=new java.util.ArrayList<>();
        l1.add("Pradip");
        l1.add("Raj");
        l1.add("Rohit");
        l1.add("Yadav");

        List<String> l2=new java.util.ArrayList<>();
        l2.add("Yadav");
        l2.add("Sir");
        l2.add("gaikwad");
        l2.add("Pradip");

        List<String> l3=new ArrayList<>();
        l3.add("Java");
        l3.add("Angular");
        l3.add("Python");

        l3.removeAll(l2);
//        for (String f:l1)
//        {
//            System.out.println(f.compareTo("Pradip"));
//        }

        Iterator e=l3.iterator();
        while (e.hasNext()){
            System.out.println(e.next());
        }
    }
}
