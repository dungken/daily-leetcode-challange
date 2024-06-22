public class _852_Peak_Index_Mountain_Array {
    public int peakIndexInMountainArray(int[] arr) {
        return findIndex(arr, 0, arr.length - 1);
    }

    private int findIndex(int[] arr, int L, int R) {
        // Dieu kien dung
        // L ... R 010
        if((R - L) >= 2) {
            int M = (L + R) / 2;
            if(arr[M] > arr[M + 1] && arr[M] > arr[M - 1]) { // M is index found
                return M;
            } else if(arr[M] < arr[M + 1]) { // find right
                return findIndex(arr, M, R);
            } else { // find left
                return findIndex(arr, L, M);
            }
        }
        return -1;
    }

    public static void main(String[] args) {

    }

}
