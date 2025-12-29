import java.lang.*;


class Rectangle
{

    private double length;
    private double breadth;


    public Rectangle()
    {
        length=1;
        breadth=1;
    }

    public Rectangle(int l,int b)
    {
        // length=l;    // it just not make area zero
        // breadth=b;   

        setLength(l);   // it just make area zero due to setter and getter method
        setBreadth(b);
    }

    public Rectangle(double s)
    {
        length=breadth=s;
    }

    
    public double getLength()  //getter method
    {
        return length;
    }

    public double getBreadth()   //getter method
    {
    return breadth;
    }

    public void setLength(int l)    //setter method
    {
        if(l>0)
        {
            length=l;
        }
        else
        {
            length=0;
        }
    }

    public void setBreadth(int b)   //setter method
    {
        if(b > 0)
        {
            breadth=b;
        }
        else
        {
            breadth=0;
        }
    }

    
    public double area()   // Instanve method or faslitator
    {
        return length*breadth;
    }

    public double perimeter()
    {
        return 2*(length+breadth);
    }
}



public class RectTest
{

    public static void main(String arg[])
    {
        Rectangle r1=new Rectangle();
        System.out.println("Area: "+r1.area());

        Rectangle r2=new Rectangle(-10,-20);
        System.out.println("Area: "+r2.area());

        Rectangle r3=new Rectangle(10);
        System.out.println("Area: "+r3.area());
    }
}