package interfaceDemo;

public interface Drowable
{
    void drow();
}
class Rectangle implements Drowable
{

    @Override
    public void drow() {
        System.out.println("Drowing Rectangle");
    }
}
class Circle implements Drowable
{
    @Override
    public void drow() {
        System.out.println("Drowing Circle");
    }

    public static void main(String[] args) {
        Drowable d=new Circle() {
            @Override
            public void drow() {
                System.out.println("S");
            }
        };
        d.drow();
    }
}