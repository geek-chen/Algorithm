package com.chen.util;

public abstract class swap {
    public static void swap(int[] array, int x, int y) {
        if (x != y) {
            array[x] = array[x] ^ array[y];
            array[y] = array[x] ^ array[y];
            array[x] = array[x] ^ array[y];
        }

    }
}


