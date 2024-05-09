public class FindMaxRecursion {
    // Find max su dung de quy khong tra ve ket qua
    public static int currMax = -1;
    public static void findMax1(int[] arr, int index) {
        if(index < arr.length) {
            if(arr[index] > currMax) {
                currMax = arr[index];
            }
            findMax1(arr, index + 1);
        }
    }

    // Find max su dung de quy co tra ve ket qua
    public static int findMax2(int[] arr, int index, int previousMax) {
        if(index < arr.length) {
            int max = Math.max(previousMax, arr[index]);
            return findMax2(arr, index + 1, max);
        }
        return previousMax;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 20, 9, 8, 0, 7, 6, 100, 400};
        currMax = -1;
        findMax1(arr, 0);
        System.out.println(currMax);
        System.out.println(findMax2(arr, 0, -1));
    }
}
