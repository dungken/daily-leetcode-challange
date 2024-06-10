import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyMapJava {

    public static void main(String[] args) {
        int myArr[] = {1, 2, 3, 1, 2, 3, 4, 1, 6, 5};
        Map<Integer, Integer> map = new TreeMap<>();

        for (Integer e : myArr) {
            if(map.containsKey(e) == false) {
                map.put(e, 1);
            } else {
                int numsFre = map.get(e);
                numsFre++;
                map.put(e, numsFre);
            }
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " xuat hien: " + entry.getValue());
        }
    }
}
