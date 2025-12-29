import java.lang.*;


public class VariableArgu{

    static void show(int ...A){

        for(int x:A){
            System.out.print(x);
        }
    }


    static void showList( int start, String ...S)   // variable argument must be at the last
    {
        for(int i=0;i<S.length;i++){

            System.out.println(start+". "+S[i]);
            start++;
        }
    }

    public static void main(String arg[])


    {

        // // show();
        // show(10,20,30);
        // show(new int[]{3,4,6,5,7,5,7,56,12,43});   // inonomus array does not have referance


        showList(5,"john","smith","chandan","rahul");




    }
}