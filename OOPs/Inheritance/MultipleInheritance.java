package OOPs.Inheritance;

interface ABC{
    int methodA();  //Interface can have methods as well, but they are abstract by default in Java
}

interface BCD{
    int methodA();
}

class CDE implements  ABC,BCD {
    CDE(){
        System.out.println("C is created");
    }
    @Override
    public int methodA() {
        return 10;
    }   
}


public class MultipleInheritance {
    public static void main(String[] args) {
        CDE c1 =  new CDE();
        c1.methodA();
        // System.out.println(cObj.methodA());
    }
}
