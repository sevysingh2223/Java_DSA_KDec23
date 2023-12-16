public class Fibonacci {
    public static void main(String[] args) {
        int term =13;
        int firstValue = 0;
        int secoundValue = 1;

        System.out.print(firstValue +" ");
        System.out.print(secoundValue +" ");

        for(int i = 1 ; i<= term-2;i++){
            int sum = firstValue + secoundValue;
            System.out.print(sum + " ");
            firstValue = secoundValue;
            secoundValue = sum;
        }
    }
}
