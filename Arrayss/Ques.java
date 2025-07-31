package Arrayss;

public class Ques {
    // meidian of two sorted arrays
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if (n1 > n2) {
            return findMedianSortedArrays(nums2, nums1); // Ensure nums1 is the smaller
        }

        int low = 0;
        int high = n1;
        while (low <= high) {
            int partition1 = (low + high) / 2;
            int partition2 = (n1 + n2 + 1) / 2 - partition1;

            int maxLeft1 = (partition1 == 0) ? Integer.MIN_VALUE : nums1[partition1 - 1];
            int minRight1 = (partition1 == n1) ? Integer.MAX_VALUE : nums1[partition1];

            int maxLeft2 = (partition2 == 0) ? Integer.MIN_VALUE : nums2[partition2 - 1];
            int minRight2 = (partition2 == n2) ? Integer.MAX_VALUE : nums2[partition2];

            if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
                // Found the correct partition
                if ((n1 + n2) % 2 == 0) {
                    return (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
                } else {
                    return Math.max(maxLeft1, maxLeft2);
                }
            } else if (maxLeft1 > minRight2) {
                // Move towards the left in nums1
                high = partition1 - 1;
            } else {
                // Move towards the right in nums1
                low = partition1 + 1;
            }
        }

        throw new IllegalArgumentException("Input arrays are not sorted");
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        System.out.println("Median is: " + findMedianSortedArrays(nums1, nums2)); 

        int[] nums3 = {1, 2};
        int[] nums4 = {3, 4};
        System.out.println("Median is: " + findMedianSortedArrays(nums3, nums4)); 
    }

}
