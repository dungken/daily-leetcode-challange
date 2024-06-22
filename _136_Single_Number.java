public class _136_Single_Number {

    public int singleNumber(int[] nums) {
        int result = 0;
        for(Integer element : nums) {
            result ^= element;
        }
        return result;
    }


    public static void main(String[] args) {

    }
}
