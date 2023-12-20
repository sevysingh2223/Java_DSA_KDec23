package Recursion;

import java.util.Scanner;

public class PrintNto1 {

    static void printNum(int start, int end){
        // base case // termination case
        if(start < end){
            return;
        }

        // logic
        System.out.println(start);

        // recursive call
        printNum(start-1, end);
    }

    static void printNum2(int start, int end){
        // base case // termination case
        if(start > end){
            return;
        }

        // recursive call
        printNum2(start+1, end);

        // logic
        System.out.println(start);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNum(n, 1);
        System.out.println("---------------------------");
        printNum2(1, n);

    }
}
