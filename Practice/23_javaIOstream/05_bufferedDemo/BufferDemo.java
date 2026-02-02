import java.lang.*;

import java.io.*;

public class BufferDemo 
{
    public static void main(String[] args)throws Exception 
    {
        
        /*FileInputStream fis=new FileInputStream("D:/GitHub/Java/Practice/23_javaIOstream/Text.txt");
        BufferedInputStream bis=new BufferedInputStream(fis);
        
        int x;
        while((x=bis.read())!=-1)
        {
            System.out.println((char)x);
        }
        System.out.println("File "+fis.markSupported());
        System.out.println("Buffer "+bis.markSupported());

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();

        System.out.print((char)bis.read());
        System.out.print((char)bis.read());*/

        FileReader fis=new FileReader("D:/GitHub/Java/Practice/23_javaIOstream/Text.txt");
        BufferedReader bis=new BufferedReader(fis);
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.mark(10);
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        bis.reset();
        
        System.out.print((char)bis.read());
        System.out.print((char)bis.read());
        
        System.out.println("String "+bis.readLine());
        
        
    }    
}