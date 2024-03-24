//{ Driver Code Starts
//Initial Template for Java


//Initial Template for Java



import java.io.*;
import java.util.*;


// } Driver Code Ends
//User function Template for Java

class Solution {
    ArrayList<Long> arrangeOddAndEven(long arr[], int n) {
        ArrayList<Long> odd = new ArrayList<>();
        ArrayList<Long> even = new ArrayList<>();
        ArrayList<Long> ans = new ArrayList<>();
        
        // Separate odd and even numbers
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }

        
        int k = 0;
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0 && k < even.size()) {
                ans.add(even.get(k));
                k++;
            } else  if(i%2 != 0 && j<odd.size()) {
                ans.add(odd.get(j));
                j++;
            }
        }
        while(k < even.size()){
            ans.add(even.get(k));
            k++;
        }
        while(j<odd.size()){
            ans.add(odd.get(j));
            j++;
        }
        
        return ans;
    }
}




//{ Driver Code Starts.

// Driver class
class Array {

    // Driver code
    public static void main(String[] args) throws IOException {
        // Taking input using buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testcases = Integer.parseInt(br.readLine());
        // looping through all testcases
        while (testcases-- > 0) {
            int n = Integer.parseInt(br.readLine());
//            String line = br.readLine();
//            String[] q = line.trim().split("\\s+");
//            int n =Integer.parseInt(q[0]);
//            int k =Integer.parseInt(q[1]);
//            //int y =Integer.parseInt(q[2]);
            String line1 = br.readLine();
            String[] a1 = line1.trim().split("\\s+");
            long a[] = new long[n];
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(a1[i]);
            }
//            String line2 = br.readLine();
//            String[] a2 = line2.trim().split("\\s+");
//            long b[] = new long[m];
//            for (int i = 0; i < m; i++) {
//                b[i] = Long.parseLong(a2[i]);
//            }
            Solution ob = new Solution();
            ArrayList<Long> ans=ob.arrangeOddAndEven(a,n);
            for (int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();

        }
    }
}




// } Driver Code Ends