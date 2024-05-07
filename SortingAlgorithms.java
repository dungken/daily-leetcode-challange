public class SortingAlgorithms {

    public static void printArray(int no, int[] a) {
        System.out.print(no + " : ");
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n; i++) {
            boolean isSorted = true;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    isSorted = false;
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            printArray(i + 1, a);
            if (isSorted)
                break;
        }
    }

    public static void insertionSort(int[] a) {
        int n = a.length;
        for (int i = 1; i < n; i++) {
            int j = i - 1;
            int ai = a[i];
            while (j >= 0 && ai < a[j]) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = ai;
            printArray(i, a);
        }
    }

    public static void selectionSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
            printArray(i, a);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{8, 10, 4, 2, 5, 7, 9};
        selectionSort(arr);
    }
}
