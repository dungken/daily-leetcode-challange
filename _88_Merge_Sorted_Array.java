public class _88_Merge_Sorted_Array {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        // B1: Duyet qua mang nums2
        // B2: Moi phan tu trong mang nums2 -> Duyet qua mang nums1
        //      2.1. Neu ma phan tu dang duyet o mang nums2 < cac phan tu trong mang nums1 -> Chen
        //      2.2. Nguoc lai thi chen vao vi tri cuoi cung

        for(int element : nums2) {
            insertElement(element, nums1, m);
            m++;
        }
    }

    private static void insertElement(int element, int[] nums, int m) {
        boolean isLastElement = true;
        for (int i = 0; i < m; i++) {
            if(element < nums[i]) {
                isLastElement = false;
                // Thuc hien chen -> Dich phan tu ra sau
                for(int k = m; k > i; k--) {
                    nums[k] = nums[k - 1];
                }
                nums[i] = element;
                break;
            }
        }

        if(isLastElement)
            nums[m] = element;
    }

    public static void main(String[] args) {
        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {0,2,6};

        merge(nums1, 3, nums2, 3);
        System.out.println("DONE!");
    }
}
