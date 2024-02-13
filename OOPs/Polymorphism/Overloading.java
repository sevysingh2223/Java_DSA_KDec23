package OOPs.Polymorphism;

class Shape{
    int l,b;
    Shape(){
        System.out.println("Object  Created");
    }
    Shape(int x){
        this.l = x;
        squareArea(l);
        squarePer(l);
    }

    Shape(int x, int y){
        this.l=x;
        this.b=y;
        rectArea(l,b);
        rectPer(l,b);
    }

    void squareArea(int l){
        System.out.println("Area of Square is : " + (l*l));
    }

    void squarePer(int l){
        System.out.println("Perimeter of square is : "+ (4*l));
    }

    void rectArea(int l, int b){
        System.out.println("Area of rectangle is : "+ l*b);
    }
    void rectPer(int l, int b){
        System.out.println("Perimeter of Rectangle is : "+(2*(l+b)));
    }

}
public class Overloading {
    public static void main(String[] args) {
        Shape s1 =new Shape(5);
        System.out.println("==========================================");
        Shape s2= new Shape(4,5);
    }
}
