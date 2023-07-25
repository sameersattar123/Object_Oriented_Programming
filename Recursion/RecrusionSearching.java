public class RecrusionSearching {

    static boolean CheckSorted(int[] arr , int index){
        if (index == arr.length -1) {
            return true;
        }
        return arr[index] < arr[index + 1] && CheckSorted(arr,index + 1);
    }
    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,52,6,7};
        System.out.println(CheckSorted(arr, 0)); 
    }
}
