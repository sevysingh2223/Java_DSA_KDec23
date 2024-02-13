package OOPs.Polymorphism;

public class AutomaticPromotion {

    static int print(int a){
        return a;
    }

    // static int print(char a){
    //     return a;
    // }

    static int print(float a){
        System.out.println(a);
        return 1;
    }
    public static void main(String[] args) {
        System.out.println("integer value " + print(5));
        System.out.println("character value " + print('e'));
        System.out.println("float value " + print(53.6f));
    }
}
