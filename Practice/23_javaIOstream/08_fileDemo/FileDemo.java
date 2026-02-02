import java.lang.*;

import java.io.*;

public class FileDemo
{
    public static void main(String[] args) throws Exception
    {
        // select path of any directory on you computer
       File f=new File("D:/GitHub/Java/Practice/01_intro");
       
       System.out.println(f.isDirectory());
       File list[]=f.listFiles();
        
       for(File x:list)
       {
           System.out.println(x.getParent()+" "+x.getName());
       }
      
    }
}