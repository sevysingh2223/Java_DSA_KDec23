package ARRAY;

public class KMin {
    static void findKMinElement(int arr[] , int k){
        for(int j=1;j<=k;j++){
            int min = arr[0];
            int index=0;
            for(int i=0;i<arr.length;i++){
                if(min > arr[i]){
                    min = arr[i];
                    index = i;
                }
            }
            System.out.println(j +" Smallest Element " + arr[index]);
            arr[index] = Integer.MAX_VALUE;
        }
    }
    public static void main(String[] args) {
        int arr[] = new int[]{120, 34, 56, 78, 90};
        findKMinElement(arr, 4);
    }
}
