//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = a.get(i);
        }
        Arrays.sort(arr);
        int ans = Integer.MAX_VALUE;
        for(int i = 0;i<=n-m;i++){
            int diff = arr[i+m-1] - arr[i];
            if(diff<ans){
                ans = diff;
            }
        }
        return ans;
    }
    
}