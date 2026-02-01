import java.lang.*;  // Mehod REference (Using thois reference we can assign any method which is taking single string as parameter we can call that method.)


@FunctionalInterface
interface MyLambda   // when an interface has single method then i.e called functional interface
{
    public void display(String str);
}

public class LamdaDemo3 {

    // Constroctor
    public LamdaDemo3(String s)
    {
        System.out.println(s.toUpperCase());
    }

    /*02public void reverse(String str)  
    {
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }*/

    /*01public static void reverse(String str)  
    {
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb);
    }*/

    public static void main(String[] args)   
    {

        MyLambda ml= LamdaDemo3::new;   // assign constructor of a class as references method.
        ml.display("Hello Bhai!");
        
        /*02LamdaDemo3 ld=new LamdaDemo3();
        MyLambda ml=ld::reverse;    // Using thois reference we can assign any method which is taking single string as parameter we can call that method. if that method non static then we have to create object put the name at the class name.
        ml.display("Hello Bhai!");*/


        /*01MyLambda ml=LamdaDemo3::reverse;    // Using thois reference we can assign any method which is taking single string as parameter we can call that method.
        ml.display("Hello Bhai!");*/
    }


    /*public static void main(String[] args)
    {
        MyLambda ml=System.out::println;   // println will assign to display now display will look like println method.
        ml.display("Hello Bhai!");
    }*/
    
}