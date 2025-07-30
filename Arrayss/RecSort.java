package Arrayss;

public class RecSort {
    public static void main(String[] args) {
        // Example usage of recursive sorting
        int[] arr = {5, 2, 9, 1, 5, 6};
        recursiveBubbleSort(arr, arr.length);
        System.out.println("Sorted array using Recursive Bubble Sort: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        // quick sort

        int arr1[] = {10, 7, 8, 9, 1, 5};
        quickSort(arr1, 0, arr1.length - 1);
        System.out.println("\nSorted array using Quick Sort: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        // merge sort
        mergeSort(arr1, 0, arr1.length - 1);
        System.out.println("\nSorted array using Merge Sort: ");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
    }
     public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int mid = (left + right) / 2;

            // Recursively sort first and second halves
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Merge the sorted halves
            merge(arr, left, mid, right);
        }
    }
    public static void merge(int[] arr, int left, int mid, int right) {
        // Find sizes of two subarrays to be merged
        int n1 = mid - left + 1;
        int n2 = right - mid;
        // Create temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];
        // Copy data to temp arrays
        for (int i = 0; i < n1; i++) {
            L[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = arr[mid + 1 + j];
        }
        // Merge the temp arrays
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    public static void recursiveBubbleSort(int[] arr, int n) {
        // Base case: If the size is 1, return
        if (n == 1) {
            return;
        }
        
        // One pass of bubble sort
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Swap arr[i] and arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        
        // Recursive call for the remaining elements
        recursiveBubbleSort(arr, n - 1);


    }
    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partitioning index
            int pi = partition(arr, low, high);
            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high]; // pivot
        int i = (low - 1); // Index of smaller element
        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++; // increment index of smaller element
                // Swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        // Swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}