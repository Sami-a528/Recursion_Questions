public class nu1ToN {
    public static void Printincrease(int n) {
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        Printincrease(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        int n = 10;
        Printincrease(n);
    }
}
