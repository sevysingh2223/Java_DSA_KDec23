package OOPs.Inheritance;

class Father{
    Father(){
        System.out.println("I am a father");
    }
    Father(String name){
        System.out.println("father's name is  : " + name);
    }
    void greet(){
        System.out.println("Welcome to Mittal's Family : Father");
    }
    void displayAge(){
        System.out.println("Father age is 50");
    }
}
class Son extends Father{
    Son(){
        super(); // calling the constructor of the parent class
        System.out.println("I am a Son");
    }
    Son(String name){
        
        System.out.println("My Name is " +name);
    }
    void greet(){
        super.greet();
        System.out.println("Welcome to Mittal's Family : Son");
    }
    void displayAge(){
        System.out.println("Son age is 20");
    }
}

public class SingleLevel {
    public static void main(String[] args) {
        // Son P1 = new Son();
        Son P2 = new Son("Kunal");
        P2.displayAge();
        P2.greet();
    }
}


