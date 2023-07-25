public class FindElement {
    static boolean FindIndex(int[] arr , int target , int index){
        if (index == arr.length){
            return false;
        }
        return arr[index] == target || FindIndex(arr, target, index +1);
    }

    static int FindElement(int[] arr , int target , int index){
        if (index == arr.length){
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return FindElement(arr, target, index +1);
        }
    }

    static int FindElementLast(int[] arr , int target , int index){
        if (index == -1){
            return -1;
        }
        if (arr[index] == target) {
            return index;
        } else {
            return FindElement(arr, target, index -1);
        }
    }
    public static void main(String[] args) {

        // check target value ?        
        // int[] arr = {1,23,4,5,6,7};
        // System.out.println(FindIndex(arr, 6, 0));

        // check target value index
        // int[] arr = {1,23,4,5,6,7};
        // System.out.println(FindElement(arr, 7, 0));

        // check target value index from last
        int[] arr = {1,23,4,5,6,7};
        System.out.println(FindElementLast(arr, 7, arr.length-1));
    }
}
