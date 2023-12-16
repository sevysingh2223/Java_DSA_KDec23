public class PrimeNumber {
    public static void main(String[] args) {
        int num = 21;
        int flag = 0;
        for(int i =2;i<num;i++){
            if(num % i ==0){
                flag = 1;
                System.out.println("Not Prime ");
                break;
            }
        }

        if(flag == 0){
            System.out.println("Prime number");
        }
    }
}
