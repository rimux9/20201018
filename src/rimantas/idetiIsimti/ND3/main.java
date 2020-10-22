package rimantas.idetiIsimti.ND3;

import java.util.Arrays;

public class main {
    //    1. Create a function that inserts another int at ANY specified position in array
    public static void main(String[] args) {
        int arr[] = {1, 5, 6, 7, 8, 22, -5, -8, -55};
        int index = 5;
        int numb = 3;
        int answer[];
        System.out.println("1. Create a function that inserts another int at ANY specified position in array.");
        answer = ArrayHelpers.insertAtAnyIndex(numb, index, arr);
        System.out.println(Arrays.toString(answer));


        System.out.println("2. Create a function that inserts another int at the start of array");
        answer = ArrayHelpers.insertAtStart(numb, index, arr);
        System.out.println(Arrays.toString(answer));

        System.out.println("3. Create a function that inserts another int at the end of array.");
        answer = ArrayHelpers.insertAtEnd(numb, index, arr);
        System.out.println(Arrays.toString(answer));


        System.out.println("4. Create a function that removes element at ANY specified position.");
        answer = ArrayHelpers.removeAnyIndex(index, arr);
        System.out.println(Arrays.toString(answer));

        System.out.println("5. Create a function that removes first element of an array.");
        answer = ArrayHelpers.removeAtStart(arr);
        System.out.println(Arrays.toString(answer));

        System.out.println("6. Create a function that removes last element of array.");
        answer = ArrayHelpers.removeAtEnd(arr);
        System.out.println(Arrays.toString(answer));

    }

}
