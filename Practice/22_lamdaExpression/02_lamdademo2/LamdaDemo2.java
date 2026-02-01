
interface MyLambda 
{
    public void display();
}

/*class Demo   // lamda expression is similer to inner classes.
{
    int temp=38;   // lamda expression can captured instance variable they may may not be final and even lamda expression can modify the instance variable

    public void method1()
    {
        int count=0;   // we can use those variable in lamda which either decleared as final or if not final then we should not modify inside the method

        MyLambda ml=()->{
            // int count=0;   // lamda expression can have their own variable.
            // count++;
            System.out.println("Hi");
            System.out.println("Bye"+ (++temp));  // allowed
        };

        ml.display();

    }

}*/


class UseLamda  // yes, lamda expression can be pass as the method as an object or parameter.
{

    public void callLamda(MyLambda ml)
    {
        ml.display();
    }
}

class Demo1
{
    public void method2()
    {
        UseLamda ul=new UseLamda();
        ul.callLamda(()->{System.out.println("Hello Bhai!");});
    }
}

public class LamdaDemo2 
{

    public static void main(String[] args) 
    {
        /*Demo d=new Demo();
        d.method1();*/

        Demo1 d=new Demo1();
        d.method2();
        
        
    }
    
}