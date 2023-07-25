import java.util.Arrays;

public class Patterns {
    static void BubbleSort(int[] arr,int r , int c){
        if (r == 0) {
            return;
        }
        if (c < r) {
           if (arr[c]> arr[c+1]) {
            int temp = arr[c];
            arr[c] = arr[c+1];
            arr[c+1] = temp;
           }
            BubbleSort(arr, r, c+1);
        }else{
           
            BubbleSort(arr, r-1, 0);
        }
    }

    static void SelectionSort(int[] arr , int r , int c , int max){
        if (r == 0) {
            return;
        }
        if (c < r) {
            if (arr[c] > arr[max]) {
                SelectionSort(arr , r, c+1 , c);
            }else {
                SelectionSort(arr , r, c+1,max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            SelectionSort(arr , r-1, 0 , 0);
        }
    }
    static void Triangle(int r , int c){
        if (r == 0) {
            return;
        }
        if (c < r) {
            System.out.print(" * ");
            Triangle(r, c+1);
        }else{
            System.out.println();
            Triangle(r-1, 0);
        }
    }
    static void Triangle2(int r , int c){
        if (r == 0) {
            return;
        }
        if (c < r) {
            Triangle2(r, c+1);
            System.out.print(" * ");
        }else{
            Triangle2(r-1, 0);
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Triangle(8, 0); 
        // Triangle2(8, 0);
        // int[] arr= {4,83,2,1,0};
        // BubbleSort(arr, arr.length-1, 0);
        // System.out.println(Arrays.toString(arr));  
        int[] arr= {4,83,2,1,0};
        SelectionSort(arr, arr.length, 0 , 0);
        System.out.println(Arrays.toString(arr));  
    }
}
