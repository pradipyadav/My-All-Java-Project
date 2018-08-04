package innerClasses;

public class MethodInnerClass {

    void innerMethod()
    {
        class CheckMethodInner

            {
                void display()
                {
                    System.out.println("inside method inner");
                }
            }

            CheckMethodInner checkMethodInner=new CheckMethodInner();
        checkMethodInner.display();

        }

    public static void main(String[] args) {
        MethodInnerClass methodInnerClass=new MethodInnerClass();
        methodInnerClass.innerMethod();
    }
    }

