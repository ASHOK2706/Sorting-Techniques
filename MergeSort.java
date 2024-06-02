
// Merger Sort

import java.util.ArrayList;
import java.util.Scanner;

public class MergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }

        merge_sort(arr,0,n-1);

        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+" ");
        }
    }

    private static void merge_sort(int[] arr,int low,int high) {
        if(low == high) return;
        int mid = (low+high)/2;
        merge_sort(arr, low, mid);
        merge_sort(arr, mid+1, high);
        merge(arr,low,mid,high);
    }

    private static void merge(int[] arr,int low,int mid,int high) {
        ArrayList<Integer> list = new ArrayList<>();
        int left = low;
        int right = mid+1;
        while(left<=mid && right<=high) {
            if(arr[left]<=arr[right]) {
                list.add(arr[left]);
                left++;
            }
            else {
                list.add(arr[right]);
                right++;
            }
        }
        while(left<=mid) {
            list.add(arr[left]);
            left++;
        }
        while(right<=high) {
            list.add(arr[right]);
            right++;
        }


        for(int i=low;i<=high;i++) {
            arr[i] = list.get(i-low);
        }
    }
}
