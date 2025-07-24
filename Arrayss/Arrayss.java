package Arrayss;
// import java.util.*;
public class Arrayss {
    public static void main(String[] args) {
        // int[] arr = {2,6,8,12,6,9,7,12,12,10};
        // int maxEle = arr[0];
        // for(int i = 0; i<arr.length;i++){
        //     maxEle = Math.max(maxEle, arr[i]);
        // }
        // System.out.println("Larget element is : " + maxEle);
        // int secondLargest = -1;
        // for(int i =0;i<arr.length;i++){
        //     if(arr[i] != maxEle){
        //         secondLargest = Math.max(secondLargest,arr[i]);
        //     }
        // }
        // System.out.println("second largest is : " + secondLargest);
        // int maxi = arr[0];
        // int secondL= -1;
        // for(int i = 0 ; i<arr.length;i++){
        //     if(secondL < arr[i] && maxi!= arr[i]){
        //         // 
        //         // maxi = arr[i];
        //         if(maxi < arr[i]){
        //             secondL = maxi;
        //             maxi = arr[i];
        //         }else{
        //             secondL = arr[i];
        //         }
        //     }
        // }
        // System.out.println("second alrger is : " + secondL);
        // // same for minimum just reverse the signs and seconSmallest to MAXINT

        int ar[] = {1,1,2,2,3,3,4,4,4,4,4,5,5,5,5};
        int j = 1;
        int i = 0;
        while(j<ar.length){
            if(ar[i] == ar[j]){
                ar[j] = 0;
                j++;
            }else{
                i=j;
                j++;
            }
        }
        System.out.println(ar[9]);
        i=0;
        j=1;
        int zeross = 0;
        while (j<ar.length) {
            if(ar[i] !=0 || ar[j] ==0){
                j++;
                zeross++;
            }else{
                int temp = ar[j-zeross];
                 ar[j-zeross] = ar[j];
                 ar[j] = temp;
                 i++;
                 zeross=0; 
                //  j++;
            }

        }
        for (int k = 0; k < ar.length; k++) {
            System.out.print(ar[k] + " , ");
        }

    }
}
