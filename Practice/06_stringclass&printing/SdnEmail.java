import java.lang.*;


public class SdnEmail {

    public static void main(String arg[]) {

    String str="programmer@gmail.com";
    int i = str.indexOf("@");

    String username = str.substring(0,i);
    String domain = str.substring(i+1, str.length());
    System.out.println("username is:" + username);
    System.out.println("domain name is:" + domain);

    int j = domain.indexOf(".");
    String name = domain.substring(0,j);
    System.out.println(name.equals("gmail"));
                  //'or'
    System.out.println(domain.startsWith("gmail"));

    }
}