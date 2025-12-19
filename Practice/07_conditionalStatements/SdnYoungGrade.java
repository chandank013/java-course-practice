import java.lang.*;
import java.util.*;

// public class SdnYoungGrade {

//     public static void main(String arg[]){

//     int n;
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the Age of man:");
//     n = sc.nextInt();

//     if (n>18){
//         System.out.print("Number is Young.");
//     }
//     else {
//         System.out.print("Number is Not Young.");
//     }
//     }
    




public class SdnYoungGrade
{
    
    public static void main(String[] args) 
    {
           
           int m1,m2,m3;
           
           Scanner sc=new Scanner(System.in);
           
           System.out.println("Enter marks of 3 Subjects ");
           m1=sc.nextInt();
           m2=sc.nextInt();
           m3=sc.nextInt();
           
           float avg=(float)(m1+m2+m3)/3;
           
           if(avg>=70)
           {
               System.out.println("Grade A");
           }
           else if(avg>=60 && avg<70)
           {
               System.out.println("Grade B");
           }566
           else if(avg>=50 && avg<60)
           {
               System.out.println("Grade C");
           }
           else if(avg>=40 && avg<50)
           {
               System.out.println("Grade D");
           }
           else 
           {
               System.out.println("Grade E");
           }
    }
}