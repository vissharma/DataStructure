package com.ss;

import java.sql.SQLOutput;

public class HeapSort implements Sorting {
    /*
    Working of Heap Sort
    1. Since the tree satisfies Max-Heap property, then the largest item is stored at the root node.
    2. Swap: Remove the root element and put at the end of the array (nth position) Put the last item of the tree (heap) at the vacant place.
    3. Remove: Reduce the size of the heap by 1.
    4 .Heapify: Heapify the root element again so that we have the highest element at root.
    The process is repeated until all the items of the list are sorted.

    Time Complexity
        Best	O(nlog n)
        Worst	O(nlog n)
        Average	O(nlog n)
    Space Complexity	O(1)
    Stability	No
    * */

    @Override
    public void sortingData(int[] a, int start, int end) {
        //Create the max heap
        System.out.println("Value of start :" + start + "Value of end :" + end);
        for (int i = end + 1 / 2 - 1; i >= 0; i--) {
            heapify(a, end + 1, i);
        }
        //Heap sort
        for (int i = end; i >= 0; i--) {
            swap(a, i, 0);
            heapify(a, i, 0);
        }
    }

    private void heapify(int[] a, int end, int i) {
        //Find the largest among root, left and right
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;

        if (left < end && a[left] > a[largest]) {
            largest = left;
        }
        if (right < end && a[right] > a[largest]) {
            largest = right;
        }
        //Continue heapify if root is not largest
        if (largest != i) {
            swap(a, largest, i);
            heapify(a, end, largest);
        }
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
