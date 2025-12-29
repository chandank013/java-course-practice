import java.lang.*;

class Circle
{
    public double radius;  // Properties
    

    // Below all are methods
    public double area()   
    {
        return Math.PI * radius *radius;
    }

    
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }


    public double circumference()
    {
        return perimeter();
    }
}


class Cylinder extends Circle   // extend is used for inherit the properties
{
    public double height;
    
    public double volume()
    {
        return area()*height;
    }
    
}


public class Circle1 
{
    public static void main(String arg[])
    {

        Circle c1=new Circle();
        Circle c2=new Circle();
        c1.radius=7;
        c2.radius=14;

        System.out.println("Area: "+c1.area());
        System.out.println("Perimeter: "+c1.perimeter());
        System.out.println("Circumference: "+c1.circumference());


        System.out.println("Area: "+c2.area());
        System.out.println("Perimeter: "+c2.perimeter());
        System.out.println("Circumference: "+c2.circumference());

    }

}