//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String a[] = in.readLine().trim().split("\\s+");
            int N = Integer.parseInt(a[0]);
            int S = Integer.parseInt(a[1]);
            
            Solution ob = new Solution();
            System.out.println(ob.findLargest(N, S));
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static String findLargest(int n, int s){
        // code here
        String ans = "";
        if((s==0 && n>1) || s>9*n){
            return "-1";
        }
        
        while(s>9){
            ans = ans + '9';
            s = s - 9;
        }
        ans = ans + s;
        while(ans.length() < n){
            ans =  ans +"0";
        }
        return ans;
        
    }
}