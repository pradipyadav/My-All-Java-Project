package collection;
import java.util.*;
import java.util.ArrayList;

public class Student
{
    int a;
    String name;
    int age;

    Student(int a,String name,int age)
    {
        this.a=a;
        this.name=name;
        this.age=age;
    }
}

class ArraylistDemo
{
    public static void main(String[] args) {

        Student s1=new Student(1,"Pradip",23);
        Student s2=new Student(2,"Rohit",24);
        Student s3=new Student(3,"Akshay",23);

        List<Student> s=new ArrayList();
        s.add(s1);
        s.add(s2);
        s.add(s3);
        for (Student f:s)
//          System.out.println(f);
        System.out.println("Id= "+f.a+"\n"+"Name= "+f.name+"  Age= "+f.age);
    }
}
