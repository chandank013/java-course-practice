import java.lang.*;
import java.util.*;

class Keyboard {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int num1, num2, sum;

        System.out.print("Enter first number: ");
        num1 = s.nextInt();

        System.out.print("Enter second number: ");
        num2 = s.nextInt();

        sum = num1 + num2;

        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);
    }
}