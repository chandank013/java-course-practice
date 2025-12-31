import java.lang.*;


class Circle     // Base or Super Class
{
    private double radius;

    public Circle()   // constructor
    {
        radius=7.0;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(double r)
    {
        if(r>0)
        {
            radius=r;
        }
        else
        {
            radius=0;
        }
    }

    public double area()
    {
        return Math.PI*(radius*radius);
    }

    public double circumference()
    {
        return 2*Math.PI*radius;
    }
}



class Cylinder extends Circle   // Derived or Sub class
{
    
    private double height;

    public Cylinder()
    {
        height=14.0;
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double h)
    {
        if(h>0)
        {
            height=h;
        }
        else{
            height=0;
        }
    }

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
        System.out.println("Area is: "+c1.area());
        System.out.println("Circumference is: "+c1.circumference());


        Cylinder c2=new Cylinder();
        System.out.println("Volume is: "+c2.volume());

    }
}