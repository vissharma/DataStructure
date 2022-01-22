package com.ss;

public class LinearSearch {
    public int searchValueOfK(int[] a, int k) {

        for(int i = 0; i < a.length-1;i++){
            if(a[i] == k){
                return i;
            }
        }
        return -1;
    }
}
