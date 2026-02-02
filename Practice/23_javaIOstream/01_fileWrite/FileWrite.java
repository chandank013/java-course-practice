import java.lang.*;
import java.io.*;

public class FileExample
{
    public static void main(String args[]) throws Exception
    {
        try (FileOutputStream fos = new FileOutputStream("D:/GitHub/Java/Practice/23_javaIOstream/Text.txt")) {
            String str = "Learn java programming";
            byte b[] = str.getBytes();
            fos.write(b);
        }
    }


    /*public static void main(String args[])
    {
        try
        {
            try
            {
                FileOutputStream fos=new FileOutputStream("D:/GitHub/Java/Practice/     23_javaIOstream/Text.txt");
                String str="Learn java programming";

                byte b[]=str.getBytes();
                fos.write(b, 6, str.length()-6);

                /*byte b[]=str.getBytes();
                for(byte x:b)
                {
                    fos.write(x);
                }*/
           
                // OR

                // fos.write(str.getBytes());

                /*fos.close();
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
    }*/
}