//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;
import java.lang.*;

class Geeks
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().majorityElement(arr, n)); 
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    static int majorityElement(int a[], int n)
    {
        // your code here
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            if(map.containsKey(a[i])){
                map.put(a[i] , map.get(a[i]) + 1);
            }else{
                map.put(a[i] , 1);
            }
        }
        for(int i = 0;i<n;i++){
            if(map.get(a[i]) > n/2){
                return a[i];
            }
        }
        return -1;
    }
}