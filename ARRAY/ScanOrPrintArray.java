package ARRAY;

import java.util.Scanner;

public class ScanOrPrintArray {
    public static void main(String[] args) {
        // int arr[] = new int[]{1, 2, 3, 4, 5};
        // int size = arr.length;
        // System.out.println("The array elements are");
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);
        // System.out.println(arr[5]);

        // for(int i=0;i<size;i++){
        //     System.out.println(arr[i]);
        // }
        // Enhanced For Loop

        // for(int element : arr){
        //     System.out.println(element);
        // }

        // ===================printing data elements

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scan.nextInt();
        int arr2[] = new int[size];

        System.out.println("Enter element in the array");

        for(int i=0;i<size;i++){
            arr2[i]= scan.nextInt();
        }

        for(int i : arr2){
            System.out.print(i +"   ");
        }

        System.out.println(017);
    }
}


// Print odd elements in an array
// Print even elements in an array
// Print elements that are on even indices in an array
// Sum of all elements in an array
// Product of all elements in an array
// Find the target element
//      user input : number   output : index
// Count number of occurrences of a given element
// Count the number of times a specific element appears in an array

// Min element
// Max element
// Span................
// Is array sorted
// Reverse array
// Missing Number
// Sort 0 and 1
// Second Min Element
// Second Max Element