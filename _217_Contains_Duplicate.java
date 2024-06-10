import java.util.HashSet;
import java.util.Set;

public class _217_Contains_Duplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (Integer e : nums) {
            if (set.contains(e) == true) {
                return true;
            } else {
                set.add(e);
            }
        }
        return false;
    }
}
