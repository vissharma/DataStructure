package com.ss;

public class QuickSort implements Sorting {
    /*
    Quicksort Complexity
        Time Complexity
            Best	O(n*log n)
            Worst	O(n2)
            Average	O(n*log n)
        Space Complexity	O(log n)
        Stability	No
    * */
    private int partition(int[] ud, int start, int end) {
        int pivot = ud[end];
        int greaterValuePointer = start - 1;

        for (int j = start; j < end; j++) {
            if (ud[j] < pivot) {
                greaterValuePointer++;
                swap(ud, greaterValuePointer, j);
            }
        }
        swap(ud, greaterValuePointer + 1, end);
        return greaterValuePointer + 1;
    }

    private void swap(int[] ud, int i, int j) {
        var temp = ud[i];
        ud[i] = ud[j];
        ud[j] = temp;
    }

    @Override
    public void sortingData(int[] ud, int start, int end) {
        if (start < end) {
            int partitionPoint = partition(ud, start, end);
            sortingData(ud, start, partitionPoint - 1);
            sortingData(ud, partitionPoint, end);
        }
    }
}
