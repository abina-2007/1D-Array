import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum += a[i];
        }
        Arrays.sort(a);
        System.out.println("First Maximum = " + a[n - 1]);
        System.out.println("Second Maximum = " + a[n - 2]);
        System.out.println("Third Maximum = " + a[n - 3]);
        System.out.println("Sum = " + sum);
    }
}
