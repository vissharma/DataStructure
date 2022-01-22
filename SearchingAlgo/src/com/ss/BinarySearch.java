package com.ss;

import java.util.Arrays;

public class BinarySearch {

    public int searchValueOfK(int[] a, int k) {
       Arrays.sort(a);
       int start = 0;
       int end = a.length-1;
       return applyBinarySearch(a,start,end,k);
    }

    private int applyBinarySearch(int[] a, int start, int end, int k) {
        if(end >= start) {
            int mid = (start + end) / 2;
            if (a[mid] == k) {
                return mid;
            } else if (a[mid] > k) {
                return applyBinarySearch(a, start, mid - 1, k);
            } else {
                return applyBinarySearch(a, mid + 1, end, k);
            }
        }
        return -1;
    }
}
