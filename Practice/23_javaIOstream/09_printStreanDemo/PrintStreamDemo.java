import  java.lang.*;


import java.io.*;

class Student
{
    int rollno;
    String name;
    String dept;
}

public class PrintStreamDemo
{
    public static void main(String[] args) throws Exception
    {
        /*FileOutputStream fos=new FileOutputStream("D:/GitHub/Java/Practice/23_javaIOstream/09_printStreanDemo/student.txt");
        PrintStream ps=new PrintStream(fos);
        
        
        Student s=new Student();
        s.rollno=13;
        s.name="Chandan";
        s.dept="DSAI";
        
        ps.println(s.rollno);
        ps.println(s.name);
        ps.println(s.dept);
        
        ps.close();
        fos.close();*/

        FileInputStream fis=new FileInputStream("D:/GitHub/Java/Practice/23_javaIOstream/09_printStreanDemo/student.txt");
        BufferedReader br=new BufferedReader(new InputStreamReader(fis));
        

        Student s = new Student();
        s.rollno=Integer.parseInt(br.readLine());
        s.name=br.readLine();
        s.dept=br.readLine();

        System.out.println("Roll No :"+s.rollno);
        System.out.println("Name :"+s.name);
        System.out.println("Department :"+s.dept);
    }    
}