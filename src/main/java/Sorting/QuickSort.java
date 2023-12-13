package Sorting;

public class QuickSort {

    public static void main(String[] args)
    {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int N = arr.length;

        // Function call
        quickSort(arr, 0, N - 1);
        System.out.println("Sorted array:");
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
        private static void quickSort(int[] arr, int low, int high) {


        if(low<high){
            int p = partition(arr, low, high);
            quickSort(arr, low, p-1);
            quickSort(arr, p+1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {

        int i=low-1;
        int pivot = arr[high];
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                swap(arr, i,j);
            }
        }
        swap(arr, i+1, high);
        return (i+1);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
