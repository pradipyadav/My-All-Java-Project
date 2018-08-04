package wrapper;

public class PrimitiveToWrapper
{
    public static void main(String[] args) {
        int a=20;
        Integer i= Integer.valueOf(a);
        int j=a;
        System.out.println(a+ " "+i +" " +j );
    }
}
