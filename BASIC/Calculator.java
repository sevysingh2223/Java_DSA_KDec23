import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter num1");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        System.out.println("Enter num2");
        int num2 = scan.nextInt();

        System.out.println("Enter choice : 1 Add \n 2 Subtract \n 3 Multiply \n 4 Quotient");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                System.out.println(num1 + num2);
                break;
        
            case 2:
                System.out.println(num1 - num2);
                break;
        
            case 3:
                System.out.println(num1 * num2);
                break;
        
            case 4:
                System.out.println(num1 / num2);
                break;
        
            default:
                System.out.println("Invalid Choice Entered");
                break;
        }
    }
}
