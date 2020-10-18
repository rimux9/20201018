import java.util.Arrays;
import java.util.Scanner;

public class pamoka2Nd {


    // public static void main(String[] args) {


    //8. Refactor. peles desini>refactor>extract method>irasom pavadinima

        /*penketuku();
        desimtuku();
        penkioliktuku();*/


    //9. Write a program that swaps 2 values (a,b). a = b and b = old a.
        /*int a, b, kibiras;

        a = 4;
        b = 5;

        System.out.println(a);
        System.out.println(b);

        kibiras = a;
        a = b;
        b = kibiras;

        System.out.println(a);
        System.out.println(b);*/

    //10.compare 2 integers and return the grater one.

      /*  Integer a = 10;
        Integer b = 12;
        if( a > b ) {


            System.out.println("a > b ");

        } else {
            System.out.println("b > a ");
        }*/

    //11. Write a Java program to find if a year is a leap year or not?

       /* int y;
        y = 2000;

        boolean isLeap = false;

        if((y % 4 == 0 && y%100 != 0) || y%400 == 0) {


            System.out.println(y + " is  leap year.");
        } else {
            System.out.println(y + " is not  leap year.");
        }*/

    //12. Write a program that given array: it finds the second smallest number.

          /*  int[] n = {1, 5, 7, 2, 3, 6, 9, 10, 0, 10, 10, 11, 10, 5, 1, 5, 1, 0, -5, -21, 1, 0, 0, 3, -3, 3, -20};
            int smallest = 0;
            int secondSmallest = 0;

            for (int i = 0; i < n.length; i++) {
                if (n[i] == smallest) {
                    secondSmallest = smallest;
                } else if (n[i] < secondSmallest) {
                    secondSmallest = n[i];
                }

            }
            System.out.println("The second smallest number is: " + secondSmallest);*/

   /* }

    private static int[] insert(int[] array, int newint, int value) {
        int[] result = new int[array.length + 1];
        for (int i = 0; i < value; i++) {
            result[i] = array[i];
        }
        result[value] = newint;
        for (int i = value + 1; i <= array.length; i++) {
            result[i] = array[i - 1];
        }
        return result;
    }


    public static void main1(String[] args) {
        int[] array = {1, 2, 4, 5};
        int newint = 3;
        int position = 2;
        array = insert(array, newint, position);
        System.out.println(Arrays.toString(array));*/

    //1. 2. 3. uzduotys
       /*private static int[] insert(int[] array, int newint, int position) {
        int[] result = new int[array.length + 1];
        for (int i = 0; i < position; i++) {
            result[i] = array[i];
        }
        result[position] = newint;
        for (int i = position + 1; i <= array.length; i++) {
            result[i] = array[i - 1];
        }
        return result;
    }*/



    }

