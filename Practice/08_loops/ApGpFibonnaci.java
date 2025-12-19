import java.lang.*;
import java.util.*;


public class ApGpFibonnaci {


    //display Ap
    // public static void main(String arg[]) {

    //     Scanner sc=new Scanner(System.in);

    //     System.out.println("Enter the fisrt term,difference,last term to get AP series:");
    //     System.out.println("Enter the fisrt term:");
    //     int a = sc.nextInt();
    //     System.out.println("Enter the difference:");
    //     int d = sc.nextInt();
    //     System.out.println("Enter the n term:");
    //     int n = sc.nextInt();

    //     int term = a;
    //     for(int i=0; i<n;i++){
    //        System.out.print(term+" ");
    //        term=term+d;
    //     }
    // }


    // display Gp
    // public static void main(String arg[]) {

    //     Scanner sc=new Scanner(System.in);

    //     System.out.println("Enter the fisrt term,difference,last term to get AP series:");
    //     System.out.println("Enter the fisrt term:");
    //     int a = sc.nextInt();
    //     System.out.println("Enter the difference:");
    //     int r = sc.nextInt();
    //     System.out.println("Enter the n term:");
    //     int n = sc.nextInt();

    //     int term = a*r;
    //     for(int i=0; i<n;i++){
    //        System.out.print(term+" ");
    //        term=term*r;
    //     }
    // }


    // fibonacci series
    public static void main(String arg[]) {

        Scanner sc=new Scanner(System.in);


        System.out.println("Enter  number of terms:");
        int n = sc.nextInt();

        int a=0, b=1;
        int temp = 0;
        System.out.print(a+","+b);
        for(int i=0; i<n;i++){
            temp=a+b;
            a=b;
            b=temp;
            System.out.print(" "+temp);

        }
    }
}