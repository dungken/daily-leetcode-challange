public class _704_Binary_Search {
    // Binary Search non-recursion
    public static int binarySearch(int[] nums, int target) {
        int n = nums.length;
        int iLeft = 0, iRight = n - 1;
        while (iLeft <= iRight) {
            int iMid = (iLeft + iRight) / 2;
            if (nums[iMid] == target)
                return iMid;
            else if (nums[iMid] < target)
                iLeft = iMid + 1;
            else
                iRight = iMid - 1;
        }
        return -1;
    }

    public static int bSearch(int[] nums, int target) {
        int n = nums.length;
        return bSearch(nums, target, 0, n - 1);
    }

    private static int bSearch(int[] nums, int target, int iLeft, int iRight) {
        // Bai toan co so
        if (iLeft > iRight)
            return -1;

        // Cong thuc quy nap
        int iMid = (iLeft + iRight) / 2;
        if (nums[iMid] == target)
            return iMid;
        else if (nums[iMid] < target)
            return bSearch(nums, target, iMid + 1, iRight);
        else
            return bSearch(nums, target, iLeft, iMid - 1);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 11, 56, 402};
        System.out.println(bSearch(arr, 123));
    }
}
