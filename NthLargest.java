package array;

import java.util.Arrays;

public class NthLargest {
    public static void getNthLargest(int arr[], int n) {
        int temp[] = Duplicate.removeDuplicates(arr);
        if(n >= temp.length || n == 0) {
            System.out.println("nth largest doesn't exist!");
            return;
        }
        Sorting.sort(temp);
        System.out.printf("%d Largest : %d\n",n , temp[temp.length-n]);
    }

    public static void getNthSmallest(int arr[], int n) {
        int temp[] = Duplicate.removeDuplicates(arr);
        if(n >= temp.length || n == 0) {
            System.out.println("nth smallest doesn't exist!");
            return;
        }
        Sorting.sort(temp);
        System.out.printf("%d Smallest : %d\n", n, temp[n-1]);
    }

    public static void main(String[] args) {
        int arr[] = {2,3,4,5,2,4,12,1,3,11,45,2,3,44,53};
        int n = 3;
        getNthLargest(arr, n);
        getNthSmallest(arr, n);
    }
}
