package Function;

import java.util.Scanner;

public class PrimeNumber {

    // return type + arguments
    static boolean isPrime(int n){
        for(int i = 2;i<n;i++){
            if (n % i == 0) return false;
        }

        return true;
    }

    // no return type + arguments
    static void isPrime2(int number){
        for(int i = 2;i<number;i++){
            if (number % i == 0){
                System.out.println(number + " : Not a prime number");
                return;
            }
        }

        System.out.println(number + " : A prime number");
        return;

    }
    public static void main(String[] args) {
        System.out.println("Enter a range");
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        // boolean ans = isPrime(n);
        // System.out.println(n + " is Prime : " + ans);
        // isPrime2(n);

        // I want to check all num in range is prime or not
        // for(int i =2;i<=n;i++){
        //     isPrime2(i);
        // }

        // I want to check each num in range whether it is prime
        // nd if it prime then print it

        for(int i=2;i<=n;i++){
            if(isPrime(i)){
                System.out.println(i + " is  a prime number");
            }
    }
    }
}
