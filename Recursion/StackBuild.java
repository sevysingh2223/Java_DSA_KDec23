package Recursion;

public class StackBuild {

    // static int count =0;
    static void printName(String name, int count){
        // base condition to terminate the recursion
        if(count ==5){
            return;
        }
        // logic
        System.out.println(name);
        // recursive call to the same function
        printName(name,count+1);
    }
    public static void main(String[] args) {
        printName("Ram",0);
    }
}
