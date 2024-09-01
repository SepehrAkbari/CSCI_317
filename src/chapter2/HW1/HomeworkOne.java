/*
 * My name is Sepehr, I'm a sophomore CS major, and potentially a Math & Data Science minor.
 * I'm taking this course of course as part of my requirements, but also as I think its perhaps the most important topic in my field, and will elevate me from a programmer to a computer scientist, who can understand, rather than just writing for functionality. So, I am very excited.
 * Reading (mostly humanities) and writing programs are about it, I also try to hangout with people and workout as much as life allows.
 * Python, Java, C, SQL, JS, HTML/CSS, R. I hate frontend, but have unfortunetly worked with it a lot. Favorite language is definetly C, I wish it was a bit easier to write it though. I've also worked with many different frameworks and libraries especially in Python.
 * I hope to have a good understanding of the material. I want to be able to analyze code in a higher level, and be thinking about efficiency while doing anything. I hope to move away from doing basic intereface projects, and move on to research and exploratory projects, with help of this course.
 */

package chapter2.HW1;

import chapter1.Array.MyArray;
import chapter2.OrderedArray.MyOrderedArray;

public class HomeworkOne {
    public static void main(String[] args) {
        //// Problem 2.a ////

        final int SIZE = 100;
        MyArray arr1 = new MyArray(SIZE);
        MyArray arr2 = new MyArray(SIZE * 10);
        MyArray arr3 = new MyArray(SIZE * 100);

        //// Problem 2.b ////

        for (int i = 0; i < SIZE * 100; i++) {
            if (i < SIZE) {
                arr1.add((int) (Math.random() * SIZE));
            } else if (i < SIZE * 10) {
                arr2.add((int) (Math.random() * (SIZE * 10)));
            } else {
                arr3.add((int) (Math.random() * (SIZE * 100)));
            }
        }

        //// Problem 2.c ////

        // Removing numbers from the end of the array
        long startTime_c = System.currentTimeMillis();
        System.out.println(arr1.remove());
        System.out.println(arr2.remove());
        System.out.println(arr3.remove());
        long endTime_c = System.currentTimeMillis();
        System.out.println("Total execution time for remove(): " + (endTime_c - startTime_c)); 
        // output: 0ms || 136165ns

        //// Problem 2.d ////
        
        // Searching randomly chosen numbers
        long startTime_d = System.currentTimeMillis();
        System.out.println(arr1.search(500));
        System.out.println(arr2.search(2806));
        System.out.println(arr3.search(34));
        long endTime_d = System.currentTimeMillis();
        System.out.println("Total execution time for search(): " + (endTime_d - startTime_d)); 
        // output: 0ms || 57375ns (two found, one not found)

        // Searching numbers that are NOT in the array
        long startTime_d2 = System.currentTimeMillis();
        System.out.println(arr1.search(SIZE));
        System.out.println(arr2.search(SIZE * 10));
        System.out.println(arr3.search(SIZE * 100));
        long endTime_d2 = System.currentTimeMillis();
        System.out.println("Total execution time for search(): " + (endTime_d2 - startTime_d2)); 
        // output: 0ms || 166959ns

        //// Problem 2.e ////

        // Inserting randomly chosen numbers
        long startTime_e = System.currentTimeMillis();
        arr1.add(56);
        arr2.add(965);
        arr3.add(3420);
        long endTime_e = System.currentTimeMillis();
        System.out.println("Total execution time for add(): " + (endTime_e - startTime_e));
        // output: 0ms || 1416ns
    }
}
//// Problem 2.f ////

// Output (each test is slightly different of course):
/*
53
364
907
Total execution time for remove(): 0
-1
-1
5785
Total execution time for search(): 0
-1
-1
-1
Total execution time for search(): 0
Total execution time for add(): 0
*/

