package com.ss;

public class SearchData {
    public static void main(String[] args) {
        int a[] = new int[]{4,8,6,2,7,9,3,1};
        int k = 1;

//        LinearSearch ls = new LinearSearch();
//        int value = ls.searchValueOfK(a,k);

        BinarySearch bs = new BinarySearch();
        int value = bs.searchValueOfK(a, k);


        if(value != -1){
            System.out.println("Value of k is at index :" + value + "value is :"+a[value]);
        }else{
            System.out.println("Value of k is not found in the given array");
        }
    }
}
