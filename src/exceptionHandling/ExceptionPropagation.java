package exceptionHandling;

public class ExceptionPropagation
{
   void m()
   {
       int data=50/0;
   }
   void n()
   {
       m();
   }
   void p()
   {
       try {
           n();
       }
       catch (ArithmeticException e){
           System.out.println(e);
       }
   }

    public static void main(String[] args) {
        ExceptionPropagation excwptionPropagation=new ExceptionPropagation();
        excwptionPropagation.p();
    }
}
