import java.lang.*;
import java.util.*;


// // Sum of the elements
// public class SdnSumSearchMaxSecLarge {

//     public static void main(String args[]) {

//         int B[]={1,2,3,4,5};
//         int sum=0;

//         for(int i=0; i<B.length;i++){
//             sum= sum + B[i];
//         }
//         System.out.println("Sum of elements of array is:"+sum);

//     }


// // Searching of the elements
// public class SdnSumSearchMaxSecLarge {

//     public static void main(String args[]) {

//         Scanner sc=new Scanner(System.in);

//         int B[]={1,2,3,4,5};
//         int key;
//         System.out.println("Enter the element to be search:");
//         key = sc.nextInt();

//         for(int i=0; i<B.length;i++){
//             if (B[i]==key)
//             {
//                 System.out.println("Element is found at:"+i);
//                 System.exit(0);
//             }
//         }
//         System.out.println("Element not found");
//     }


// /


// Finding second largest of the elements





public class SdnSumSearchMaxSecLarge {

    public static void main(String args[]) {


        int A[]={1,2,10,3,4,5};
        int max1 = A[0];
        int max2 = A[0];

        for(int i=0; i<A.length;i++){
            if (A[i]>max1)
            {
                max2=max1;
                max1 = A[i];
            }
            else if(A[i]>max2){
                max2=A[i];
            }
            
        }
        System.out.println("Second largest element is:"+max2);
    }

}







