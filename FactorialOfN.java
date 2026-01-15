public class FactorialOfN {
    public static int PrintFact(int n) {
        if(n == 0){
            return 1;
        }
        int fact_NM1 = PrintFact(n-1);
        int fact_N = n*fact_NM1;
        return fact_N;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(PrintFact(n));
    }
}
