package com.chen;

import com.chen.sort.BubbleSort;
import com.chen.sort.SelectionSort;
import com.chen.sort.insertSort;

public class Main {

    public static void main(String[] args) {
//        // bubbleSort test
          int arr[] = {7,6,9,4,2,3,0,1};
//        BubbleSort sort = new BubbleSort();
//        arr = sort.bubbleSort2(arr);
//        // print the elements of array
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
////        SelectionSort test
//        SelectionSort selectionSort = new SelectionSort();
//        selectionSort.selectionSort(arr);
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
        insertSort insertSort = new insertSort();
        insertSort.insertSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}