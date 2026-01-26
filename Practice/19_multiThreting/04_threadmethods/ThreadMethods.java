import java.lang.*;


/*// Daemon (Depending thread) and join (one thread will wait to complete the another thread) methods 
class MyThread extends Thread
{
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++);
        }
    }
}

public class ThreadMethods
{

    public static void main(String args[]) throws Exception
    {
        MyThread t=new MyThread();
        t.setDaemon(true);   // Daemon thread mean depending thread.
        t.start();

        // try{Thread.sleep(10);}catch(Exception e){} // main method will terminated for 100ms to run the other thread before terminating

        t.join();  // thread waits for thread t to finish.

        Thread mainThread=Thread.currentThread();
        mainThread.join();  // thread waits for itself to finish.

    }
}*/



// Yield Methods (yield gives chance to other threat to execute.)
class MyThread extends Thread
{
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++ +". My thread");
            Thread.yield();  // yield gives chance to other threat to execute
        }
    }
}

public class ThreadMethods
{

    public static void main(String args[]) throws Exception
    {
        MyThread t=new MyThread();
        t.start();

        int count=1;
        while(true)
        {
            System.out.println(count++ +". Main");
        }


    }
}