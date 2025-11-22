import java.lang.*;
import java.util.*;

public class Bintohex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
	
	sc.useRadix(2);
	System.out.print("Enter Binary no. number: ");
	int x=sc.nextInt();
        
        System.out.println(x);
    }
}