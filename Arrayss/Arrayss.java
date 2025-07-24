package Arrayss;
// import java.util.*;
public class Arrayss {
    public static void main(String[] args) {
        int[] arr = {2,6,8,12,6,9,7,12,12,10};
        int maxEle = arr[0];
        for(int i = 0; i<arr.length;i++){
            maxEle = Math.max(maxEle, arr[i]);
        }
        System.out.println("Larget element is : " + maxEle);
        int secondLargest = -1;
        for(int i =0;i<arr.length;i++){
            if(arr[i] != maxEle){
                secondLargest = Math.max(secondLargest,arr[i]);
            }
        }
        System.out.println("second largest is : " + secondLargest);
        int maxi = arr[0];
        int secondL= -1;
        for(int i = 0 ; i<arr.length;i++){
            if(secondL < arr[i] && maxi!= arr[i]){
                // 
                // maxi = arr[i];
                if(maxi < arr[i]){
                    secondL = maxi;
                    maxi = arr[i];
                }else{
                    secondL = arr[i];
                }
            }
        }
        System.out.println("second alrger is : " + secondL);
        // same for minimum just reverse the signs and seconSmallest to MAXINT

        int ar[] = {1,1,2,2,3,3,4,4,4,4,4,5,5,5,5};
        int j = 1;
        int i = 0;
        for(i=0;i<ar.length && j<ar.length;){
            if(ar[i] != ar[j]){
                ar[i+1] = ar[j];
                i++;
                j++;
            }else{
                j++;
            }
        }
        for (int k = 0; k < i+1; k++) {
            System.out.print(ar[k] + " , ");
        }

    }
}
