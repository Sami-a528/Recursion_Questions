public class FriendsPairingProb {
    public static int FriendsPairingPro(int n) {
        if(n == 1 || n ==2){
            return n;
        }
        //Choise
        //Single
        int FNM1 = FriendsPairingPro(n-1);
        // Pair
        int FNM2 = FriendsPairingPro(n-2);
        int PairWays = (n-1)*FNM2;
        // TotalWays
        int TotalWays = FNM1+PairWays;
        return TotalWays;

    }
    public static void main(String[] args) {
        System.out.println(FriendsPairingPro(3));
    }
}
