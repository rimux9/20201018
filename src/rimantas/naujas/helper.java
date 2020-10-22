package rimantas.naujas;

        public class helper {
    public static int[] atAny(int numb, int index, int[] arr) {
        int[] result = insert(numb, index, arr);
        return result;
    }
    public static int[] atStart(int numb, int index, int[] arr) {
        int[] result = insert(0, index, arr);
        return result;
    }
    public static int[] atEnd(int numb, int index, int[] arr) {
        int indx = (arr.length);
        int[] result = insert(arr.length, index, arr);
        return result;
    }
    public static int[] removeAny(int index, int[] arr) {
        int[] result = remove(index, arr);
        return result;
    }
    public static int[] atStart(int[] arr) {
        int[] result = remove(0, arr);
        return result;
    }
    public static int[] atEnd(int[] arr) {
        int indx = (arr.length - 1);
        int[] result = remove(indx, arr);
        return result;
    }
    private static int[] insert(int position, int index, int[] arr) {
        int[] result = new int[arr.length + 1];
        for (int i = 0; i < position; i++) {
            result[i] = arr[i];
        }
        int newint = 3;
        result[position] = newint;
        for (int i = position + 1; i <= arr.length; i++) {
            result[i] = arr[i - 1];
        }
        return result;
    }
    private static int[] remove(int index, int[] arr) {
        int[] newArray = new int[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArray[i] = arr[i];
        }
        for (int i = index + 1; i < arr.length; i++) {
            newArray[i - 1] = arr[i];
        }
        return newArray;
    }
}




