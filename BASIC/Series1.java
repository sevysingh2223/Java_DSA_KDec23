public class Series1 {
    public static void main(String[] args) {
        int n=3;
        double sum = 0;
        for(int i = 1;i<=n;i++){
            sum = sum + Math.pow(i , 2);
        }

        System.out.println("Sum upto " + n + " is : " + sum);
    }
}
