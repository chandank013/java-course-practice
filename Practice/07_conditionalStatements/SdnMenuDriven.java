import java.lang.*;
import java.util.*;

public class SdnMenuDriven {

    public static void main(String arg[]){

        Scanner sc=new Scanner(System.in);

        float a,b;
        System.out.println("Enter the option:"); 
        System.out.println("Add"); 
        System.out.println("Sub"); 
        System.out.println("Mul"); 
        System.out.println("Div");

        System.out.println("Enter the option in word:");
        String str = sc.nextLine() ;

        System.out.println("Enter the Number to do operation:");
        a = sc.nextFloat();
        b = sc.nextFloat();

        switch(str){

            case "Add": System.out.println(a+b);
            break;
            case "Sub": System.out.println(a-b);
            break;
            case "Mul": System.out.println(a*b);
            break;
            case "Div": System.out.println(a/b);
            break;
        }

    }
}