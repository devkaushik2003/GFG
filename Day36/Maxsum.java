//{ Driver Code Starts
import java.util.*;

class Maxsum_Among_All_Rotations_Array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

            System.out.println(new Solution().max_sum(arr, n));

            t--;
        }
    }
}

// } Driver Code Ends


class Solution {
    long max_sum(int arr[], int n) {
        // Your code here
        long sum = 0;
        long s0 = 0;
        for(int i = 0;i<arr.length;i++){
            sum += (long)arr[i];
            s0 += (long)arr[i]*i;
        }
        long si = (long)s0;
        long max = (long)s0;
        for(int i = 0;i<n;i++){
            long s1 = (long)si + (long)sum - (long)n*arr[n - i - 1];
            max = Math.max(max,s1);
            si = s1;
        }
        return max;
    }
    
}
