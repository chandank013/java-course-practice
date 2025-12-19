import java.lang.*;
import java.util.*;

public class SdnOddEven {

    public static void main(String arg[]){

    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    n = sc.nextInt();

    if (n%2==0){
        System.out.print("Number is Even.");
    }
    else {
        System.out.print("Number is Odd.");
    }
    }
    
}