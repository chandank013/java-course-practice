import mypack2.Demo4;

public class Demo8   // nothing is accesible in different package having nun-sub class
{
    
    public static void main(String arg[])
    {
        Demo4 d1=new Demo4();
        d1.display();
        System.out.println(d1.a+d1.b+d1.c+d1.d);
    }
}