import java.lang.*;  // Wrapper Class


public class WrapperClass
{

    public static void main(String args[])
    {
        Integer i=new Integer();
        Integer a=Integer.valueOf(10);
        Integer b=10;

        Byte c=15;
        Byte d=Byte.valueOf("15");

        Short f=Short.valueOf("123");

        Float g=12.3f;

        Double j=Double.valueOf(123.46);

        Character k=Character.valueOf('A');

        Boolean l=Boolean.valueOf("true");


        byte bb=15;  // Boxing
        Byte e=Byte.valueOf(bb);


        Float h = Float.valueOf("123.5") // Objeact that convert string in to float.
        float x=h.floatValue(); // getting premitive value from object (i.e Unboxing)
        float y=h; // automatically called floatValue() (i.e autoUnboxing)



        int m1 =10;
        // Integer n=m;  // autoboxing A premitive is assign to a object is autoboxing
        Integer n1=Integer.valueOf(m1);  // (actual boxing)  A premitive is assign to a object is autoboxing
        int p1=n1; // A object is assign to a premitive is autoUnboxing.


    }
}