import java.util.Arrays;

public class MyBacktracking {
    private static String[] colors = {"red", "green", "yellow", "black", "purple"};
    private static int[] selections = new int[colors.length];
    private static int[] validValues = {0, 1};

    public static void backtracking(int selectIndex) {
        for (int i = 0; i < validValues.length; i++) {
            selections[selectIndex] = validValues[i];
            // Neu selectIndex la phan tu cuoi cung
            if(selectIndex == selections.length - 1) {
                // Xu ly cau hinh (selections)
                process(selections);
            } else {
                // Goi backtracking selectIndex + 1
                backtracking(selectIndex + 1);
            }
        }
    }

    private static int count = 0;
    private static void process(int[] selections) {
        String mixColors = "";
        ++count;
        for (int i = 0; i < selections.length; i++) {
            if(selections[i] == 1) {
                mixColors += "-" + colors[i];
            }
        }
        System.out.println(count + ". " + mixColors);
        System.out.println(Arrays.toString(selections));
    }


    public static void main(String[] args) {
        backtracking(0);
    }
}
