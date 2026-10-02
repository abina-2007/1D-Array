import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // Arithmetic
        System.out.println("Addition = " + (a + b));
        System.out.println("Subtraction = " + (a - b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + (a / b));
        System.out.println("Modulus = " + (a % b));

        // Relational
        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);

        // Logical
        System.out.println(a > 0 && b > 0);
        System.out.println(a > 0 || b > 0);
        System.out.println(!(a > b));

        // Assignment
        a += b;
        System.out.println("a += b : " + a);
        a -= b;
        System.out.println("a -= b : " + a);

        // Unary
        System.out.println("Increment = " + (++a));
        System.out.println("Decrement = " + (--a));

        // Ternary
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);

        // Bitwise
        System.out.println("AND = " + (a & b));
        System.out.println("OR = " + (a | b));
        System.out.println("XOR = " + (a ^ b));
    }
}
