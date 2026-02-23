package reverseecho;

import java.lang.*;

import java.net.*;
import java.io.*;

public class ReverseEcho 
{
            
    public static void main(String[] args) throws Exception
    {
        ServerSocket ss=new ServerSocket(2000);
        Socket stk=ss.accept();
        
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        

        String msg;
        do
        {
            msg=br.readLine();
            StringBuilder sb=new StringBuilder();
            sb.reverse();
            msg=sb.toString();

            ps.println(msg);

        }while(!msg.equals("dne"));
       
        
    }    
}


class Client 
{
    public static void main(String[] args) throws Exception
    {
        Socket stk=new Socket("192.168.56.1",2000);
        
        BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br=new BufferedReader(new InputStreamReader(stk.getInputStream()));
        PrintStream ps=new PrintStream(stk.getOutputStream());
        
        String msg;
        
        do
        {
            msg=keyb.readLine();
            ps.println(msg);
            msg=br.readLine();
            System.out.println("From Server"+msg);
            
        }while(!msg.equals("dne"));
        stk.close();
    }    
}
