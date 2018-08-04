package interfaceDemo;

public interface MultipleInheritance
{
    void msg();
}
interface Multiple
{
    void call();
}

class Activity implements MultipleInheritance,Multiple
{
    @Override
    public void msg() {
        System.out.println("Send Messages");
    }

    @Override
    public void call(){
        System.out.println("Calling Someone");
        }

    public static void main(String[] args) {
        Activity a=new Activity();
        a.call();a.msg();
    }
}

