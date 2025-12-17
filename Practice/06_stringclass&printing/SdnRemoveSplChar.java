import java.lang.*;

public class SdnRemoveSplChar {

    public static void main(String arg[]){

        String str = "aB!@#$2%3";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]",""));


        String str1 = "  abc   def  gh ijk   ";
        System.out.println(str1.replaceAll("\\s+"," "));  // '//s' mean space '//S' mean not space

        System.out.println(str1.replaceAll("\\s+"," ").trim());


        String str3 = "     abc   def  gh ijk   ";
        str3 = str3.replaceAll("\\s+"," ").trim();
        String words[]=str3.split("\\s+"); 
        System.out.println(words.length);


    }

}