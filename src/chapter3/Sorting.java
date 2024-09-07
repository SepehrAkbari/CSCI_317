package chapter3;

public class Sorting {
    public static void bubbleSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
        }
    }

    public static void selectionSort(int[] array) {
        int current = 0;
        for (int j = 0; j < array.length; j++) {
            int smallestIndex = current + 1;
            for (int i = current + 1; i < array.length; i++) {
                if (array[i] < array[current]) {
                    smallestIndex = i;
                }
            }
            if (array[smallestIndex] < array[current]) {
                swap(array, current, smallestIndex);
            }
            current++;
        }
    }

    public static void insertionSort(int[] array) {
        int lastSorted = 0;
        for (int j = 0; j < array.length - 1; j++) {
            int firstUnsorted = lastSorted + 1;
            int marked = array[firstUnsorted];
            int i;

            for (i = lastSorted; i >= 0; i--) {
                if (marked < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }

            array[i + 1] = marked;
            lastSorted++;
        }
    }

    private static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    public static boolean isSorted(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
