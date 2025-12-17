import java.lang.*;
import java.util.Scanner;

public class SdnCubiod {

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);

        int length,breadth,height;
        int ToalaArea , Volume;

        System.out.println("Enter the value of coefficient lenght:");
        length = sc.nextInt();
        System.out.println("Enter the value of coefficient breadth:");
        breadth = sc.nextInt();
        System.out.println("Enter the value of coefficient height:");
        height = sc.nextInt();

        ToalaArea = 2*((length*breadth)+(breadth*height)+(length*height));
        
        Volume = length*breadth*height;
        
        System.out.println("Area of Cubiod:"+ToalaArea);
        System.out.println("Volume of Cubiod:"+Volume);

    }
}
