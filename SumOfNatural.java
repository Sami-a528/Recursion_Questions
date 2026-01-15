public class SumOfNatural {
    public static int PrintSum(int n) {
        if(n==1){
            return 1;
        }
        int Sum_NM1 = PrintSum(n-1);
        int Sum_N = n + Sum_NM1;
        return Sum_N;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(PrintSum(n));
    }
}
