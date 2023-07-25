package JavaLanguage.Arrays;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] marks = { 2388,2,3,3,23,23,2,3,6};
        System.out.println(marks.length);

        for ( int i =0; i < marks.length ; i ++){
            System.out.println(marks[i]);
        }
        System.out.println("reverse form");
        for ( int i = marks.length - 1; i >=0; i --){
            System.out.println(marks[i]);
        }

        for (int i : marks) {
            System.out.println(i);                                      
        }
        
        // Question 01 ====> Swap Number 
        int[] arr= {1,22,3334,45455,666,66};
        swap(arr, 4, 1);
        System.out.println(Arrays.toString(arr));
        
        // Question 02 ===> find the Maximum Number
        
        int[] arr3= {1,20000002,200000023,45455,666,66};
        reverse(arr);
        System.out.println(Arrays.toString(arr3));

    }
    
    static int max(int[] arr){
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >= maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }

    static void swap(int[] arr ,int index1 ,int index2){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }

    static void reverse(int[] arr){
        int start = 0;
        int end = arr.length -1;
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
    }

}
