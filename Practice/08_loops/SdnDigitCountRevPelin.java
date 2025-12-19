import java.lang.*;
import java.util.*;


public class SdnDigitCountRevPelin {


// Display the armstrong number
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the digit to display:");
        int num = sc.nextInt();

        int cheak=num;
        int rev = 0,r;
        while(num>0){
            r=num%10;
            rev = rev*10+r;
            num=num/10;
        }
        if(rev==cheak){
            System.out.println("Pelindrome");
        }
        else{
            System.out.println("Not Pelindrome");
        }
        }



//   // Display the armstrong number
//     public static void main(String[] args) {

//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the digit to display:");
//         int num = sc.nextInt();

//         int cheak=num;
//         int sum = 0;
//         int i,r;
//         while(num>0){
//             r=num%10;
//             num=num/10;
//             sum = sum+(r*r*r);
//         }
//         if(sum==cheak){
//             System.out.println("Armstrong");
//         }
//         else{
//             System.out.println("Not Armstrong");
//         }
//         }


    // // Display and reversing of digit using while loop
    // public static void main(String[] args) {

    //     Scanner sc=new Scanner(System.in);

    //     System.out.println("Enter the digit to display:");
    //     int num = sc.nextInt();

    //     int i,r;
    //     while(num>0){
    //         r=num%10;
    //         num=num/10;
    //         System.out.println(r);
    //     }
    //     System.out.println(num);
    //     }
    

    //  // Reversing and Display of digit using for loop
    //  public static void main(String[] args) {

    //     Scanner sc=new Scanner(System.in);

    //     System.out.println("Enter the digit to display:");
    //     int num = sc.nextInt();

    //     int i;
    //     int rem;
    //     for (i=0; num>0;i++){
    //         rem=num%10;
    //         num=num/10;
    //         System.out.print(rem+"\n");
    //     }
    //     System.out.println(num);

    //  }

    
    // // Counting of digit
    // public static void main(String[] args) {

    //     Scanner sc=new Scanner(System.in);

    //     System.out.println("Enter the digit to display:");
    //     int num = sc.nextInt();

    //     int count = 0,i,r;
    //     for (i=0; num>0;i++){
    //         num=num/10;
    //         count++;
    //     }

    //     System.out.println(count);
    // }

    
}