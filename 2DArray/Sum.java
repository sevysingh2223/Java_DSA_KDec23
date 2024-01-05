import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {
        //Initialise a 2d array
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows");
        int total_rows = scan.nextInt();
        System.out.println("Enter number of columns");
        int total_cols= scan.nextInt();
        int[][] arr = new int[total_rows][total_cols];

        int sum = 0;
        // Scan elements in a 2d array
        System.out.println("Enter elements");
        for(int row=0;row<total_rows;row++){
            for(int col=0;col<total_cols;col++){
                arr[row][col] = scan.nextInt();
                sum += arr[row][col];
            }
            System.out.println();
        }

        
        System.out.println("The 2D array is:");
        for(int row=0;row<total_rows;row++){
            for(int col=0;col<total_cols;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("The sum is : " + sum);
    }
}