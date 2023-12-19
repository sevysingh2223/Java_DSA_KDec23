public class Pattern5{
    public static void main(String[] args) {
        
        int n=5;
        for(int i=1;i<=n;i++){
            int count = n-1;
            int sum = 0;
            for(int j=1;j<=i;j++){
                if(j==1){
                    System.out.print(i +" ");
                }
                else if(j==2){
                    sum = i+count;
                    System.out.print(sum +" ");
                    count--;
                }
                else{
                    sum = sum + count;
                    System.out.print(sum+" ");
                    count--;
                }
            }
            System.out.println();

        }
    }
}