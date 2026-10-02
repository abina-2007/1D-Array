import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int result = a * a + b * b + c * c + 2 * a * b + 2 * b * c;
        int radius = sc.nextInt();
        double area = Math.PI * radius * radius;
        System.out.println("Result = " + result);
        System.out.println("Area of circle = " + area);
    }
}
