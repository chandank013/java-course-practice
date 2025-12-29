import java.lang.*;


public class SdnPrimeGcdMax{


    // Prime
    static String isPrime(int n) {
        for(int i=2; i<n/2;i++){
            if(n%i==0){
                return n+" is not Prime";
            }
        }
        return n + " is Prime";
    }


    // Prime
    static void Prime(int p){
        int count=0;
        for(int i=1; i<=p;i++){

            if (p%i==0){
                count++;
            }
        }
        if (count==2){
           System.out.println(p+" Is a Prime number"); 
        }
        else {
            System.out.println(p+" Is not a Prime number"); 
        }
    }


    // GCD
    static int HCF(int m,int n){
        while (m!=n)
        { 
            if(m>n){
                m=m-n;
            }
            else{
                n=n-m;
            }
        }
        return m;
    }

    
    // max of array
    static int maxOfArray(int A[]) {
        int x=A[0];
        for(int i=1;i<A.length;i++){
            if(x<A[i]){
                x=A[i];
            }
        }
        return x;
    }

    public static void main(String args[]) {

        // System.out.println(isPrime(11));


        // Prime(3);


        // int m=4,n=12;
        // System.out.println("HCf of "+m+" and "+n+" is: "+HCF(4,12));


        int A[]={4,6,3,7,9,4,6,67,34};
        System.out.println("largest element of Array: "+maxOfArray(A));



    }
}