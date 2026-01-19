public class FLastOccerence {
    public static int PrintLastocc(int i, int key, int arr[]) {
        if(i == arr.length){
            return -1;
        }

        int isFound = PrintLastocc(i+1, key, arr);
        if(isFound == -1 && arr[i] == key){
            return i;
        }
        return isFound;
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,5,3};
        System.out.println(PrintLastocc(0, 5, arr));
    }
}
