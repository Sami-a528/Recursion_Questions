public class Nto1 {

    public static void PrintDecreasing(int n) {
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        PrintDecreasing(n-1);
    }
    public static void main(String[] args) {
       int n = 10; 
       PrintDecreasing(n);
    }
}