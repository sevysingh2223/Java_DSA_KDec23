public class BarChart{
    public static void main(String[] args) {
        // Create a bar chart object
        int arr[] ={5,2,6,3,1,4,2};

        // max element
        int max = arr[0];
        for (int i=1;i<arr.length;i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }

        while(max > 0){
            for(int i =0 ; i<arr.length;i++){
                if(arr[i] >= max ){
                    System.err.print( "* ");
                }
                else{
                    System.err.print("  ");
                }
            }
            System.out.println();
            max--;
        }

        for(int e :arr){
            System.out.print(e + " ");
        }
    }
}