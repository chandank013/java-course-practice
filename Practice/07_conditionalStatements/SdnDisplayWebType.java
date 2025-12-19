import java.lang.*;
import java.util.*;


public class SdnDisplayWebType{

    public static void main(String arg[]) {

            String url;
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter the Protcol of website:");
            url= sc.nextLine();

            String ext = url.substring(url.lastIndexOf(".")+1);

            switch(ext){

                case "com": System.out.println("Commercial Website");
                break;
                case "gov": System.out.println("Governmental Website");
                break;
                case "org": System.out.println("Organisational Website");
                break;
                case "biz": System.out.println("Business Website");
                break;
            }
    }
}