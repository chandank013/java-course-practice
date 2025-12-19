import java.lang.*;
import java.util.*;


public class SdnSwitchCase {

    public static void main(String arg[]) {

        Scanner scan=new Scanner(System.in);
        
        System.out.println("Enter a Day number:");
        int day=scan.nextInt();
        
        switch(day){
            
            case 1: System.out.println("Mon");
            break;

            case 2: System.out.println("Tue");
            break;

            case 3: System.out.println("Wed");
            break;

            case 4: System.out.println("Thur");
            break;

            case 5: System.out.println("Fri");
            break;

            case 6: System.out.println("Sat");
            break;

            case 7: System.out.println("Sun");
            break;

            default:System.out.println("Invalid day");  // if i gave 8 then it directly jump on default value

        }
        
    }
}