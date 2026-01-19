public class xToPowNoptimize {
    public static int OptimisedPower(int x, int n) {
        if(n == 0){
            return 1;
        }
        // n = Even
        int halfPower = OptimisedPower(x, n/2);
        int halfPowerSq = halfPower * halfPower;
        // n = Odd
        if(n%2 != 0){
            halfPowerSq = x * halfPowerSq;
        }
        return halfPowerSq;
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 10;
        System.out.println(OptimisedPower(x, n));
    }
}
