public class Series6Print {
    public static void main(String[] args) {
        
        int n =5;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.print(" + " + i+"/"+(i+1) +" ");
            }
            else{
                System.out.print(" - " + i+"/"+(i+1) +" ");
            }
        }
        // System.out.println("SUm of series is : "+ sum);
    }
}
