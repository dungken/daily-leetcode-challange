public class _27_Remove_Element {
    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        for (int i = 0; i < n; ) {
            if(nums[i] == val) {
                // Thuc hien xoa phan tu co gia tri la val
                for(int k = i; k < n - 1; k++) {
                    nums[k] = nums[k + 1];
                }
                n--;
            } else {
                ++i;
            }
        }
        return n;
    }


    public static void main(String[] args) {
        int nums[] = {0,1,2,2,3,0,4,2}, val = 2;
        System.out.println(removeElement(nums, val));
    }
}
