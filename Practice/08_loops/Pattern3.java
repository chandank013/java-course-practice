import java.lang.*;
import java.util.*;


public class Pattern3 {

    // public static void main(String arg[]) {

    // Scanner sc=new Scanner(System.in);

    // for(int i=1; i<=5;i++)
    // {
    //     for(int j=1; j<=5;j++)
    //     {
    //         if (i<=j)
    //         {
    //         System.out.format("* ");
    //         }
    //         else
    //         {
    //             System.out.format("  ");
    //         }
    //     }
    //     System.out.println("");
    // }
    // }
    


    // public static void main(String arg[]) {

    // Scanner sc=new Scanner(System.in);

    // for(int i=1; i<=5;i++)
    // {
    //     for(int j=1; j<=5;j++)
    //     {
    //         if ((i+j)>5)
    //         {
    //         System.out.format("* ");
    //         }
    //         else
    //         {
    //             System.out.format("  ");
    //         }
    //     }
    //     System.out.println("");
    // }
    // }


    // public static void main(String arg[]) {

    // for(int i=1; i<=5;i++)
    // {
    //     for(int j=1; j<=5;j++)
    //     {
    //         if (i<=j)
    //         {
    //         System.out.format("* ");
    //         }
    //         else
    //         {
    //             System.out.format(" ");
    //         }
    //     }
    //     System.out.println("");
    // }
    // }


    public static void main(String arg[]) {

        int n=5;
        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
        System.out.println(" ");
    }
    }
}