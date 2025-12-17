import java.lang.*;

public class SdnNoIsBin{

    public static void main(String arg[]) {

    int b = 10110001;
    String str1 = b+"";
    System.out.println(str1.matches("[01]+"));


    String str2 = "234AB";
    System.out.println(str2.matches("[0-9A-F]+"));


    String str3 = "16/07/2005";
    System.out.println(str3.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));
    }
}