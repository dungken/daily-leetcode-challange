public class _1662_Check_If_Two_String_Arrays {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder result1 = new StringBuilder();
        StringBuilder result2 = new StringBuilder();
        for (String s : word1) {
            result1.append(s);
        }
        for (String s : word2) {
            result2.append(s);
        }
        return result1.toString().equals(result2.toString());
    }
}
