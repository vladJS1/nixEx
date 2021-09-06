package algoritms;

import java.util.Arrays;

public class ExampleBubbleSort {
    public static void swap(int [] arr,int ind1,int ind2){
        if(arr[ind1]==arr[ind2]) return;
        arr[ind1] += arr[ind2];
        arr[ind2]  = arr[ind1] - arr[ind2];
        arr[ind1]  = arr[ind1] - arr[ind2];
    }

    public static void bubbleSort(int[] arr){
        boolean needIteration = true;
        while (needIteration)  {
            needIteration = false;
            for(int i = 1;i<arr.length;i++){
                if(arr[i] < arr[i-1]){
                    swap(arr,i,i-1);
                    needIteration = true;
                }
            }
        }
    }

    public static void main(String[] args) {
        int [] array = {10,2,10,3,1,2,5};
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

}
