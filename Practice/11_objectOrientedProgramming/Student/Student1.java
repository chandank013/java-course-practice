import java.lang.*;


class Student {

    public int roll;
    public String name;
    public String course;
    public int m1,m2,m3;


    public int total()
    {
        return m1+m2+m3;
    }

    public float average()
    {
        return (float)total()/3;
    }


    public char grade()
    {
        if((float)average()>=60)
        return 'A';
        else 
            return 'B';
    }

    public String details()
    {
        return "Roll no: "+roll+"\n"+"Name: "+name+"\n"+"Course: "+course+"\n";
    }
}

public class Student1{

    public static void main(String arg[])
    {
        Student s1=new Student();
        s1.roll=13;
        s1.name="Chandan Kumar";
        s1.course="DSAI";
        s1.m1=90;
        s1.m2=89;
        s1.m3=91;


        System.out.println(s1.details());
        System.out.println(s1.total());
        System.out.println(s1.average());
        System.out.println(s1.grade());
    }
}