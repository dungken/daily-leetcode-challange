import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MySetJava {
    public static void main(String[] args) {
//        Set<String> set = new HashSet<>();
//        Set<String> set = new TreeSet<>();
        Set<String> set = new LinkedHashSet<>();

        set.add("1111");
        set.add("22222");
        set.add("33");

        set.add("1111");
        set.add("33");

        for (String element : set) {
            System.out.println(element);
        }
    }
}
