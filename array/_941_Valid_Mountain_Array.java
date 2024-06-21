package array;

public class _941_Valid_Mountain_Array {
    public static boolean validMountainArray(int[] arr) {
        int n = arr.length;
        if(n < 3)
            return false;

        boolean isIncreasing = true;
        for (int i = 0; i < n - 1; i++) {
            int j = i + 1; // j la chi so sau
            if(arr[i] < arr[j]) { // day dang tang
                 if(!isIncreasing)
                     return false;
            } else if(arr[i] > arr[j]) { // day dang giam
                if(isIncreasing) { // day dang tang
                    if(i == 0) {// day bat dau da tang dan
                        return false;
                    }
                    isIncreasing = false;
                }
            } else { // arr[i] == arr[j]
                return false;
            }
        }

        return !isIncreasing;
    }

    public static void main(String[] args) {
        int[] arr = {3,5,5};
        System.out.println(validMountainArray(arr));
    }
}
