/*import Java.lang.*;  

// Thread Class by implementing Runnable
class MuRun implements Runnable
{
    public void run(){}
}

public class ThreadClass
{

    public static void main(String args[]) throws Exception
    {
        Thread t=new Thread(new MyRun());  // Here passing of annonymos object of MyRun without any referances.
    }
}*/



/*// Thread Class by creating our own class that extending from Thread and Demo of method of it.

class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
        setPriority(Thread.MIN_PRIORITY+2);
    }
    
}

public class ThreadClass
{

    public static void main(String args[]) throws Exception
    {
        MyThread m=new MyThread("My Thread 01");

        System.out.println("Id: "+m.getId());
        System.out.println("Name: "+m.getName());
        System.out.println("Priority: "+m.getPriority());
        m.start();
        System.out.println("State: "+m.getState());
        System.out.println("Alive: "+m.isAlive());


    }
}*/



// Demo of sleep method of Thread Class 

class MyThread extends Thread
{
    public MyThread(String name)
    {
        super(name);
    }
    public void run()
    {
        int count=1;
        while(true)
        {
            System.out.println(count++);
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                System.out.println(e);
            }
        }
    }
    
}

public class ThreadClass
{

    public static void main(String args[]) throws Exception
    {
        MyThread m=new MyThread("My Thread 01");

      m.start();
      m.interrupt();  // here we see how a thread is sleeping and how a sleeping thread can be intrrupt.

    }
}