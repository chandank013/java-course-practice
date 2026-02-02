import java.lang.*;

import java.io.*;

public class ByteDemo 
{
    public static void main(String[] args) throws Exception
    {
        
        byte c[]={'a','b','c','d','e','f','g','h','i','j'};
        ByteArrayInputStream bis=new ByteArrayInputStream(c);
        int x;


        /*String str = new String(bis.readAllBytes());
        System.out.println(str);
        System.out.println(bis.markSupported());*/
        

        /*while((x=bis.read())!=-1)
        {
            System.out.println((char)x); 
        }*/

        bis.close();

        ByteArrayOutputStream bos=new ByteArrayOutputStream(20);

        bos.write('a');
        bos.write('b');
        bos.write('c');
        bos.write('d');

        // For printing the output
        byte b[]=bos.toByteArray();
        for(byte y:b)
        {
            System.out.println((char)y);
        }
        
        // Write the content in the file
        bos.writeTo(new FileOutputStream("D:/GitHub/Java/Practice/23_javaIOstream/04_byteDemo/Text.txt"));

        bos.close();
        
        /*char c[]={'a','b','c','d','e','f','g','h','i','j'};
        
        CharArrayReader cr=new CharArrayReader(c);
        
        int x;
        
        while((x=cr.read())!=-1)
        {
            System.out.print((char)x);
            
        }
        
        cr.close();*/
        
    }
}