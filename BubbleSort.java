
//Bubble Sort

import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = in.nextInt();
        }

        bubble_sort(arr,n);
    }

    private static void bubble_sort(int[] arr,int n) {

        for(int i=n-1;i>=1;i--) {
            for(int j=0;j<i;j++) {
                if (arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for(int i=0;i<n;i++) {
            System.out.print(arr[i]+ " ");
        }

    }
}