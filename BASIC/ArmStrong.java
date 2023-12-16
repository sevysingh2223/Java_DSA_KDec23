public class ArmStrong {
    public static void main(String[] args) {
        int n = 121;
        // copied number
        int copy = n;
        // to determine count of digits
        int count =0;
        double sum =0;
        // to count digits
        while(copy>0){
            count +=1;
            copy /=10;
        }
        // bcoz copy == 0 now that's why 
        copy = n;
        // System.out.println("Count is : "+count);

        // sum of digits raised to power count
        while(copy>0){
            int rem = copy%10;
            sum = sum + Math.pow(rem, count);
            copy/=10;
        }

        // now time to check 
        // whether number is equal to sum
        if(sum == n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong number");
        }
    }
}
