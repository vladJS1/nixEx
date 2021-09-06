package com.company;

public class Sort {
    public static void outputArray(int[] array) {
        for (int key :
                array) {
            System.out.print(key + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] array = {3, 45, 12, 45, 12, 34};
        outputArray(array);
        choiceSort(array);
        outputArray(array);
        int[] array1 = {3, 45, 12, 45, 12, 34};
        System.out.println("<-------------bubble_sort------------->");
        outputArray(array1);
        bubbleSort(array1);
        outputArray(array1);
        System.out.println("<-------------insertSort------------->");
        int[] array2 = {3, 45, 12, 45, 12, 34};
        outputArray(array2);
        insertSort(array2);
        outputArray(array2);
        System.out.println("<-------------quickSort------------->");
        int[] array3 = {3, 45, 12, 45, 12, 34};
        outputArray(array3);
        quickSort(array3, 0, array3.length - 1);
        outputArray(array3);


    }

    public static void insertSort(int[] array) {
        int indexToInsert;
        int element;
        for (int index = 0; index < array.length; index++) {
            indexToInsert = index;
            element = array[index];
            while (indexToInsert > 0
                    && array[indexToInsert - 1] > element) {
                array[indexToInsert] = array[indexToInsert - 1];
                indexToInsert--;
                array[indexToInsert] = element;
            }
        }
    }


    public static void choiceSort(int[] array) {
        int temp;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[i] < array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public static void bubbleSort(int[] array) {
        boolean needIteration = true;
        int temp;
        while (needIteration) {
            needIteration = false;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    needIteration = true;
                }

            }
        }
    }

    public static void quickSort(int[] array, int low, int high) {
       if(array.length==0)
           return;
       if(low>=high)
           return;

       int middle = low + (high-low)/2;
       int opora = array[middle];

       int i = low,j = high;
      while(i<=j){
          while(array[i]<opora)
              i++;
          while(array[j]>opora)
              j--;
          if(i<=j){
              int temp = array[i];
              array[i] = array[j];
              array[j] = temp;
              i++;
              j--;
          }
      }

      if(low<j)
          quickSort(array,low,j);
      if(high>i)
          quickSort(array,i,high);
    }
}
