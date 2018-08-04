package recursion;

public class RecusionDemp {

    static int count=0;
    void show()
    {
        if(count<=3) {

            count++;
            System.out.println("hello");
            show();
        }
    }

    public static void main(String[] args) {

        new RecusionDemp().show();

    }

}
