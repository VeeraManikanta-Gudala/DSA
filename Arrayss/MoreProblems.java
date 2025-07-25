package Arrayss;

public class MoreProblems {
    public static void main(String[] args) {
        // rotating the array
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int k = 3; // number of positions to rotate
        int n = arr.length;
        k = k % n; // handle cases where k > n
        // brute force solution
        // for (int i = 0; i < k; i++) {
        //     int temp = arr[0];
        //     for (int j = 0; j < n - 1; j++) {
        //         arr[j] = arr[j + 1];
        //     }
        //     arr[n - 1] = temp;
        // }    

        // this is the ultimate optimal solution
        // reverse the entire array, then reverse the first k elements and then reverse the remaining elements
        reverse(arr, 0, n - 1); // reverse the entire array
        reverse(arr, 0, k - 1); // reverse the first k elements
        reverse(arr, k, n - 1); // reverse the remaining elements
        System.out.print("Rotated array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    // Helper method to reverse a portion of the array
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
