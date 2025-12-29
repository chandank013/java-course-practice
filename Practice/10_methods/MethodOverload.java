import java.lang.*;


public class MethodOverload {        //( methodoverloading mean method having same name but having different data type or parameter;)

    static int max(int x,int y){
        return x>y? x:y;
    }


    static float max(float x,float y){
        return x>y? x:y;
    }

    static int max(int x,int y, int z){
        return x>y && x>z? x:(y>z?y:z);
    }


    public static void main(String arg[]){

    System.out.println(max(2,6));

    System.out.println(max(2.0f, 6.6f));

    System.out.println(max(2,6,56));
    }

}