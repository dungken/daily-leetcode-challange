public class _1221_Split_String_Balanced_Strings {
    public int balancedStringSplit(String s) {
        int countResult = 0;
        char arr[] = s.toCharArray();
        int countR = 0;
        int countL = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 'R') {
                ++countR;
            } else {
                ++countL;
            }

            if(countL == countR) {
                ++countResult;
            }
        }
        return countResult;
    }

    public static void main(String[] args) {

    }
}
