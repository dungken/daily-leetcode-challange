package sort;

public class _414_Third_Maximum_Number {
    public void insert(long[] arrMax, int ele) {
        int i = 0;
         while(i < arrMax.length) {
             if(ele == arrMax[i]) {
                 // nothing
                 return;
             } else if(ele < arrMax[i]) {
                 ++i;
             } else { // ele > arrMax[i]
                 // insert
                 break;
             }
         }
         if(i < arrMax.length) {
             for (int j = arrMax.length - 2; j >= i; j--) {
                arrMax[j + 1] = arrMax[j];
             }
             // Gan gia tri
             arrMax[i] = ele;
         }
    }


    public int thirdMax(int[] nums) {
        long[] arrMax = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};
        for (int i = 0; i < nums.length; i++) {
            insert(arrMax, nums[i]);
        }

        if (arrMax[2] != Long.MIN_VALUE) {
            return (int) arrMax[2];
        }
        return (int) arrMax[0];
    }


    public static void main(String[] args) {

    }
}
