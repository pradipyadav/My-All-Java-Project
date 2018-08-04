package wrapper;

public class WrapperDemo {
    public static void main(String[] args) {
        int i=20;
        int j=20;
        Integer inti=Integer.valueOf(j);
        Integer integer=Integer.valueOf(i);
        int k=integer.intValue();
        System.out.println(integer.equals(inti));
        System.out.println(k);

    }
}
