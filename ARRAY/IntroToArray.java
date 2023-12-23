package ARRAY;

import java.util.Scanner;

public class IntroToArray {
    public static void main(String[] args) {
        
        // Array is a collection of homogenious data
        // Declare an array
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size = scan.nextInt();
        float[] arr=new float[size];

        // Array has an inbuilt method called length
        // which returns the number of elements present

        int arr_len = arr.length;
        System.out.println("The length of arrray is : " + arr_len);

        // Elements in array are stored continously
        // but they can be accessed using index
        // and index always starts with 0

        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        // by default every element is set to be default value of datatype

    }
}
