public class _387_First_Unique_Character {
    public static int firstUniqChar(String s) {
        char myCharArr[] = s.toCharArray();
        int count[] = new int[123];

        for (int i = 0; i < myCharArr.length; i++) {
            count[(int)myCharArr[i]]++;
        }

        for (int i = 0; i < myCharArr.length; i++) {
            if(count[(int)myCharArr[i]] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(firstUniqChar(s));
    }
}
