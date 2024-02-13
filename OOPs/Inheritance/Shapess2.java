package OOPs.Inheritance;

interface Shapes_Super{
    void calArea();
}

class Shape_Circle implements Shapes_Super{

    @Override
    public void calArea() {
        System.out.println( "The area of Circle is 314" );
    }
    
}
class Shape_Rectangle implements Shapes_Super{
    @Override
    public void calArea() {
        System.out.println( "The area of Rectangle is 628" );
    }
}
class Shape_Square implements Shapes_Super{
    @Override
    public void calArea() {
        System.out.println( "The area of Square is 500" );
    }
}
public class Shapess2 {
    
}
