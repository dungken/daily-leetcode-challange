public class _70_Climbing_Stairs {
//    public static int climbStairs(int n) {
//        if(n == 1) return 1;
//        if(n == 2) return 2;
//        return climbStairs(n - 1) + climbStairs(n - 2);
//    }

    private static int[] steps = new int[46];

    public static int stepsCalculation(int n) {
        if (steps[n] == 0) {
            steps[n] = stepsCalculation(n - 1) + stepsCalculation(n - 2);
        }
        return steps[n];
    }

    public static int climbStairs(int n) {
        // Bai toan co so | Dieu kien dung
        steps[1] = 1;
        steps[2] = 2;
        // Cong thuc truy hoi | Cong thuc de quy
        stepsCalculation(n);
        return steps[n];
    }

    public static void main(String[] args) {

    }
}
