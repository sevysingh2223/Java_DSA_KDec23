package Recursion;

import java.util.Scanner;

public class KMinBYRec {

    static int kSmallest(int arr[] , int k){
        if(k == 1){
            int index = findMin(arr);
            return arr[index];
        }
        int index = findMin(arr);
        arr[index] = Integer.MAX_VALUE;
        return kSmallest(arr, k-1);
    }

    static int findMin(int arr[]){
        int min = arr[0];
        int index = 0;
        for(int i=1;i<arr.length;i++){
            if(min > arr[i]){
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = new int[]{3, 7, 10, 25, 48};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value of k: ");
        int k = scan.nextInt();
        int ans = kSmallest(arr, k);
        System.out.println(ans);

    }
}
