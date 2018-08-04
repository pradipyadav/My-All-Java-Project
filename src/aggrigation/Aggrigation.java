package aggrigation;

public class Aggrigation
{
    int id;
    String name;

    Aggrigation(int id ,String name)
    {
        this.id=id;
        this.name=name;
    }

    void show()
    {
        System.out.println(id);
        System.out.println(name);
    }
}

class AggrigationSecond
{
    String address;
    String state;

    AggrigationSecond(String address,String state)
    {
        this.address=address;
        this.state=state;
    }
}

class Student
{
    String city;
    int zipCode;
    Aggrigation aggrigation;
    AggrigationSecond aggrigationSecond;

    Student(String city,int zipCode,Aggrigation aggrigation,AggrigationSecond aggrigationSecond)
    {
        this.city=city;
        this.zipCode=zipCode;
        this.aggrigation=aggrigation;
        this.aggrigationSecond=aggrigationSecond;
    }

    void display()
    {
        System.out.println("  Id : "+aggrigation.id+"\n"+"  name : "+aggrigation.name+"\n"+ "  City : "+city+"\n"+"  ZipCode : "
        +zipCode);
        System.out.println("  Address : "+aggrigationSecond.address+"\n"+"  State : "+aggrigationSecond.state);
    }

    public static void main(String[] args) {
        Aggrigation aggrigation=new Aggrigation(1,"Pradip");
        AggrigationSecond aggrigationSecond1=new AggrigationSecond("Indapur","Maharashtra");
        Student student=new Student("Pune",413120,aggrigation,aggrigationSecond1);
        student.display();
    }
}







