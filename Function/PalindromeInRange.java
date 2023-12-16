package Function;

import java.util.Scanner;

public class PalindromeInRange {

    static int reverseNum(int number){
        int reversedNumber = 0;
        while(number > 0){
            int rem = number%10;
            reversedNumber = reversedNumber * 10+ rem;
            number /= 10;
        }
        return reversedNumber;
    }

    static boolean isPalindrome(int number){
        if(number == reverseNum(number)){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        // System.out.println("Enter a range");
        // Scanner scan = new Scanner(System.in);
        // int n=scan.nextInt();
        int start = 10;
        int end = 25;
        for(int i=start;i<=end;i++){
            if(isPalindrome(i)){
                System.out.println(i + " is  a palindrome number");
            }
    }
    }
}
