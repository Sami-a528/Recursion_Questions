public class FirstOccereceOfEle {
    public static int FirstOccrence(int arr[], int i, int key) {
        //Base Case
        if(i == arr.length){
            return -1;
        }


        if(arr[i]==key){
            return i;
        }
        return FirstOccrence(arr, i+1, key);
    }
    public static void main(String[] args) {
        int arr[] = {8,3,6,9,5,10,2,5,3};
        System.out.println(FirstOccrence(arr, 0, 5));
    }
}