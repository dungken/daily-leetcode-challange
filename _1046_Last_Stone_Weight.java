import java.util.Comparator;
import java.util.PriorityQueue;

public class _1046_Last_Stone_Weight {
    public static int lastStoneWeight(int[] stones) {
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> -Integer.compare(a, b));
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> (b - a));
        // B1: Add all to heap
        for(Integer stone : stones) {
            maxHeap.add(stone);
        }
        // B2: Proceed require problem
        while(maxHeap.size() >= 2) {
            int bigger = maxHeap.remove();
            int smaller = maxHeap.remove();
            if(bigger != smaller) {
                maxHeap.add(bigger - smaller);
            }
        }

        return maxHeap.isEmpty() ? 0 : maxHeap.poll();
    }
    public static void main(String[] args) {
        System.out.println(lastStoneWeight(new int[] {2,7,4,1,8,1}));
    }
}
