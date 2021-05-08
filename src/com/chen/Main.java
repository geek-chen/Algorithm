package com.chen;

import com.chen.sort.BubbleSort;

public class Main {

    public static void main(String[] args) {
	// bubbleSort test
        int arr[] = {7,6,8,5,9,4,2,3,1};
        int arr1[] = {4,3,2,1,8,9};
        BubbleSort sort = new BubbleSort();
        arr = sort.bubbleSort2(arr1);
        // print the elements of array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }

    }
}