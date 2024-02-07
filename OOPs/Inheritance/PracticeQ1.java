package OOPs.Inheritance;

class Shape{
    double width ,height;

    Shape(double w, double h){
        this.width = w;
        this.height =h;
    }
    void displayInfo(){
        System.out.println("Width of shape is : " +width);
        System.out.println("Height of shape is : " +height);
    }
}

class Rectangle extends Shape{

    Rectangle(double w, double h) {
        super(w, h);
        System.out.println(calculateArea(w,h));
    }

    int calculateArea(double w, double h){
        int area = (int)(w * h);
        System.out.println("Area of rectangle is: "+area);
        return area;
    }
}
public class PracticeQ1 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(52.6, 23.6);
        r1.displayInfo();
    }
}
// Create a superclass called Shape. It should have two instance variables:
// width and height, both of type double. Provide a constructor that initializes
// these variables, and a method displayInfo() that prints out the width and
// height of the shape.

// Then, create a subclass called Rectangle that inherits from Shape. It should
// have a constructor that calls the superclass constructor and sets the width
// and height. Additionally, add a method calculateArea() that calculates and
// returns the area of the rectangle.

// Finally, write a main class to test your Shape and Rectangle classes by
// creating an instance of Rectangle, setting its width and height, displaying
// its information, and calculating its area.