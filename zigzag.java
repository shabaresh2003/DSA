// arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n]. 
import java.util.*;
class Solution{
    public void zigZag(int a[], int n){
    
         Arrays.sort(a);
        // traverse the array from 1 to N -1
        for (int i = 1; i <= a.length - 2; i += 2) {
            // swap the current element with the next
            // element
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
    }
}