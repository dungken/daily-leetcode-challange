package _top_interview_150;

import java.util.HashMap;
import java.util.Map;

public class _169_Majority_Element {
    public static int majorityElement(int[] nums) {
        int n = nums.length;
        if (n <= 2) {
            return nums[n - 1];
        }

        Map<Integer, Integer> myHashMap = new HashMap<>();
        for (Integer num : nums) {
            if (myHashMap.containsKey(num)) {
                myHashMap.put(num, myHashMap.get(num) + 1);
            } else {
                myHashMap.put(num, 1);
            }
        }

        int majority = n / 2;
        for (Map.Entry<Integer, Integer> entry : myHashMap.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value > majority) {
                majority = key;
                break;
            }
        }
        return majority;
    }


    public static int majorityElement2(int[] nums) {
        int count = 0;
        int candidate = 0;
        for (Integer num : nums) {
            if (count == 0) {
                candidate = num;
            }

            if (candidate == num) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        System.out.println(majorityElement(arr));
    }
}
