package Algorithms;

public class InsertionSort {
    public static void insertionSort(int[] array)
    {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            // Move elements of array[0..i-1], that are greater than key. to one position ahead.
            while (j >= 0 && array[j] > key)
            {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 9, 1, 5, 7};

        System.out.println("Before sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();

        insertionSort(arr);

        System.out.println("After sorting");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
