public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int customerNumber = accounts.length;
        int bankNumber = accounts[0].length;
        int maximumWealth = 0;
        for (int i = 0; i < customerNumber; i++) {
            int sumWealthItem = 0;
            for (int j = 0; j < bankNumber; j++) {
                sumWealthItem += accounts[i][j];
            }
            if(sumWealthItem > maximumWealth)
                maximumWealth = sumWealthItem;
        }
        return maximumWealth;
    }

    public static void main(String[] args) {
        int[][] a = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(a));
    }
}
