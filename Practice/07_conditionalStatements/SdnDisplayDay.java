import java.lang.*;
import java.util.*;


public class SdnDisplayDay {

    //Display the day on the basis of number.

    // public static void main(String arg[]) {

    //     Scanner scan=new Scanner(System.in);
        
    //     System.out.println("Enter a Day number:");
    //     int day=scan.nextInt();
        
    //     if(day==1)
    //     {
    //         System.out.println("Mon");
    //     }
    //     else if(day==2)
    //     {
    //           System.out.println("Tue");
    //     }
    //     else if(day==3)
    //     {
    //           System.out.println("Wed");
    //     }
    //     else if(day==4)
    //     {
    //           System.out.println("Thur");
    //     }
    //     else if(day==5)
    //     {
    //           System.out.println("Fri");
    //     }
    //     else if(day==6)
    //     {
    //           System.out.println("Sat");
    //     }
    //     else if(day==7)
    //     {
    //           System.out.println("Sun");
    //     }
    //     else
    //     {
    //         System.out.println("Invalid Day Number");
    //     }
        
    // }


    // Find type of website and the prtocal used.

    public static void main(String arg[]) {

        String url;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Protcol of website:");
        url= sc.nextLine();

        String protocal = url.substring(0,url.indexOf(":"));
        if (protocal.equals("http")){
            System.out.println("Hypertext Transfer Protcal");
        }
        else if(protocal.equals("ftp")){
            System.out.println("file Transfer Protcal");
        }


        String ext = url.substring(url.lastIndexOf(".")+1);
        if (ext.equals("com")){
            System.out.println("Commercial website");
        }
        else if(ext.equals("gov")){
            System.out.println("Government Website");
        }
        else if(ext.equals("net")){
            System.out.println("Networking Website");
        }
        else if (ext.equals("biz")){
            System.out.println("Bussiness Website");
        }
        else if (ext.equals("org")){
            System.out.println("Organisational Website");
        }

    }
    
}