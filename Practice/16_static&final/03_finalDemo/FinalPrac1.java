import java.lang.*;


// // Practice 02 (final Variable)
// class My
// {
// // Practice 02 (methods of initialisation);
// final int MIN=1; //(method1)
// final int NORMAL;
// final int MAX;


// static   //(method2)
// {
//     NORMAL=5; 
// }

// My()  //(method3)
// {
//     MAX=10; 
// }

// }


// //Practice 02 (final class)
// class super
// {

//     final void meth1()
//     {
//         System.out.println("Hello!");
//     }
// }

// class sub extends super
// {

//     // final void meth1()   //(error becouse) Final method cannot be overrided
//     // {
//     //     System.out.println("Hi!");
//     // }

//     void meth2()
//     {
//         System.out.println("Bye!");
//     }


// }




//Practice (all concept)
class Test {
    public final void show()
    {
        System.out.println();
    }
}

class Test1 extends Test
{
    //public void show(){}
    //gives error as final methods cannot be overloaded.
}

public class FinalPrac1 {

    final float PI;
    
    public FinalPrac1()
    {
        PI=3.1425f;
    }
    
    public static void main(String[] args) {
        
        final float PI;
        PI=3.1425f;
        System.out.println(PI);
        
    }
    
}