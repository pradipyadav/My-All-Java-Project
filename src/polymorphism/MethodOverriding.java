package polymorphism;

public class MethodOverriding {


    void show()
    {
        System.out.println("inside show");
    }

}

class Check extends MethodOverriding
        {

            void show()
            {
                System.out.println("inside check show");
            }

            public static void main(String[] args) {
                Check check=new Check();
                check.show();
            }

        }
