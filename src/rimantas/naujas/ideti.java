package rimantas.naujas;

import java.util.Arrays;

public class ideti {


    private static int[] insert(int[] array, int newint, int position) {
        int[] result = new int[array.length + 1];
        for (int i = 0; i < position; i++) {
            result[i] = array[i];
        }
        result[position] = newint;
        for (int i = position + 1; i <= array.length; i++) {
            result[i] = array[i - 1];
        }
        return result;
    }


        public static void main (String[]args) {
            int[] array = {1, 2, 4, 5};
            int index = 3;
            int position = 2;

            array = insert(array, index, position);
            System.out.println("1. Creates a function that inserts another int at ANY specified position in array");
            System.out.println(Arrays.toString(array));
            System.out.println("---------------------------------");

            System.out.println("2. Creates a function that inserts another int at the start of array");
            array = insert(array, index, 0);
            System.out.println(Arrays.toString(array));
            System.out.println("---------------------------------");

            System.out.println("3. Creates a function that inserts another int at the end of array");
            array = insert(array, index, array.length);
            System.out.println(Arrays.toString(array));
            System.out.println("---------------------------------");
        }
    }


