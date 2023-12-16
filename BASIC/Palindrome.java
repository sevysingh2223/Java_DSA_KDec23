public class Palindrome {
    public static void main(String[] args) {
        int n = 1298562311;
        int copy = n;
        int rev = 0;
        int count =0;
        while(n>0){
            count +=1;
            int rem = n%10;
            rev = rev *10 + rem;
            n /= 10;
        }
        System.out.println("Count is : "+count);
        System.out.println("Original number is  :" + copy);
        System.out.println("Reverse is : " + rev);
        if( copy==rev){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }
    }
}
