public class TilingProblem {
    public static int PrintTiling(int n) {  // 2 x n n->Floor size given.
        if(n == 0 || n == 1){
            return 1;
        }
        // Verticaly.
        int NM1 = PrintTiling(n-1);
        // Horizontaly.
        int NM2 = PrintTiling(n-2);
        int TotalWays = NM1+NM2;
        return TotalWays;
    }
    public static void main(String[] args) {
        System.out.println(PrintTiling(4));
    }
}
