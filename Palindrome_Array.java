import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean palindrome = true;
        for (int i = 0; i < n / 2; i++) {
            if (a[i] != a[n - 1 - i]) {
                palindrome = false;
                break;
            }
        }
        if (palindrome) {
            System.out.println("Palindrome array");
        } else {
            System.out.println("Not a palindrome array");
        }
    }
}
