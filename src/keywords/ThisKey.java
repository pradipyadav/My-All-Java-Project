package keywords;

public class ThisKey {

    int id;
    String name;

    ThisKey(int id,String name)
    {
        this();
        this.id=id;
        this.name=name;
    }

    ThisKey()
    {

        System.out.println("inside default constructor");
    }

    void show()
    {
        System.out.println("id : "+id+" name : "+name);
        this.display();
    }

    void display()
    {
        System.out.println("inside display method");
    }
    public static void main(String[] args) {
        ThisKey thisKey=new ThisKey(1,"pradip");
        thisKey.show();
    }
}
