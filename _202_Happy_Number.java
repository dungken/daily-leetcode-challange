import java.util.HashSet;
import java.util.Set;

public class _202_Happy_Number {

    public static int nextNumber(int n) {
        int sum = 0;
        while(n != 0) {
            int k = n % 10;
            sum += k * k;
            n /= 10;
        }
        return sum;
    }
    public boolean isHappy(int n) {
        Set<Integer> existingNumbers = new HashSet<>();
        while(!existingNumbers.contains(n)) {
            existingNumbers.add(n);
            if(n == 1) return true;
            n = nextNumber(n);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(nextNumber(12));
    }
}
