import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        System.out.println("Enter num1");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        System.out.println("Enter num2");
        int num2 = scan.nextInt();

        System.out.println("Sum Is : " + (num1 + num2));
        System.out.println("Difference Is : " + (num1 - num2));
        System.out.println("Product Is : " + (num1 * num2));
        System.out.println("Quotient Is : " + (num1 / num2));
        System.out.println("Remainder Is : " + (num1 % num2));
    }
}








// 11.	A Insurance Company have a following polices (Insurance Premium Calculation program)
// User Input :
// a.	Person Name
// b.	Person gender
// c.	Person Age
// d.	Person city (Metro or Non-Metro)
// Conditions:
// if person age is 25 to 35 and gender is male and city is metro , Output is Premium is 6%
// if person age is 25 to 40 and gender is male and city is non-metro, Output is Premium 4%
// if person age is 25 to 42 and gender is female and city is Metro, Output is Premium 3%
// if person age is 25 to 45 and gender is female and city is non-metro , output is Premium 2%
// else
//  Not Insured

