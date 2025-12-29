import java.lang.*;


class Rectangle {

    private double length;
    private double breadth;

    public double getLength()
    {
        return length;
    }
    public void setLength(int l)
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

    public double getBreadth()
    {
    return breadth;
    }
    public void setBreadth(int b)
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


    public double area()
    {
        return length*breadth;
    }

    public double perimeter()
    {
        return 2*(length+breadth);
    }
}

public class DataHiding1 {
    
    public static void main(String arg[]) 
    {
        Rectangle r1=new Rectangle();
        r1.setLength(8);
        r1.setBreadth(8);

        System.out.println("Area: "+r1.area());
        System.out.println("Perimeter: "+r1.perimeter());
    }
}
