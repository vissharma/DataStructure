package com.ss;


public class MergeSort implements Sorting {
    /*
    Merge Sort Complexity
        Time Complexity
            Best	O(n*log n)
            Worst	O(n*log n)
            Average	O(n*log n)
        Space Complexity	O(n)
        Stability	Yes
    * */
    @Override
    public void sortingData(int[] a, int start, int end) {
        if (start < end) {
            int mid = (start + end-1) / 2;
            sortingData(a, start, mid);
            sortingData(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }

    private void merge(int[] a, int start, int mid, int end) {
        int n1 = mid - start+1;
        int n2 = end - mid ;
        int[] lData = new int[n1];
        int[] rData = new int[n2];

        populate(lData, a, start, n1);
        populate(rData, a, mid + 1, n2);

        mergeTwoArray(start, a, lData, rData);
    }

    private void mergeTwoArray(int start, int[] org, int[] lData, int[] rData) {
        int i = 0;
        int j = 0;

        int k = start;

        while (i < lData.length && j < rData.length) {
            if (lData[i] < rData[j]) {
                org[k] = lData[i];
                i++;
            } else {
                org[k] = rData[j];
                j++;
            }
            k++;
        }

        while (i < lData.length) {
            org[k] = lData[i];
            i++;
            k++;
        }
        while (j < rData.length) {
            org[k] = rData[j];
            j++;
            k++;
        }
    }

    private void populate(int[] x, int[] a, int start, int end) {
        for (int i = 0; i < end; i++) {
            x[i] = a[start+i];
        }
    }
}
