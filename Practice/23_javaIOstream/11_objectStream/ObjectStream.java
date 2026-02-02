import java.lang.*;

// It must implements srialisable and should not have parameterised constructor and it only serialised onle non-static member and non-transiant member

import java.io.*;

class Student implements Serializable
{
    private int rollno;
    private String name;
    private float avg;
    private String dept;
    public static int Data=10;  // not be stored
    public transient int t;     // not be stored
    
    public Student()
    {
        
    }
    public Student(int r,String n,float a,String d)
    {
        rollno=r;
        name=n;
        avg=a;
        dept=d;
        Data=500;
        t=500;
    }
    
    public String toString()
    {
        return "\nStudent Details\n"+
                "\nRoll "+rollno+
                "\nName "+name+
                "\nAverage "+avg+
                "\nDept "+dept+
                "\nData "+Data+
                "\nTransient "+t+"\n";
    }
    
}

public class ObjectStream
{

    /*public static void main(String[] args) throws Exception
    {
        FileOutputStream fos=new FileOutputStream("D:/GitHub/Java/Practice/23_javaIOstream/11_objectStream/Student.txt");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        
        Student s=new Student(13,"Chandan",89.9f,"DSAI");
        
        oos.writeObject(s);
        
        fos.close();
        oos.close();
        
    }*/

   // Program for reading the data
   public static void main(String[] args) throws Exception
    {
        FileInputStream fis=new FileInputStream("D:/GitHub/Java/Practice/23_javaIOstream/11_objectStream/Student.txt");
        ObjectInputStream ois=new ObjectInputStream(fis);
        
        Student s=(Student)ois.readObject();
        
        System.out.println(s);
        
        fis.close();
        ois.close();
        
    }
}