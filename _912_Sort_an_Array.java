import java.util.Arrays;

public class _912_Sort_an_Array {

    public static int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }

    private static int[] mergeSort(int[] nums, int L, int R) {
//        System.out.println("Chia [" + L + ", " + R + "]");
        // THDB
        if (L > R)
            return new int[0];
        if (L == R) {
            int[] singleElement = {nums[L]};
            return singleElement;
        }

        // THTQ
        int k = (L + R) / 2;
        int[] a1 = mergeSort(nums, L, k);
        int[] a2 = mergeSort(nums, k + 1, R);

        int[] result = merge(a1, a2);
//        System.out.println(Arrays.toString(result));
        return result;
    }

    private static int[] merge(int[] a1, int[] a2) {
        int i = 0, i1 = 0, i2 = 0;
        int n = a1.length + a2.length;
        int[] result = new int[n];
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] <= a2[i2]) {
                    result[i++] = a1[i1++];
                } else {
                    result[i++] = a2[i2++];
                }
            } else {
                if (i1 < a1.length) {
                    result[i++] = a1[i1++];
                } else {
                    result[i++] = a2[i2++];
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 9, 0, 8, 7, 5, 6, 2, 4, 3};
        int[] arrNew = sortArray(arr);
        for(int x : arrNew)
            System.out.println(x);
    }
}
