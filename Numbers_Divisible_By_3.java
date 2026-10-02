import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Numbers divisible by 3:");
        for (int i = 0; i < n; i++) {
            if (a[i] % 3 == 0) {
                System.out.print(a[i] + " ");
            }
        }
    }
}
