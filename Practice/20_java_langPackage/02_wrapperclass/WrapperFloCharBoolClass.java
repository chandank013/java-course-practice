import java.lang.*;


public class WrapperFloCharBoolClass
{

    public static void main(String args[])
    {
        // Float Class
        float a=10.6f;
        Float b=10.6f;
        Float c=10.6f/0;
        Float d=(float)Math.sqrt(-1);

        System.out.println(b.equals(a));
        System.out.println(c.isInfinite());
        System.out.println(c==Float.POSITIVE_INFINITY);
        System.out.println(d.isNaN());
        System.out.println(d!=Float.NaN);



        // // Character Class (not inheriting from Number class.)
        // Character c1='A';
        // Character.____


        // // Boolean Class (not inheriting from Number class.)
        // Boolean b;
        // b._____();
        // Boolean._____();



    }
}