public class _Demo_Recursion {
    public static void printF() {
        System.out.println("F");
        printF();
    }

    // Tinh n!, return n!
    public static int GiaiThua(int n) {
        // Bai toan co so
        if (n == 0)
            return 1;
        // Cong thuc quy nap
        return n * GiaiThua(n - 1);
    }

    // Tinh fibonaci thu n
    public static int Fibo(int n) {
        System.out.println("F[" + n + "]");
        // Bai toan co so
        if (n <= 2)
            return 1;
        // Cong thuc quy nap
        int Fn = Fibo(n - 1) + Fibo(n - 2);
        return Fn;
    }

    // Toi uu de quy: De quy co nho
    static int[] F = new int[1000];
    public static int Fibo2(int n) {
        if(F[n] != 0)
            return F[n];
        System.out.println("F[" + n + "]");
        // Bai toan co so
        if(n <= 2) {
            F[1] = F[2] = 1;
            return F[n];
        }
        // Cong thuc quy nap
        F[n] = Fibo2(n - 1) + Fibo2(n - 2);
        return F[n];
    }

    // Khu de quy
    static int[] Fibo = new int[1000];
    public static int Fibo3(int n) {
        // Bai toan co so
        Fibo[1] = Fibo[2] = 1;
        for (int i = 3; i <= n; i++) {
            // Cong thuc quy nap
            Fibo[i] = Fibo[i - 1] + Fibo[i - 2];
        }
        return Fibo[n];
    }

    // Tinh tong tu 1 -> n
    // Bai toan co so: neu n = 1 -> S(n) = 1
    // Cong thuc quy nap: S(n) = n + S(n - 1)
    public static int sum(int n) {
        if (n <= 1)
            return n;
        return n + sum(n - 1);
    }

    // Tinh so mu A^n = A * A ^ (n - 1)
    // Bai toan co so: n = 0 => A^n = 1; n = 1 => A^n = A; A = 0 => A^n = 0
    // Cong thuc quy nap: A^n = A * A^(n-1)
    public static int AmuN(int A, int n) {
        if(A == 0)
            return 0;
        if(n == 0)
            return 1;
        if(n == 1)
            return A;
        return A * AmuN(A, n - 1);
    }

    // In ra gia tri cua 1 mang so nguyen
    public static void printArray(int[] arr, int index) {
        if(index < 0 || index >= arr.length)
            return;
        System.out.println(arr[index]);// De quy thuc hien cong viec truoc
        printArray(arr, index + 1);
    }

    // In ra gia tri cua 1 mang so nguyen
    public static void printArray2(int[] arr, int index) {
        if(index < 0 || index >= arr.length)
            return;
        System.out.println(arr[index]);
        printArray2(arr, index - 1);
    }

    // In ra gia tri cua 1 mang so nguyen
    public static void printArray3(int[] arr, int index) {
        if(index < 0 || index >= arr.length)
            return;
        printArray3(arr, index + 1);
        System.out.println(arr[index]); // De quy thuc hien cong viec sau
    }

    // Tim uoc so chung lon nhat
    public static int gcd(int a, int b) {
        if(b == 0)
            return a;
        return gcd(b, a % b);
    }

    // Tim boi so chung nho nhat
    public static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }


    public static void main(String[] args) {
        System.out.println(Fibo3(20));
    }

}
