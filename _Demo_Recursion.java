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
        if(index >= arr.length)
            return;
        System.out.println(arr[index]);
        printArray(arr, index + 1);
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
        System.out.println(gcd(28, 20));
        System.out.println(lcm(28, 20));
    }

}
