import java.util.Arrays;
import java.util.Scanner;

public class spalio11 {

    // Find index of a the number searched
// Return -1 if not found.
// For example:
// int[] numbers = {1,2,5,18};
// int index = find(numbers, 5);
// output: 2.
// int index = find(numbers, 3);
// output: -1.
    /*public static void main(String[] args) {
        int[] numbers = {1,2,5,18};
        int IndexOfSearchable = Find(numbers, 20);
        System.out.println("Result " + IndexOfSearchable);
    }
    private static int Find (int[]numbers, int ToSearch) {
        for (int i=0; i < numbers.length; i++)  {
            if (numbers[i] == ToSearch){
                return i;
            }
        }
        return -1;
    }*/

    //2. Find indeces of all numbers to be searched in an array
    // Example:
    //int nubmers = {1,4,2,1,6,3,1};
    //int[] indecesOfNubmerSearched = findAll(numbers, 1);
    //output: {0,  3, 6}
    //int nubmers = {0, 0};
    //int[] indecesOfNubmerSearched = findAll(numbers, 1);
    // output: {}
    //11:48
    //int nubmers = {0, 0};
    //int[] indecesOfNubmerSearched = findAll(numbers, 0);
    //output: {0, 1}






        /*public static void main(String[] args) {
            // 2. Find indeces of all numbers to be searched in an array
            int[] numbers = {1, 4, 2, 1, 6, 3, 1};
            Scanner values = new Scanner(System.in);
            int v = values.nextInt();
            int[] indexes = find(numbers, v);
            print(indexes);
        }

        private static int[] find(int numbers[], int v) {
            int[] result = new int[0];
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == v) {
                    result = add(result, i);
                }
            }
            return result;
        }

        private static int[] add(int[] numbers, int toAdd) {
            int[] numbers2 = new int[numbers.length + 1];
            for (int i = 0; i < numbers.length; i++) {
                numbers2[i] = numbers[i];
            }
            numbers2[numbers.length] = toAdd;
            return numbers2;
        }

        private static void print(int[] indexes) {
            for (int i = 0; i < indexes.length; i++) {
                System.out.println(indexes[i]);
            }*/


    /*public static int[] insertX(int n, int arr[], int x, int pos)
    {
        int i;
        int newarr[] = new int[n + 1];

        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i - 1];
        }
        return newarr;
    }

    public static void main(String[] args)
    {

        int n = 3;
        int i;

        int arr[]
                = { 1, 2, 4,};

        System.out.println("Array" + Arrays.toString(arr));

        int x = 3;
        int pos = 3;

        arr = insertX(n, arr, x, pos);

        System.out.println(+ x + " inserted at position " + pos +"    "+ Arrays.toString(arr));*/


    }













