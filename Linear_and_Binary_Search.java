import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int key = sc.nextInt();
        // Linear search
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                System.out.println("Found at index: " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found");
        }
        // Binary search
        int l = 0;
        int h = a.length - 1;
        boolean binaryFound = false;
        while (l <= h) {
            int m = l + (h - l) / 2;
            if (a[m] == key) {
                System.out.println("Found at index: " + m);
                binaryFound = true;
                break;
            } else if (a[m] > key) {
                h = m - 1;
            } else {
                l = m + 1;
            }
        }
        if (!binaryFound) {
            System.out.println("Not found");
        }
    }
}
