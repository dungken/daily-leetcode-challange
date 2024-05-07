public class _414_Third_Maximum_Number {
    public static void printArray(int no, long[] a) {
        System.out.print(no + " : ");
        for (long x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void insert(long[] maxArr, int value) {
        int i = 0;
        while (i < maxArr.length) {
            if (value == maxArr[i]) // Khong cho cac phan tu trung nhau
                return;
            else if (value > maxArr[i])
                break;
            else
                i++;
        }

        if(i < maxArr.length) {
            // Dich cac phan tu nho hon value sang ben phai
            for (int j = maxArr.length - 2; j >= i; j--) { // maxArr.length - 2 tai vi phan tu cuoi cung khong phai dich
                maxArr[j + 1] = maxArr[j];
            }
            // Gan lai cho value sau khi da dich
            maxArr[i] = value;
            printArray(i, maxArr);
        }

    }

    public static int thirdMax(int[] nums) {
        long[] maxArr = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};

        for (int i = 0; i < nums.length; i++) {
            insert(maxArr, nums[i]);
        }

        if (maxArr[2] == Long.MIN_VALUE)
            return (int) maxArr[0];

        return (int) maxArr[2];
    }

    public static void main(String[] args) {
        int[] a = {0, 0, 0};
        System.out.println(thirdMax(a));
    }
}
