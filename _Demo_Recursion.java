public class _Demo_Recursion {
    public static void printF() {
        System.out.println("F");
        printF();
    }

    // Tinh n!, return n!
    public static int GiaiThua(int n) {
        // Bai toan co so
        if(n == 0)
            return 1;
        // Cong thuc quy nap
        return n * GiaiThua(n - 1);
    }

    // Tinh fibonaci thu n
    public static int Fibo(int n) {
        System.out.println("F[" + n + "]");
        // Bai toan co so
        if(n <= 2)
            return 1;
        // Cong thuc quy nap
        int Fn = Fibo(n - 1) + Fibo(n - 2);
        return Fn;
    }

    public static void main(String[] args) {
        System.out.println(Fibo(5));
    }

}
