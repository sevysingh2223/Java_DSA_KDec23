package Recursion;

import java.util.Scanner;

public class Print1toN {

    static void printNum(int start, int end){
        // base case // termination case
        if(start > end){
            return;
        }

        // logic
        System.out.println(start);

        // recursive call
        printNum(start+1, end);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        printNum(1, n);

    }
}
