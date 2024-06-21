package array;

public class _977_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        // Tim i: chi so am cuoi cung
        int i = -1;
        while ((i + 1) < n && nums[i + 1] < 0) {
            ++i;
        }
        // Tim j: chi so duong dau tien
        int j = n;
        while ((j - 1) >= 0 && nums[j - 1] >= 0) {
            j--;
        }

        //
        System.out.println(i + " " + j);
        int result[] = new int[n];
        int index = 0; // index of result array
        while (i >= 0 || j < n) {
            if (i >= 0 && j < n) { // both i and j are valid
                int ii = nums[i] * nums[i]; // absolute of element at i
                int jj = nums[j] * nums[j]; // absolute of element at j
                if (ii <= jj) {
                    result[index] = ii;
                    index++;
                    i--;
                } else {
                    result[index] = jj;
                    index++;
                    j++;
                }
            } else if (i >= 0) { // only i is valid
                result[index] = nums[i] * nums[i];
                index++;
                i--;
            } else { // only j is valid
                result[index] = nums[j] * nums[j];
                index++;
                j++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-7,-3,2,3,11};
        int[] result = sortedSquares(nums);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
