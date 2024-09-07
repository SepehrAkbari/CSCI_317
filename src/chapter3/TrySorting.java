package chapter3;

import chapter3.Sorting;

public class TrySorting {
    public static void main(String[] args) {
        final int SIZE = 100;

        int[] array = new int[SIZE];
        
        final int RANGE = 10;
        for (int i = 0; i < SIZE; i++) {
            array[i] = (int)(Math.random() * RANGE);
        }

        System.out.println("Array:");
        for (int num:array) {
            System.out.print(num + ", ");
        }
        System.out.println("\n");

        long startTime = System.currentTimeMillis();
        Sorting.selectionSort(array); // Sorting the array
        long endTime = System.currentTimeMillis();

        System.out.println("Sorted Array:");
        for (int num:array) {
            System.out.print(num + ", ");
        }

        System.out.println("\n");

        System.out.println("\nSorted? " + Sorting.isSorted(array));
        System.out.println("Time taken: " + (endTime - startTime) + "ms");

    }

    public static void initialize(int[] array) {
        final int SIZE = 100;
        final int RANGE = 10;
        for (int i = 0; i < SIZE; i++) {
            array[i] = (int)(Math.random() * RANGE);
        }
    }
}
