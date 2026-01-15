public class FibonacciOfN {
    public static int PrintFibonacci(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }
        int Fib_NM1 = PrintFibonacci(n-1);
        int Fib_NM2 = PrintFibonacci(n-2);
        int Fib_N = Fib_NM1 + Fib_NM2;
        return Fib_N;
    }
    public static void main(String[] args) {
        int n = 7;
        System.out.println(PrintFibonacci(n));
    }
}
