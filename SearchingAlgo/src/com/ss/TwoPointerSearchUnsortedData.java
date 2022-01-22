package com.ss;

public class TwoPointerSearchUnsortedData {
    public int searchValueOfK(int[] a, int k) {
        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            if (a[start] == k) {
                return start;
            }
            if (a[end] == k) {
                return end;
            }
            start++;
            end--;
        }
        return -1;
    }
}
