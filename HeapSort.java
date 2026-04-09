public class HeapSort {
    public static void heapSort(int[] a) {
        if (a == null || a.length == 0) {
            return;
        }
        int n = a.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(a, n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            int t = a[0];
            a[0] = a[i];
            a[i] = t;
            heapify(a, i, 0);
        }
    }

    private static void heapify(int[] a, int n, int i) {
        int l = i;
        int x = 2 * i + 1;
        int y = 2 * i + 2;
        if (x < n && a[x] > a[l]) {
            l = x;
        }
        if (y < n && a[y] > a[l]) {
            l = y;
        }
        if (l != i) {
            int t = a[i];
            a[i] = a[l];
            a[l] = t;
            heapify(a, n, l);
        }
    }

    public static void printArray(int[] a) {
        for (int v : a) {
            System.out.print(v + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] a = {64, 34, 25, 12, 22, 11, 90, 88};
        System.out.println("Original Array:");
        printArray(a);
        heapSort(a);
        System.out.println("Sorted Array:");
        printArray(a);
    }
}
