package com.chen.sort;

import static com.chen.util.swap.swap;

public class SelectionSort {
    public void selectionSort(int[] array) {
        int minIndex;
        for (int i = 0; i < array.length-1; i++) {
            minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                swap(array, minIndex, i);
            }
        }
    }
}
