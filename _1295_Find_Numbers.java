public class _1295_Find_Numbers {
    public static int findNumbers(int[] nums) {
        int cnt = 0;
        for (int item: nums) {
            int numberDigit = checkNumberDigit(item);
            if(numberDigit % 2 == 0) {
                ++cnt;
            }
        }
        return cnt;
    }

    private static int checkNumberDigit(int item) {
        if(item == 0)
            return 1;
        int cnt = 0;
        while (item != 0) {
            item /= 10;
            ++cnt;
        }
        return cnt;
    }

    public static void main(String[] args) {
        int nums[] = {0, 12, 345, 2, 6, 2896};
        System.out.println(findNumbers(nums));
    }
}
