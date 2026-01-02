import java.lang.*;


// 01. Nested Inner Class  (class inside another class cannot directly access outside the classes)


class Outer
{
    static int x=10;
    Inner i=new Inner();
    
    class Inner
    {
        int y=20;
        public void innerDisplay()
        {
            System.out.println(x+" "+y);
        }
    }
    
    public void outerDisplay()
    {
        
        i.innerDisplay();
        System.out.println(i.y);
        
    }
}

public class NestedInner1 {

    public static void main(String[] args) 
    {
        Outer.Inner oi=new Outer().new Inner();   // indirectly access of inner class ouside outer class
        oi.innerDisplay();

        Outer o=new Outer();
        o.outerDisplay();
        
    }
    
}