package com.chen.sort;

import static com.chen.util.swap.swap;

public class insertSort {
    public void insertSort(int[] array) {
        //  从第2个开始，每个元素都要和他前面的元素依次比较
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                //  小于前面的元素则交换位置
                if (array[j] < array[j-1]) {
                    swap(array, j, j-1);
                }
            }
        }
    }
}
