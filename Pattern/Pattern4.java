package Pattern;

public class Pattern4{
    public static void main(String[] args) {
        int n = 7;

        // row
        for(int row=1;row<=n;row++){
            // space
            for(int space=1;space<=row-1;space++){
                System.out.print(" ");
            }

            // star
            for(int star =1;star<=n-row+1;star++){
                System.out.print("*");
            }
            // Move to next row / line
            System.out.println();
        }
    }
}