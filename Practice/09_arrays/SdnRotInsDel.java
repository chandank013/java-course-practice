import java.lang.*;
import java.util.*;


// // LeftRotate the elements
// public class SdnRotInsDel {

//     public static void main(String args[]) {

//         int A[]={5,9,6,10,12,7,3,5,4,2};
//         int temp = A[0];

//         System.out.print("Original Array:");
//         for(int x:A){
//             System.out.print(x+"," );
//         }
//         System.out.println("");

//         for(int i=1; i<A.length;i++){
//             A[i-1]=A[i];  
//         }
//         A[A.length-1]=temp;

//         System.out.print("Rotated Array:");
//         for(int x:A){
//             System.out.print(x+"," );
//         }
//         System.out.println("");
//     }


// // RightRotate the elements
// public class SdnRotInsDel {

//     public static void main(String args[]) {

//         int A[]={5,9,6,10,12,7,3,5,4,2};
//         int temp = A[A.length-1];

//         System.out.print("Original Array:");
//         for(int x:A){
//             System.out.print(x+"," );
//         }
//         System.out.println("");

//         for(int i=A.length-2; i>1;i--){
//             A[i+1]=A[i];  
//         }
//         A[0]=temp;

//         System.out.print("Rotated Array:");
//         for(int x:A){
//             System.out.print(x+"," );
//         }
//         System.out.println("");
//     }


// // Insert the elements
// public class SdnRotInsDel {

//     public static void main(String args[]) {

//         Scanner sc=new Scanner(System.in);

//         System.out.println("Enter the element to be inserted:");
//         int ele=sc.nextInt();
//         System.out.println("Enter the index:");
//         int idx=sc.nextInt();

//         int A[]=new int[10];
//         A[0]=5;
//         A[1]=9;
//         A[2]=6;
//         A[3]=7;
//         A[4]=4;
//         A[5]=10;

//         int n=6;

//         System.out.print("Original Array:");
//         for(int i=0; i<n;i++){
//             System.out.print(A[i]+"," );
//         }
//         System.out.println("");

//         for(int i=A.length-1; i>idx;i--){
//             A[i]=A[i-1];
//         }
//         A[idx]=ele;

//         System.out.print("Array after inserting:");
//         for(int i=0; i<n;i++){
//             System.out.print(A[i]+"," );
//         }
//         System.out.println("");
//     }


// Delete the elements
public class SdnRotInsDel {

    public static void main(String args[]) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the index:");
        int idx=sc.nextInt();

        int A[]=new int[10];
        A[0]=5;
        A[1]=9;
        A[2]=6;
        A[3]=7;
        A[4]=4;
        A[5]=10;


        System.out.print("Original Array:");
        for(int i=0; i<A.length-1;i++){
            System.out.print(A[i]+"," );
        }System.out.println("");


        for(int i=idx; i<A.length-1;i++){
            int temp = A[idx];
            A[i-1]=A[i];
        }


        System.out.print("Array after deleting:");
        for(int i=0; i<A.length-1;i++){
            System.out.print(A[i]+"," );
        }System.out.println("");
    }
}