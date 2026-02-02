import java.lang.*;

import java.io.*;

public class SdnIO
{
    public static void main(String[] args) throws Exception
    {
        
        /*FileInputStream fis1=new FileInputStream("Source1.txt");
        FileOutputStream fos3=new FileOutputStream("Source3.txt");

        int b;

        while((b=fis1.read())!=-1)
        {
            if(b>=65 && b<=120)fos3.write(b+32);
            else fos3.write(b);
        }
        
        fis1.close();
        fos3.close();*/

        FileInputStream fis1=new FileInputStream("Source1.txt");
        FileInputStream fis2=new FileInputStream("Source3.txt");
        
        FileOutputStream fos=new FileOutputStream("Destination.txt");
                
        SequenceInputStream sis=new SequenceInputStream(fis1,fis2);
        
        
        int b;
        while((b=sis.read())!=-1)
        {
            
            fos.write(b);
        }
        
        sis.close();
        fis1.close();
        fis2.close();
        fos.close();
        
    }   
}