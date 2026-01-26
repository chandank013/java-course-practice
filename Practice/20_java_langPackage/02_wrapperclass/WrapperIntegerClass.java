import java.lang.*;  // Integer Class


public class WrapperIntegerClass
{

    public static void main(String args[])
    {
        int m1=17;

        Integer m2=m1;
        Integer m3=17;

        System.out.println(m2.equals(m1));
        System.out.println(m2.equals(m3));


        Integer m4=Integer.valueOf("123");  // convert string to integer
        Integer m5=Integer.valueOf("1010",2);  // We can get integer by giving different radix.
        Integer m6=Integer.decode("0xA7");  //

        System.out.println(m4);
        System.out.println(m5);
        System.out.println(m6);


        System.out.println(Integer.parseInt("123"));  // convert the string in to  integer
        System.out.println(Integer.reverseBytes(128)==Integer.MIN_VALUE);
        System.out.println(Integer.toBinaryString(40)); // Convert Integer in to Binary String.


    }
}