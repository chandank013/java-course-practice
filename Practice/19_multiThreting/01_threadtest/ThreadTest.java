import java.lang.*;


/*class MyThread extends Thread  // Multithreating in two different class
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

public class ThreadTest
{

    public static void main(String args[])
    {
        MyThread t=new MyThread();
        t.start();

        int i=1;
        while(true)
        {
            System.out.println(i+". World!");
            i++;
        }
    }
}*/




// Multithreating in a single class

public class ThreadTest extends Thread
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
        ThreadTest t=new ThreadTest();
        t.start();

        int i=1;
        while(true)
        {
            System.out.println(i+". World!");
            i++;
        }
    }
}