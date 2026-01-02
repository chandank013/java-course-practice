package mypack2;  // non-sub class within the same package
                  // private member is also net accesible in non-sub class of same member


public class Demo5
{

    Demo4 d=new Demo4();

    public void show()
    {
        System.out.println(d.a+d.b+d.c+d.d);
    }
}