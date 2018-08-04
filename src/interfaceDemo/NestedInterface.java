package interfaceDemo;

public interface NestedInterface
{
    void call();

}

interface Nested extends NestedInterface
{
    void msg();
}
class Implimentation implements Nested
{
    @Override
    public void msg() {
        System.out.println("Printing Nested Loop");
    }


    public static void main(String[] args) {
        System.out.println("The Nested Loop is are");

        Nested n=new Implimentation();
        n.msg();
        n.call();
    }

    @Override
    public void call() {
        System.out.println("hello");
    }
}