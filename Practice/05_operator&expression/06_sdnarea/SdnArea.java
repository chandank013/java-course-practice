import java.lang.*;
import java.util.Scanner;

// public class SdnArea {

//     public static void main(String arg[])
//     {
//         float base,height,area;
//         System.out.println("Enter base and height:");

//         Scanner sc=new Scanner(System.in);
//         base = sc.nextFloat();
//         height = sc.nextFloat();

//         area=base*height*0.5f;

//         // area=1f/2f*base*height;

//         System.out.println("Areaof triangle is:"+area);

//     }
// }





public class SdnArea {

    public static void main(String arg[])
    {
        int a,b,c;
        float s;
        double area;

        System.out.println("Enter three sides of triangle:");

        Scanner sc=new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s = (a+b+c)/2f;
        area = Math.sqrt(s*(s-a)*(s-b)*(s-c));


        System.out.println("Areaof triangle is:"+area);

    }
}
