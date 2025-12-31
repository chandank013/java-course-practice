import java.lang.*;



class Parent
{
    public Parent()    // constructors are the method of the class that autometically executed when object is created in the main method;
                        // constructors executed from top to buttom
    {
        System.out.println("Parent Constrcutor");
    }
            
}

class Child extends Parent
{
    public Child()
    {
        System.out.println("Child Constructor");
    }
}

class GrandChild extends Child
{
    public GrandChild()
    {
        System.out.println("Grand Child Constructor");
    }
}
public class InheritCons1 
{

    public static void main(String[] args) 
    {
        // Parent p=new Parent();

        // Child p=new Child();

        GrandChild p=new GrandChild();
       
    }
    
}