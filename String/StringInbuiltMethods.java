package String;

public class StringInbuiltMethods {
    public static void main(String[] args) {
        String str = "Hello";

        // for(int i =0;i<str.length();i++){
        //     System.out.println(str.substring(i));
        // }

        // int j = 2;
        // for(int i =0;i<str.length();i++){
        //     System.out.println(str.substring(i, j));
        // }
        // System.out.println(str.length());

        String edu = "       education is the key to success     ";
        System.out.println(edu.substring(2,6));

        System.out.println(edu.indexOf('i'));
        System.out.println(str.lastIndexOf('l'));
        System.out.println(edu.indexOf("cat"));
        System.out.println(edu.trim());
        System.out.println(str.contains("o"));
    }
}

// length
// reverse
// palindrome
// count vowels
// toLowerCase
// toUpperCase

