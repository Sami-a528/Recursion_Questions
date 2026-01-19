public class xTOthePowerN {
    public static int Printpower(int x, int n) {
        if(n == 0){
            return 1;
        }
        // int XNM1 = Printpower(x, n-1);
        // int XN  = x * XNM1;
        // return XN;

        return x * Printpower(x, n-1);
    }
    public static void main(String[] args) {
        System.out.println(Printpower(2, 10));
    }
}
