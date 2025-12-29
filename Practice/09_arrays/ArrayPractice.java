import java.lang.*;


public class ArrayPractice {

    public static void main(String[] args) {
        int A[]=new int[10];
        int B[]={1,2,3,4,5};
        B[2]=15;   // B[2] changes to 15 in array B
        

        int C[];
        C=new int[10];
        
        
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
        
        
        for(int i=0;i<B.length;i++)
        {
            System.out.println(B[i]);
        }
        
        
        // for each loop
        /*for(int x:B) 
        {
            System.out.println(x++);   // there is no changes in the element of array even on increamenting (for each loop is only used for reading the element not for any operation.)
        }
        for(int x:B)
        {
            System.out.println(x);
        }*/
        
        
        /*for(int i=0;i<B.length;i++) // we can modify the value by counter controling
        {
            System.out.println(B[i]++);
        }*/
        
        
        System.out.println(B.length);
    }
    
}