package mypack3;  
import mypack2.Demo4;

public class Demo7 extends Demo4   // Different package having sub class
{

    public void show()
    {
        System.out.println(a+b+c+d);  // directly access the features without creating the object becouse, it barroe all the features of parent class
    }
}