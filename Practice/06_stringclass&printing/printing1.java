import java.lang.*;

public class printing1 {

    public static void main(String[] args) {
        int x=10;
        float y=12.56f;
        char z='A';
        String str="Java Program";
          
        System.out.printf("%3$s %2$f %1$d",x,y,str);    // %3$s %2$f %1$d it is used for printing the element at assign position.

        System.out.printf("Hello %d %f %c %s\n",x,y,z,str);   // %d %f %c %s\n",x,y,z,str (format specifier for respective data type)
        %o,%x,%e for float value
        
    }
    
}