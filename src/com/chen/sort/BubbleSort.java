package com.chen.sort;

import static com.chen.util.swap.swap;

public class BubbleSort {


    /**
     * 最基础的实现
     * @param arr
     * @return
     */
    public int[] bubbleSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {        //长度为length的数组，要排序length-1趟
            for (int j = 0; j < arr.length - i - 1; j++) {      //每一轮排序后会少一个需要比较的值
                if(arr[j]<arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
        }
        return arr;
    }


    /**
     * 优化1：减少排序的趟数：若某一轮排序后整个数组已经有序，则结束
     * @param arr
     * @return
     */
    public int[] bubbleSort1(int[] arr){
        boolean exchanged = true;
        for (int i = 0; i < arr.length-1; i++) {        //长度为length的数组，要排序length-1趟
            if (!exchanged) {       //若未发生交换，说明已经有序，break
                break;
            }
            exchanged = false;
            for (int j = 0; j < arr.length - i - 1; j++) {      //每一轮排序后会少一个需要比较的值
                if(arr[j]<arr[j+1]){
                    exchanged = true;       //若发生交换，则设为true
                    swap(arr, j, j+1);
                }
            }

        }
        return arr;
    }

    /**
     * 优化2： 减少每次排序的比较次数，若数组内部某个位置之后已经有许，则无需比较
     * @param array
     * @return
     */
    public int[] bubbleSort2(int[] array) {
        boolean swaped = true;
        int indexOfSwap = -1;
        int indexOfLastSwap = array.length-1;
        for (int i = 0; i < array.length - 1; i++) {
            if (!swaped) {
                break;
            }
            swaped = false;
            for (int j = 0; j < indexOfLastSwap; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                    indexOfSwap = j+1;
                    swaped = true;
                }
            }
            indexOfLastSwap = indexOfSwap;
        }
        return array;
    }

}
