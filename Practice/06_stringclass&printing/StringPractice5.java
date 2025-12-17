import java.lang.*;


public class StringPractice5 {

    public static void main(String[] args) {
    
        String str1="abcdef";//ab6cdef,abBcdef
        System.out.println(str1.matches("[abc]*"));    // it will give 'true' only there will be 'abc' any no of time otherwise false
        
        
        String str2="accbdefg";//accb
        System.out.println(str2.matches("[abc]{3,7}"));
        
        
        String str3="john@gmail.com";
        //System.out.println(str3.matches(".*gmail.*"));
        System.out.println(str3.matches("\\w*@gmail(.*)"));
    }
    
}