import java.lang.*;


interface Test
{
    final static int X=10;  // it can have identifier which can be static and final

    //=> we can make the methods of interface public and abstract but not private becouse they are sippose to be implemented by the classes
    public abstract void meth1();
    public abstract void meth2();

    // =>Interface abstract method cannot have body but a interface can have static method with body
    public static void meth3()   //You cannot call it as m.meth3(); or override it in My.
    {
        System.out.println("Meth3 of Test");
    }


    // if i have to modify the interface in between then we should use (default) that could not disturb the other classes that are implemented priviously 


    //We can create private method inside interface but not use outside
    private void meth5() 
    {
        System.out.println("Meth5 of Test");
    }

    default void meth6()   // This method is not necessary to override in class my becouse it is default(static) but avobe two method must be overrride in class My. 
    {
        System.out.println("Meth5 of Test");
    }


}



interface Test2 extends Test
{
    void meth4();
}



class My implements Test2
{
    public void meth1(){System.out.println("Meth1");}
    public void meth2(){System.out.println("Meth2");}
    public void meth4(){System.out.println("Meth4");}
}


public class Do_Dont
{
    public static void main(String[] args) 
    {
        System.out.println(Test.X);  // Identifier can be obtained by interface name with dot(.) operator.
        Test.meth3();  // we can gate static member with interface name without creating object of interface method.

        // Test.meth5();  we cannot access the private class outside


        My m=new My();
        m.meth6();
        
    }
}