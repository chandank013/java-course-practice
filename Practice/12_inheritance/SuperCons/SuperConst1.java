import java.lang.*;


class Rectangle
{
    int length;
    int breadth;
    
    Rectangle()
    {
        length=breadth=1;
    }
    Rectangle(int l,int b)
    {
        length=l;
        breadth=b;
    }
   
}

class Cuboid extends Rectangle
{
    int height;
    
    Cuboid()
    {
        height=1;
    }
    
    Cuboid(int h)
    {
        height=h;
    }
    Cuboid(int l,int b,int h)
    {
        super(l,b);
        height=h;
    }
    
    int volume()
    {
        return length*breadth*height;
    }
}


class Parent
{
    Parent()
    {
        System.out.println("Non-Param of parent");
    }
    Parent(int x)
    {
        System.out.println("Param of parent "+x);
    }
}

class Child extends Parent
{
    Child()
    {
        System.out.println("Non-Param of child");
    }
    Child(int y)
    {
        System.out.println("Param of child");
    }
    Child(int p,int y)  // name of "p" should be same or different
    {
        super(p);
        System.out.println("2 param of child "+y);
    }
}

public class SuperConst1 {

    public static void main(String[] args) {

        // Child c=new Child();
        // Child c=new Child(20);
        Child c=new Child(10,20);


        Cuboid cu=new Cuboid(5,3,10);
        System.out.println(cu.volume());
    }
    
}