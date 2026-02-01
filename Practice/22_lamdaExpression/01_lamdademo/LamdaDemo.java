import java.lang.*;

/*// lambda expression is used for defining annonymous method or nameless method.


@FunctionalInterface
interface MyLambda    // when an interface has single abstract method then i.e called functional interface
{
    public void display();
}

/*class My implements MyLambda
{
    public void display()
    {
        System.out.println("Hello World");
    }
}


public class LamdaDemo {

    public static void main(String[] args) {
        
        /*MyLambda m=new My();
        m.display();
        

        MyLambda m=  ()->{System.out.println("Hello World");};   // Annonymous inner class conversion in to lamda class (at palce of method name we have to write only a braket i.e (annonymous method))
        
        m.display();
        
    }
    
}*/


@FunctionalInterface
interface MyLambda 
{
    // public void display(String str);
    public int add(int x, int y);
}

public class LamdaDemo {

    public static void main(String[] args) 
    {

        // MyLambda m= (s)->{System.out.println(s);};   // Annonymous method
        // m.display("Hello World!");


        // MyLambda m= (a,b)->{return a+b;};
        // OR
        MyLambda m= (a,b)-> a+b;
        System.out.println(m.add(24,44));
        
        
    }
    
}