package newProject;

import java.util.*;

public class Demo {

    static void printpairs(int arr[], int sum) {

        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];

            // checking for condition
            if (temp >= 0 && s.contains(temp)) {
                System.out.println("Output: " + "  [" + arr[i] + ", " + temp + "]");
            }
            s.add(arr[i]);
        }
   }

        public static void main (String[] args){

            // taking String array input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of array");
        int length = sc.nextInt();

        // create a String array to save user input
        int[] input = new int[length];

        // loop over array to save user input
        System.out.println("Please enter array elements");
        for (int i = 0; i < length; i++) {
            int arr = sc.nextInt();
            input[i] = arr;
        }

        System.out.print("Input Array : ");
        System.out.println(Arrays.toString(input));

            Scanner s=new Scanner(System.in);
            System.out.print("Required Sum: ");
            int n=s.nextInt();

            printpairs(input, n);
        }
    }
