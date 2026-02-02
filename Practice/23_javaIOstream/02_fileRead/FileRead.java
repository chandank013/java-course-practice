import java.lang.*;
import java.io.*;

public class FileRead
{
    public static void main(String args[]) throws Exception
    {
       /* // Method 01
        try (FileInputStream fis = new FileInputStream("D:/GitHub/Java/Practice/23_javaIOstream/intro.txt")) {

            byte b[] = new byte[fis.available()];
            fis.read(b);

        String str=new String(b);
        System.out.println(str);*/


        // Method 02
        try (FileInputStream fis = new FileInputStream("D:/GitHub/Java/Practice/23_javaIOstream/Text.txt"))
        {
            int x;

            // Using while
            while((x=fis.read())!=-1)
            {
                System.out.print((char)x);
            }

            /*// Using do-while loop
            do{
                x=fis.read();
                if(x!=-1)
                {
                    System.out.print((char)x);
                }
            }while(x!=-1);*/
            
        }
    }
}