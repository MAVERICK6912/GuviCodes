package com.company;

import java.util.Scanner;

public class BinarySearch {
    int binarySearch(int ar[], int s, int e, int s_e){
        if (e>=s) {
            int mid=s+(e-s)/2;
            if (ar[mid]==s_e) {
                return mid;
            }
            if (ar[mid]>s_e) {
                return binarySearch(ar, s, mid-1, s_e);
            }

            return binarySearch(ar, mid+1, e, s_e);
        }
        return -1;
    }
    void getAnswer(int s, int s_e){
        if (s==-1) {
            System.out.println("Element not present in the array");
        }
        else {
            System.out.println("Target element:"+s_e+" found at position "+(s+1)+".");
        }
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number of elements in array");
        int n=scanner.nextInt();
        int ar[]=new int[n];
        for (int i=0;i<n ;i++ ) {
            System.out.println("Enter element at "+(i+1));
            ar[i]=scanner.nextInt();
        }
        System.out.println("Enter search element");
        int s_e=scanner.nextInt();
        BinarySearch bin_s=new BinarySearch();
        bin_s.getAnswer(bin_s.binarySearch(ar,0,n-1,s_e),s_e);
    }
}
