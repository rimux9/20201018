package rimantas.idetiIsimti.ND3;

public class ArrayHelpers {
    public static int[] insertAtAnyIndex(int numb, int index, int[] arr) {
        int[] modArray = insert(numb, index, arr);
        return modArray;

    }

    public static int[] insertAtStart(int numb, int index, int[] arr) {
        int[] modArray = insert(numb, 0, arr);
        return modArray;
    }

    public static int[] insertAtEnd(int numb, int index, int[] arr) {
        int indx = (arr.length);
        int[] modArray = insert(numb, indx, arr);
        return modArray;
    }

    public static int[] removeAnyIndex(int index, int[] arr) {
        int[] modArray = remove(index, arr);
        return modArray;
    }

    public static int[] removeAtStart(int[] arr) {
        int[] modArray = remove(0, arr);
        return modArray;
    }

    public static int[] removeAtEnd(int[] arr) {
        int indx = (arr.length - 1);
        int[] modArray = remove(indx, arr);
        return modArray;
    }

    private static int[] insert(int numb, int index, int[] arr) {
        int[] modArray = new int[arr.length + 1];
        for (int i = 0; i < index; i++) {
            modArray[i] = arr[i];
        }
        for (int i = index; i < arr.length; i++) {
            modArray[i + 1] = arr[i];
        }
        return modArray;

    }

    private static int[] remove(int index, int[] arr) {
        int[] modArray = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            modArray[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            modArray[i - 1] = arr[i];
        }
        return modArray;
    }

    private static void printArr(int[] answer) {
        for (int i = 0; i < answer.length; i++) {
            System.out.println(answer[i]);
        }
    }

}
