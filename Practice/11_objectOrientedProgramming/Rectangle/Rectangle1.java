import java.lang.*;


class Rectangle {

    public double length;
    public double breadth;

    public double area()
    {
        return length*breadth;
    }

    public double perimeter()
    {
        return 2*(length+breadth);
    }
}

public class Rectangle1 {
    
    public static void main(String arg[]) 
    {
        Rectangle r1=new Rectangle();
        r1.length=4.0;
        r1.breadth=8.8;

        System.out.println("Area: "+r1.area());
        System.out.println("Perimeter: "+r1.perimeter());
    }
}
