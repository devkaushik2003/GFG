//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

class GFG {
    public static void main(String args[])throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out=new PrintWriter(System.out);
        int t=Integer.parseInt(in.readLine());
        while(t-->0){
            
            int n=Integer.parseInt(in.readLine().trim());
            int a[]=new int[n];
            String s[]=in.readLine().trim().split(" ");
            for(int i=0;i<n;i++){
                a[i]=Integer.parseInt(s[i]);
            }
            s=in.readLine().trim().split(" ");
            int penalty[]=new int[n];
            for(int i=0;i<n;i++){
                penalty[i]=Integer.parseInt(s[i]);
            }
            Solution ob=new Solution();
            long ans=ob.totalTime(n,a,penalty);
            out.println(ans);
        }
        out.close();
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution
{
    public static long totalTime(int n,int arr[],int penalty[])
    {
        HashSet<Integer> brr = new HashSet<>();
        long time = 0;
        brr.add(arr[0]);
        for(int i = 1;i<n;i++){
            if(brr.contains(arr[i])){
                time  += (long)penalty[arr[i] -1]; 
            }else{
                brr.add(arr[i]);
                time++;
            }
        }
        return time;
    }
}