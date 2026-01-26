import java.lang.*;


class MyRunnable implements Runnable  // Multithreating in two different class using Runnable Interface
{
    public void run()    // if we extends from thread class we must override run() methods for providing multithreaded functionality.
    {
        int i=1;
        while(true)
        {
            System.out.println(i+". Hello");
            i++;
        }
    }
}

public class RunnableTest
{

    public static void main(String args[])
    {
        MyRunnable n=new MyRunnable();
        Thread t=new Thread(n);
        t.start();

        int i=1;
        while(true)
        {
            System.out.println(i+". World!");
            i++;
        }
    }
}




// Multithreating in a single class using runnable inteface

/*public class RunnableTest implements Runnable
{

    public void run()    // if we extends from thread class we must override run() methods for providing multithreaded functionality.
    {
        int i=1;
        while(true)
        {
            System.out.println(i+". Hello");
            i++;
        }
    }

    public static void main(String args[])
    {
        RunnableTest n=new RunnableTest();
        Thread th=new Thread(n);
        th.start();

        int i=1;
        while(true)
        {
            System.out.println(i+". World!");
            i++;
        }
    }
}*/