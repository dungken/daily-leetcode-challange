import java.util.Stack;

public class _20_ValidParentheses {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty())
                    return false;
                char openPeek = st.peek();
                if ((c == ')' && openPeek == '(') || (c == '}' && openPeek == '{') || (c == ']' && openPeek == '[')) {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
