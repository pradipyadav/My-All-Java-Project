package javaPractice;

public class OddAndEvenNO

{
    public static void main(String[] args) {

        int[] a={1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

        System.out.println("Printing Odd and Even Numbers between 1 to 20");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print("  "+a[i]);
        }

        System.out.println("\n "+"Even Numbers =");
        for(int i=0 ; i<20 ; i++)
        {
            if(a[i] %2 ==0 )
            {
                System.out.print(" "+a[i]);
            }
        }
        System.out.println(" \n " + "And");

        System.out.println("Odd Numbers = ");
        for(int i=0 ; i<20 ; i++)
        {
            if(a[i] %2 !=0 )
            {
                System.out.print(" "+a[i]);
            }
        }

    }
}
