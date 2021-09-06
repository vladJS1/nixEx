package algoritms;

import java.util.Arrays;

public class SelectionSort {
    public static void swap(int [] arr,int ind1,int ind2){
        if(arr[ind1]==arr[ind2]) return;
        arr[ind1] = arr[ind1] ^ arr[ind2];
        arr[ind2] = arr[ind1] ^ arr[ind2];
        arr[ind1] = arr[ind1] ^ arr[ind2];
    }

    public static void selectionSort(int [] array){
        for(int left = 0;left<array.length;left++){
            int minInd = left;
            for(int i = left;i<array.length;i++){
                if(array[i] < array[minInd]){
                    minInd = i;
                }
            }
            swap(array,left,minInd);
        }
    }

    public static void main(String[] args) {
        int [] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
