public class SumN {
    public static void main(String[] args) {
        int n=6;
        int sum = 0;
        for(int i = 1;i<=n;i++){
            sum = sum + i;
        }

        System.out.println("Sum upto " + n + " is : " + sum);
    }
}
