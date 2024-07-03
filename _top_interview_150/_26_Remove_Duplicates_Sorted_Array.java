package _top_interview_150;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class _26_Remove_Duplicates_Sorted_Array {
    // Using set
    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] != nums[i - 1]) {
                nums[j++] = nums[i];
            }
        }
        return j;
    }


    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(arr));
    }
}
