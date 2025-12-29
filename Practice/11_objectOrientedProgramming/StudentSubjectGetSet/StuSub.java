import java.lang.*;

class Subject
{

    public String subID;
    public String name;
    public int maxmarks;
    public int marksObtain;


     public Subject(String SubId)   // constructor
    {
        subID=SubId;
    }
    public Subject(String SubId,String name,int marksObtain)
    {
        subID=SubId;
        this.name=name;
        setMarksObtain(marksObtain);
    }
    public Subject(String SubId,String name,int maxmarks,int marksObtain)
    {
        subID=SubId;
        this.name=name;
        setMaxMark(maxmarks);
        setMarksObtain(marksObtain);
    }


    public String getSubId()
    {
        return subID;
    }
    public String getName()
    {
        return name;
    }
    public int getMarks()
    {
        return maxmarks;
    }
    public int getMarksObtain()
    {
        return marksObtain;
    }


    public void setMaxMark(int m)
    {
        if(m>0)
        {
            maxmarks=m;
        }
        else
        {
            maxmarks=0;
        }
    }

    public void setMarksObtain(int n)
    {
        if(n>0)
        {
            marksObtain=n;
        }
        else
        {
            marksObtain=0;
        }
    }

    public boolean IsQualified()
    {
        return marksObtain>=maxmarks/10*4;
    }

    public String toString()
    {
        return "\nSubject ID: "+subID+" \n Name : "+name+" \n Marks Obtained: "+marksObtain+" \n";
    }


}







class Student
{

    public String rollNo;
    public String name;
    public String dept;
    public String subjects;


     public Student(String RollNo)
    {
        rollNo=RollNo;
    }
    public Student(String RollNo,String name)
    {
        rollNo=RollNo;
        this.name=name;
    }
    public Student(String RollNo,String name,String dept,String subjects)
    {
        rollNo=RollNo;
        this.name=name;
        this.dept=dept;
        this.subjects=subjects;
        
    }


    public String getRollNo()
    {
        return rollNo;
    }
    public String getName()
    {
        return name;
    }
    public String getDept()
    {
        return dept;
    }
    public String getSubjects()
    {
        return subjects;
    }


    public void setSubject( String sub)
    {
        subjects=sub;
    }

}


public class StuSub
{

    public static void main(String arg[])
    {
    
        Subject s1[]=new Subject[4];
        s1[0]=new Subject("s101","DS",80);
        s1[1]=new Subject("s102","Algorithms",86);
        s1[2]=new Subject("s103","Operating System",88);

        for(Subject s:s1)
        {
            System.out.println(s);
        }

    }
}