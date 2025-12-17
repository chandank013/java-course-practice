import java.lang.*;

public class WideNarrow {

    public static void main(String[] args) {
        byte b=5;
        short s=10;
        int i=10;
        long l=10;
        //float f=10;
        float f=10.5f;
        double d=10;
        char c=10;
        boolean bl=true;
        
        // widenning ( smaller is cmpatible with larger)
        s=b;
        i=b;
        l=b;
        f=b;
        l=b;
        // c=b;  // not allowed (chracter always contain character)

        // Narrowing ( but larger is not compatible with smaller so we have to do type casting)
        b=(byte)s;
        System.out.println(b);
        i=s;
        l=s;
        f=s;
        d=s;
        
        i=(int)f;
        System.out.println(i);
    }
    
}