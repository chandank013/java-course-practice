import java.lang.*;
import java.util.*;

class Welcome {
    public static void main(String arg[]) {
        Scanner s = new Scanner(System.in);
        
        String name;
        System.out.println("May I know your name:");
        name = s.nextLine();
        System.out.println("Welcome Miss/Mr: " + name);
    }
}