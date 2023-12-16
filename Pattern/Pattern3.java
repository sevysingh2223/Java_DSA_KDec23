package Pattern;

public class Pattern3{
    public static void main(String[] args) {
        int n = 9;

        // row
        for(int row=1;row<=n;row++){
            // space
            for(int space=1;space<=n-row;space++){
                System.out.print(" ");
            }

            // star
            for(int star =1;star<=row;star++){
                System.out.print("*");
            }
            // Move to next row / line
            System.out.println();
        }
    }
}