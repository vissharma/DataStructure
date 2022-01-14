package com.ss;

public class DataSort
{
    public static void main(String[] args) {
        int [] unsortedData = new int[]{9,2,6,1,7,3,5,4,8};
        System.out.println("---Data before sorting----" );
        printData(unsortedData);

        /* Sorting data using the quick sort */
        Sorting quickSort = new QuickSort();
        quickSort.sortingData(unsortedData, 0, unsortedData.length-1);
        System.out.println("---Data after sort algorithm ----");
        printData(unsortedData);
        /* Sorting data using quick sort ends here */

        /* Sorting data using the merge sort */
        Sorting mergeSort = new MergeSort();
        mergeSort.sortingData(unsortedData, 0, unsortedData.length-1);
        System.out.println("---Data after sort algorithm ----");
        printData(unsortedData);
        /* Sorting data using merge sort ends here */
    }

    private static void printData(int[] data) {
        for(var value : data){
            System.out.print(value);
        }
        System.out.println("");
    }
}
