// given an array find the maximum  of subsequent sub array of size k;

public class CricketMatchScoreMaximising{
    public static int[] maxInSubArray(int[] arr, int k){
        int currentMax = 0;
        int[] result = new int[arr.length - k + 1];
        for (int i = 0; i < k; i++) {
            currentMax = Math.max(currentMax, arr[i]);
        }
        result[0] = currentMax;
        for (int i = k; i < arr.length; i++) {
            currentMax = Math.max(currentMax, arr[i]);
            result[i - k + 1] = currentMax;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 4, 6};
        int k = 3;
        int[] result = maxInSubArray(arr, k);
        for (int i : result) {
            System.out.print(i + " ");
        }
    }
}