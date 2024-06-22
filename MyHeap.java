import java.util.Scanner;

public class MyHeap {
    public static class MinHeap {
        private int MAX_SIZE = 100000;
        private int[] arr = new int[MAX_SIZE + 1];
        private int size = 0;

        MinHeap() {
            size = 0;
        }

        public boolean isEmpty() {
            return size <= 0;
        }

        public int peek() {
            if (isEmpty()) {
                // throw exception
                System.out.println("Heap is empty!");
                return -1;
            }
            return arr[1];
        }
        private void swap(int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        public void add(int v) {
            size++;
            arr[size] = v;
            // heapify up
            int currIndex = size;
            int parentIndex = size / 2;

            while(parentIndex != 0 && arr[parentIndex] > arr[currIndex]) {
                swap(parentIndex, currIndex);
                currIndex = parentIndex;
                parentIndex = currIndex / 2;
            }
        }

        public int poll() {
            if (isEmpty()) {
                // throw exception
                System.out.println("Heap is empty!");
                return -1;
            }


            int minRoot = arr[1];
            arr[1] = arr[size];
            size--;

            // heapify down
            int currIndex = 1;
            heapifyDown(currIndex);

            return minRoot;
        }

        private void heapifyDown(int currIndex) {
            while((currIndex * 2) <= size) {
                int leftChildIndex = currIndex * 2;
                int rightChildIndex = leftChildIndex + 1;

                int smallerChildIndex = leftChildIndex;
                if(rightChildIndex <= size && arr[rightChildIndex] < arr[leftChildIndex]) {
                    smallerChildIndex = rightChildIndex;
                }

                if(arr[currIndex] > arr[smallerChildIndex]) {
                    swap(currIndex, smallerChildIndex);
                    currIndex = smallerChildIndex;
                } else {
                    break;
                }
            }
        }

        public void remove(int v) {
            int currIndex = -1;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] == v) {
                    currIndex = i;
                    break;
                }
            }

            if(currIndex == -1) {
                System.out.println("Error: Element is'n exist!");
                return;
            }

            arr[currIndex] = arr[size];
            size--;

            // heapify down at current index
            heapifyDown(currIndex);
        }
    }

    public static void main(String[] args) {
        MinHeap heap = new MinHeap();
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while(q > 0) {
            int t = sc.nextInt();
            if(t == 1) {
                heap.add(sc.nextInt());
            } else if(t == 2) {
                heap.remove(sc.nextInt());
            } else {
                System.out.println(heap.peek());
            }
            q--;
        }
    }
}
