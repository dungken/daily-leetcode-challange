import java.util.Arrays;

public class _912_Sort_an_Array_Quicksort {

    public static int[] sortArray(int[] nums) {
        quicksort(nums, 0, nums.length - 1);
        return nums;
    }

    private static void quicksort(int[] nums, int L, int R) {
        // Dieu kien dung
        if (L >= R)
            return;
        // B1: Chon chot
        int key = nums[(L + R) / 2];
        // B2: Phan bo mang theo chot
        int k = partition(nums, L, R, key);
        // B3: Chia mang ra
        quicksort(nums, L, k - 1);
        quicksort(nums, k, R);
    }

    private static int partition(int[] nums, int L, int R, int key) {
        int iLeft = L;
        int iRight = R;
        while (iLeft <= iRight) {
            // Dung lai khi phan tu ben trai lon hon key
            while (nums[iLeft] < key)
                ++iLeft;
            // Dung lai khi phan tu ben phai nho hon key
            while (nums[iRight] > key)
                --iRight;
            // Hoan doi 2 phan tu
            if (iLeft <= iRight) {
                int temp = nums[iLeft];
                nums[iLeft] = nums[iRight];
                nums[iRight] = temp;
                ++iLeft;
                --iRight;
            }
        }
        return iLeft;
    }


    public static void main(String[] args) {
        int[] nums = {5, 4, 7, 8, 1, 3, 2, 0};
        System.out.println("Start: " + Arrays.toString(nums));
        int[] result = sortArray(nums);
        System.out.println("Finish: " + Arrays.toString(result));
    }
}
