public class Q1 {
    static String digits[] = {"zero","one","two","tghree","four","five","six","seven","eight","nine"};
    public static void PrintDigits(int number) {
        if(number == 0){
            return;
        }
        int lastDigit = number%10;
        PrintDigits(number/10);
        System.out.println(digits[lastDigit]+" ");
    } 
    public static void main(String[] args) {
        PrintDigits(1940);
        System.out.println();
    }
}
// Convert into String From Digits.
