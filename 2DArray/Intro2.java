public class Intro2 {
    public static void main(String[] args) {
        // When u want to initialise the array by your own
        int arr[][] = new int[][]{{1,2},{2,3,6, 5},{6},{}};
        // u want to know number of rows
        int total_rows = arr.length;
        System.out.println("Number of Rows: " + total_rows);
        System.out.println("The new 2D array is:");
        for(int row=0;row<total_rows;row++){
            for(int col=0;col<arr[row].length;col++){
                System.out.print(arr[row][col] + " ");
            }
            System.out.println();
        }
    }
}
