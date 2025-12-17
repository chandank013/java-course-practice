import java.lang.*;

public class printing2 {

    public static void main(String[] args) {
        int a=10;//a=-10
        System.out.printf("%05d\n",a);   // here flag is used so at empty place of width it put '0'
        
        float b=123.45f;//3.45f
        System.out.printf("%0\6.2f\n",b);   // "%6.2f" it give number that occupie 6 position and '.2' give tow digit after decimal
        // "%06.2f" if number is small and width is more that will filled with '0'
        
        String str="Java";
        System.out.printf("%20s",str); //or System.out.printf("%20s",str);
        
    }
    
}