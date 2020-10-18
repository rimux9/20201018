package rimantas.idetiIsimti;

import java.util.Arrays;
import java.util.Scanner;

public class idetiIsimti {
    public static void main(String[] args) {
        int[] numbers = {-10, 2, 3, 72, 5, -100, 74};
        didziausias(numbers);
        maziausias(numbers);
        didziausias2(numbers);
        sortedJavaMax2(numbers);
        sortedJavaMin2(numbers);
        maziausias2_2ciklai(numbers);
        int n = 10;
        int i;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // print the original array
        System.out.println("Initial Array:\n"
                + Arrays.toString(arr));
        // element to be added
        int x = 50;
        int indexPosition = 4;
        naujasMasyvas();
        int[] arr2;
        int[] arr1;
        int[] arr3;
        int[] arrRF;
        int[] arrRL;
        int[] arrRx;
        // call the method to add x in arr last
        arr3 = addXLast(n, arr, x);
        System.out.println("\nArray with last element " + x
                + " added:\n"
                + Arrays.toString(arr3));
        //call method to add x in array indexPosition
        arr1 = addXindexPosition(n, arr, x, indexPosition);
        System.out.println("\nArray with element " + x
                + " added in index position " + indexPosition + "\n"
                + Arrays.toString(arr1));
        // call the method to add x in arr first
        arr2 = addFirst(n, arr, x);
        System.out.println("\nArray with first element " + x
                + " added :\n"
                + Arrays.toString(arr2));
        arrRF = removeFirst(n, arr, x);
        System.out.println("\nArray with first element "
                + " removed :\n"
                + Arrays.toString(arrRF));
        arrRL = removeLast(n, arr, x);
        System.out.println("\nArray with last element "
                + " removed :\n"
                + Arrays.toString(arrRL));
        arrRx = removeIndexPositionX(n, arr, x, indexPosition);
        System.out.println("\nArray with " + indexPosition + " element "
                + " removed :\n"
                + Arrays.toString(arrRx));
        Scanner values = new Scanner(System.in);
        System.out.printf("Iveskite verte, kurios pozicija norite surasti ");
        int v = values.nextInt(); //ieskomas indeksas sios vertes
        int[] indexes = find(arr, v);
        print(indexes);
    }
    private static int[] find(int arr[], int v) {
        int[] result = new int[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v) {
                result = add(result, i);
            }
        }
        return result;
    } //klaseje
    private static int[] add(int[] arr, int toAdd) {
        int[] numbers2 = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            numbers2[i] = arr[i];
        }
        numbers2[arr.length] = toAdd;
        return numbers2;
    } //klaseje
    private static void print(int[] indexes) {
        for (int i = 0; i < indexes.length; i++) {
            System.out.println("Surasta verte indekso pozicijoje "+indexes[i]);
        }
    } //klaseje
    private static int[] removeIndexPositionX(int n, int[] arr, int x, int indexPosition) {
        int i;
        int newarr[] = new int[n - 1];
        for (i = 0; i < indexPosition; i++)
            newarr[i] = arr[i];
        for (i = indexPosition; i < n - 1; i++)
            newarr[i] = arr[i + 1];
        return newarr;
    }
    private static int[] removeLast(int n, int[] arr, int x) {
        int i;
        int newarr[] = new int[n - 1];
        for (i = 0; i < n - 1; i++)
            newarr[i] = arr[i];
        return newarr;
    }
    private static int[] removeFirst(int n, int[] arr, int x) {
        int i;
        int newarr[] = new int[n - 1];
        for (i = 0; i < n - 1; i++)
            newarr[i] = arr[i + 1];
        return newarr;
    }
    private static void naujasMasyvas() {
        int arr3[] = new int[10]; //kodel tinka bet koks masyvo elemento nr?
        int arr1[] = new int[10];
        int arr2[] = new int[10];
        int arrRL[] = new int[10];
        int arrRF[] = new int[10];
        int arrRx[] = new int[10];
    }
    private static int[] addXLast(int n, int[] arr, int x) {
        int i;
        int newarr3[] = new int[n + 1];
        for (i = 0; i < n; i++)
            newarr3[i] = arr[i];
        newarr3[n] = x;
        return newarr3;
    }
    private static int[] addFirst(int n, int[] arr, int x) {
        int i;
        int newarr1[] = new int[n + 1];
        for (i = 1; i < n + 1; i++)
            newarr1[i] = arr[i - 1];
        newarr1[0] = x;
        return newarr1;
    }
    private static int[] addXindexPosition(int n, int[] arr, int x, int indexPosition) {
        int i;
        int newarr2[] = new int[n + 1];
        for (i = 0; i < indexPosition; i++) {
            newarr2[i] = arr[i];
        }
        newarr2[indexPosition] = x;
        for (i = indexPosition + 1; i < n + 1; i++)
            newarr2[i] = arr[i - 1];
        return newarr2;
    }
    private static int didziausias(int[] numbers) {
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("max  " + max);
        return max;
    }
    private static int maziausias(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("min  " + min);
        return min;
    }
    private static int didziausias2(int[] numbers) {
        int max = numbers[0];
        int max2 = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max2 && numbers[i] < max) {
                max2 = numbers[i];
            }
        }
        System.out.println("max2=  " + max2);
        return max2;
    }
    private static void sortedJavaMax2(int[] numbers) {
        java.util.Arrays.sort(numbers);
        int ilgis = numbers.length;
        System.out.println("sorted max2=" + numbers[ilgis - 2]);
    }
    private static void sortedJavaMin2(int[] numbers) {
        java.util.Arrays.sort(numbers);
        System.out.println("sorted Min2=" + numbers[1]);
    }
    private static void maziausias2_2ciklai(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        int min2 = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min2 && numbers[i] > min) {
                min2 = numbers[i];
            }
        }
        System.out.println("min2_2ciklai=" + min2);
    }
}


