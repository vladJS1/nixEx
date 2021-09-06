package algoritms;

import java.util.Arrays;

public class InsertSortEx {
        public static void main(String[] args){
            int[] array = {4,1,-3,7,10,2,8,2};

            System.out.println(Arrays.toString(array));

            shellSort(array);

            System.out.println(Arrays.toString(array));


        }

        public static void insertSort(int[] array) {
        for(int left = 0;left<array.length;left++){
            int value = array[left];

            int i = left - 1;
            for(;i>=0;i--){
                if(value<array[i]){
                    array[i+1] = array[i];
                }else{
                    break;
                }
            }
            array[i+1] = value;
        }

        }

        public static void selectionSort(int[] array){
                for(int left = 0;left<array.length;left++){
                    int minInd = left;
                    for(int i = left;i<array.length;i++){
                        if(array[i] < array[minInd]){
                            minInd = i;
                        }
                    }
                    if(array[left]!=array[minInd]) {
                        array[left] ^= array[minInd];
                        array[minInd] = array[left] ^ array[minInd];
                        array[left] = array[left] ^ array[minInd];
                    }
                }
        }
        public static void shellSort(int[] array){
            int gap = array.length/2;

            while(gap>=1){
                for(int right = 0;right<array.length;right++){
                    for(int c  = right - gap;c>=0;c-=gap){
                        if(array[c]>array[c+gap]){
                            int tmp = array[c];
                            array[c] = array[c+gap];
                            array[c+gap] = tmp;
                        }
                    }
                }
                gap/=2;
            }
        }

        public static void mergeSort(int[] source,int left,int right){
            int delimiter = left + ((right - left)/2)+1;

            if(delimiter > 0 && right>(left+1)){
                mergeSort(source,left,delimiter-1);
                mergeSort(source,delimiter,right);
            }

            int[] buffer = new int[right]
        }

}
