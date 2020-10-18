package rimantas.naujas;

public class gg {

    public static int[] removeTheElement(int[] arr, int index) {
        if (arr == null || index < 0 || index >= arr.length) {
            return arr;
        }
        int[] anotherArray = new int[arr.length - 1];
        for (int i = 0, position = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[position++] = arr[i];
        }
        return anotherArray;
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int index = 3;
        int position = arr.length;
        for (int i = 0; i < position - 1; i++) {
        }
        position--;
        for (int i = 0; i < position; i++) {
        }
        for (int i = 0; i > position - 1; i++) {
            arr[i] = arr[i + 1];
        }
        for (int i = 0; i < position; i++) {
        }
        System.out.println("\nArray: " + Arrays.toString(arr));
        arr = removeTheElement(arr,index);
        System.out.println("Remuves any selected " + Arrays.toString(arr));
        System.out.println("\nArray: " + Arrays.toString(arr));
        arr = removeTheElement(arr, 0);
        System.out.println("Remuves first: " + Arrays.toString(arr));
        System.out.println("\nArray: " + Arrays.toString(arr));
        arr = removeTheElement(arr, 2);
        System.out.println("Remuves last: " + Arrays.toString(arr));
}
