import java.lang.*;
import java.util.*;


public class Pattern1 {


    // public static void main(String arg[]) {

    //     Scanner sc=new Scanner(System.in);

    //     System.out.println("Enter the number:");
    //     int n = sc.nextInt();

    //     for(int i=0; i<n;i++)
    //     {
    //         for(int j=0; j<n;j++)
    //         {
    //             System.out.print("("+i+")" + "("+j+")");
    //         }
    //         System.out.println("");
    //     }
    // }



    // public static void main(String arg[]) {

    //     Scanner sc=new Scanner(System.in);

    //     for(int i=0; i<5;i++)
    //     {
    //         for(int j=1; j<6;j++)
    //         {
    //             System.out.print(j+" ");
    //         }
    //         System.out.println("");
    //     }
    // }



//   public static void main(String arg[]) {

//         Scanner sc=new Scanner(System.in);

//         for(int i=1; i<6;i++)
//         {
//             for(int j=1; j<6;j++)
//             {
//                 System.out.print(i+" ");
//             }
//             System.out.println("");
//         }
//     }



public static void main(String arg[]) {

        Scanner sc=new Scanner(System.in);


        int count = 0;
        for(int i=1; i<6;i++)
        {
            for(int j=1; j<6;j++)
            {
                ++count;
                System.out.format("%02d ",count);
            }
            System.out.println("");
        }
    }

}