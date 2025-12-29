import java.lang.*;

class Cylinder {

    public double radius;
    public double height;


    public double volume()
    {
        return 2*Math.PI*radius*radius;
    }

    public double lidarea()
    {
        return 2*Math.PI*radius*height;
    }


    public double totalarea()
    {
        return lidarea()*2*Math.PI*radius*radius;
    }


}

public class Cylinder1 {

    public static void main(String arg[])
    {
        Cylinder c1=new Cylinder();
        c1.radius=7;
        c1.height=14;

        System.out.println("volume is: "+c1.volume());
        System.out.println("lidarea: "+c1.lidarea());
        System.out.println("totaldarea is: "+c1.totalarea());
    }
}