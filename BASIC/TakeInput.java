import java.util.Scanner;

public class TakeInput {
    public static void main(String[] args) {
        // Scanner is a class
        // U have to initialize an object of it
        // new is a keyword
        // allocates memory

        // i want to print a message
        System.out.println("Enter Number ");
        Scanner scan_obj = new Scanner(System.in);
        int number = scan_obj.nextInt();
        System.out.println("Entered number was : " + number + " by the user");

        System.out.println("Enter Number2 ");
        int number2 = scan_obj.nextInt();
        System.out.println("Entered number2 was : " + number + " by the user");

        // System.out.println("Enter Name ");
        // String name = scan_obj.next();
        // System.out.println("Entered name was : " + name + " by the user");
        // scan_obj.close();


        scan_obj.nextLine();

        System.out.println("Enter Name ");
        String name = scan_obj.nextLine();
        System.out.println("Entered name was : " + name + " by the user");
        System.out.println("Enter Decimal Number ");
        Float f_num = scan_obj.nextFloat();
        System.out.println("Entered num was : " + f_num + " by the user");


        scan_obj.close();


        // .next() will take input untill it recieves a blank space
        // .nextLine() takes enter as input
    }
}
