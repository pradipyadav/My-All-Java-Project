package abstractDemo;

abstract public class AbstractClass {


    abstract void show();

    void display()
    {
        System.out.println("in display method");
    }
}

class CheckAbstraction extends AbstractClass
{


    @Override
    void show() {
        System.out.println("override abstract method");
    }

    public static void main(String[] args) {
        CheckAbstraction checkAbstraction=new CheckAbstraction();
        checkAbstraction.show();
        checkAbstraction.display();
    }
}
