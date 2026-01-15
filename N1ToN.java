public class N1ToN {
    public static void Printincrease(int n) {
        if(n==10){
            System.out.println(n);
            return;
        }
        System.out.println(n+" ");
        Printincrease(n+1);
    }
    public static void main(String[] args) {
        int n = 1;
        Printincrease(n);
    }
}
