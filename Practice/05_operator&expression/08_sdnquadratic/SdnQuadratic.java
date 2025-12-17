import java.lang.*;
import java.util.Scanner;

public class SdnQuadratic {

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int a,b,c;
        double r1,r2;

        System.out.println("Enter the value of coefficient a:");
        a = sc.nextInt();
        System.out.println("Enter the value of coefficient b:");
        b = sc.nextInt();
        System.out.println("Enter the value of coefficient c:");
        c = sc.nextInt();

        r1 = -b+Math.sqrt(b*b-4*a*c)/(2*a);
        r2 = -b-Math.sqrt(b*b-4*a*c)/(2*a);

        System.out.println("Roots are"+ r1 +" "+r2);

    }
}
