public class BinaryString2pro {
    public static void PrintBinaryString(int n, int lastPlace, String str) {
        // Base Case
        if(n == 0){
            System.out.println(str);
            return;
        }
        // Kaam
        PrintBinaryString(n-1, 1, str+"1");
        if(lastPlace == 1){
            PrintBinaryString(n-1, 0, str+"0");
        }

    }
    public static void main(String[] args) {
        PrintBinaryString(3, 1, "");
    }
}
// Without 0 occerence.