import java.lang.*;

// Practice 01
class Test
{
    static int x=10;
    int y=20;
    
    void show()   // it is not static even  access the static as well as instance
    {
        System.out.println(x+" "+y);
    }
    
    static void display()   // it is static only  access the static but not instance
    {
        System.out.println(x);
    }
}

public class StaticPrac1 {

    public static void main(String[] args) {
        
        Test t1=new Test();
        t1.show();
        t1.x=30;
        t1.y=50; 
        
        Test t2=new Test();
        t2.show();
        
    }
    
}




// // Practice 02
// class HondaCity
// {

//     static long price=76483;
//     int a,b;


//     static double OnRoadPrice(String city)
//     {

//         switch(city)
//         {
//             case "Delhi":
//                 return price+price*0.1;
//             case "Mumbai":
//                 return price+price*0.9;
//             default:
//                 return price;
//         }
//     }
// }

// public class StaticPrac1
// {

//     public static void main(String[] args)
//     {

//         HondaCity h1=new HondaCity();
//         System.out.println(h1.price);

//         System.out.println(h1.OnRoadPrice("Delhi"));
//         System.out.println(h1.OnRoadPrice("Mumbai"));

//         System.out.println(HondaCity.price);
//     }
// }