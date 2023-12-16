package Function;

public class IntroToFunction {
    // Return type with arguments
    static int add(int num1 ,int num2){
       int result = num1 + num2;
       return  result ;
    }

    // No Return type with arguments
    static void sum(int num1 ,int num2){
       int result = num1 + num2;
       System.out.println(result);
       return ;
    }

    // Return type with no arguments
    static int product(){
        int  num1 = 25;
        int num2 = 20;
       int result = num1 * num2;
       return  result ;
    }

    // Return type with no arguments
    static void mul(){
        int  num1 = 25;
        int num2 = 20;
       int result = num1 * num2;
       System.out.println(result);
       return;
    }
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        // int ans = add(num1 , num2);
        // System.out.println(ans);
        // sum(num1, num2);
        // int ans = product();
        // System.out.println(ans);
        mul();
    }
}
