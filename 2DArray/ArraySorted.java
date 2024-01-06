import java.util.Scanner;

public class ArraySorted {

    // static boolean isSorted_iter(int arr[][]){
    //     for(int i=0;i<arr.length;i++){
    //         for(int j=0;j<arr[i].length-1;j++){
    //             if (arr[i][j]>arr[i][j+1]){
    //                 return false;
    //             }
    //         }
    //     }
    //     return true;
    // }

    static boolean isSorted_rec(int arr[][], int i ,int j){
        if((i==arr.length-1) && (j == arr[i].length-1)){
            return true;
        }
        if(j == arr[i].length-1){
            isSorted_rec(arr, i+1, 0);
        }
        if (arr[i][j]>arr[i][j+1]){
                    return false;
        }
        isSorted_rec(arr, i, j+1);
        return false;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int total_rows = scan.nextInt();
        System.out.println("Enter number of columns");
        int total_cols= scan.nextInt();
        int[][] arr = new int[total_rows][total_cols];
        System.out.println("Enter elements");
        for(int row=0;row<total_rows;row++){
            for(int col=0;col<total_cols;col++){
                arr[row][col] = scan.nextInt();
            }
            System.out.println();
        }

        // System.out.println("Array Sorted ? " + isSorted_iter(arr));
        System.out.println("Array Sorted ? " + isSorted_rec(arr , 0 ,0));
        scan.close();
    }
}
