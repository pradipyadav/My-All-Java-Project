package polymorphism;

public class MethodOverloading {

    void show()
    {
        System.out.println("inside default show");
    }

    int show(int id)
    {
        System.out.println("id : "+id);
        return 0;
    }

    void show(float id)
    {
        System.out.println("id : "+id);
    }


    public static void main(String[] args) {
        MethodOverloading methodOverloading=new MethodOverloading();
        methodOverloading.show(11.1F);
        methodOverloading.show(11);
        methodOverloading.show();
    }
}
