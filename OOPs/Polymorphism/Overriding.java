package OOPs.Polymorphism;

class A1{
    A1(){
        System.out.println( "A1 Default Constructor Called" ); 
    }
    void display(){
        System.out.println("Inside A1");
    }
}

class B1 extends A1{
    B1(){
        System.out.println( "B1 Default Constructor Called" ); 
    }
    @Override
    void display(){
        System.out.println("Inside B1");
    }
}
public class Overriding {
    public static void main(String[] args) {
        B1 obj = new B1();
        obj.display();
    }
}
