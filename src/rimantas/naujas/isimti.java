package rimantas.naujas;

import java.util.Arrays;

    public class isimti {
    public static void main(String[] args) {
        int arr[] = {1, 2, 4, 5};
        int index = 3;
        int position = 2;
        int result[];
        System.out.println("1. inserts another int at position 3");
        result = helper.atAny(position, index, arr);
        System.out.println(Arrays.toString(result));
        System.out.println("2. inserts another int at the start");
        result = helper.atStart(0, index, arr);
        System.out.println(Arrays.toString(result));
        System.out.println("3. inserts another int at the end");
        result = helper.atEnd(arr.length, index, arr);
        System.out.println(Arrays.toString(result));
        System.out.println("4. removes element at position 3");
        result = helper.removeAny(index, arr);
        System.out.println(Arrays.toString(result));
        System.out.println("5. removes first element");
        result = helper.atStart(arr);
        System.out.println(Arrays.toString(result));
        System.out.println("6. removes last element");
        result = helper.atEnd(arr);
        System.out.println(Arrays.toString(result));
    }
}


