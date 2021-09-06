package algoritms;

import java.util.Arrays;

public class InsertionSort {
    public void swap(int [] arr,int ind1,int ind2){
        int tmp = ind1;
        arr[ind1] = arr[ind2];
        arr[ind2] = arr[tmp];

    }

    public static void insertSort(int[] array){
        for(int left = 0;left<array.length;left++){
            // Pull value of element
            int value = array[left];
            //move on at elements which before pulling item
            int i = left - 1;

            for(;i>=0;i--){
                //if pull value less than push bigger value further
                if(value<array[i]){
                    array[i+1] = array[i];
                } else {
                    //if pull item bigger will stop
                    break;
                }
            }
            //in free bucket insert pulled item
            array[i+1] = value;
        }
    }

    public static void main(String[] args) {
        int [] array = {10, 2, 10, 3, 1, 2, 5};
        System.out.println(Arrays.toString(array));
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
}
