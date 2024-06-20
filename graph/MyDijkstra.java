package graph;

import java.util.HashSet;
import java.util.Set;

public class MyDijkstra {

    public static void main(String[] args) {
        int graph[][] = {
                {0, 6, 0, 1, 0},
                {6, 0, 5, 2, 2},
                {0, 5, 0, 0, 5},
                {1, 2, 0, 0, 1},
                {0, 2, 5, 1, 0}
        };
        int n = 5;

        Set<Integer> visited = new HashSet<>(); // Mang danh dau cac dinh da duoc duyet
        int[] distance = new int[n]; // Khoang cach tu dinh ban dau den i
        int[] previous = new int[n]; // Dinh ngay phia truoc cua i

        int oo = Integer.MAX_VALUE;
        int start = 0;
        int end = 2;

        // Buoc 1: Khoi tao khoang cach
        for (int i = 0; i < n; i++) {
            distance[i] = oo;
        }
        distance[start] = 0;

        while (visited.size() < n) {
            // Buoc 2: Chon dinh chua duyet va dang co khoang cach nho nhat (tu dinh xuat phat) lam dinh dang xet
            int dangXet = 0;
            int minDist = oo;
            for (int i = 0; i < n; i++) {
                if (!visited.contains(i) && distance[i] < minDist) {
                    minDist = distance[i];
                    dangXet = i;
                }
            }

            // Buoc 3: Tu dinh dang xet , duyet cac dinh ke chua Duyet: update khoang cach va dinh truoc cua cac dinh do
            for (int i = 0; i < n; i++) {
                if (!visited.contains(i) && graph[dangXet][i] != 0) {
                    int newDistance = distance[dangXet] + graph[dangXet][i];
                    if (newDistance < distance[i]) {
                        distance[i] = newDistance;
                        previous[i] = dangXet;
                    }
                }
            }
            // Buoc 4: Danh dau dinh dang xet thanh dinh da duyet
            visited.add(dangXet);
        }

        System.out.println("Khoang cach nho nhat tu " + start + " den " + end + " la: " + distance[end]);
        System.out.println("Duong di la: ");
        int chay = end;
        while (chay != start) {
            System.out.print(chay + "<-");
            chay = previous[chay];
        }
        System.out.print(start);
    }
}
