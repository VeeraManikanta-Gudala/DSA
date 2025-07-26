package Arrayss;

public class Searchings {
    public static void main(String[] args) {
        // Example usage of the methods
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int target = 5;
        int index = linearSearch(arr, target);
        System.out.println("Element " + target + " found at index: " + index);

        int[] sortedArr = {1, 2, 3, 4, 5, 6, 7};
        int binaryIndex = binarySearch(sortedArr, target);
        System.out.println("Element " + target + " found at index: " + binaryIndex);
        int recursiveIndex = binarySearchRecursive(sortedArr, target, 0, sortedArr.length - 1);
        System.out.println("Element " + target + " found at index (recursive): " + recursiveIndex);
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
    public static int binarySearchRecursive(int[] arr, int target, int low, int high) {
        if (low > high) {
            return -1; // Base case: target not found
        }
        int mid = (low + high) / 2;
        if (arr[mid] == target) {
            return mid; // Target found
        } else if (arr[mid] < target) {
            return binarySearchRecursive(arr, target, mid + 1, high); // Search in the right half
        } else {
            return binarySearchRecursive(arr, target, low, mid - 1); // Search in the left half
        }
    }
}
