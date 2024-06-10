//{ Driver Code Starts
import java.util.*;

// Position this line where user code will be pasted.

class GFG {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Solution ob = new Solution();

        int T = sc.nextInt();

        while (T != 0) {
            long n = sc.nextLong();
            if (ob.fascinating(n))
                System.out.println("Fascinating");
            else
                System.out.println("Not Fascinating");
            T--;
        }
    }
}
// } Driver Code Ends


class Solution {
    boolean fascinating(long N) {
        // code here
        if (N < 100) {
            return false;
        }

        // Multiply by 2 and 3
        long N2 = N * 2;
        long N3 = N * 3;

        // Concatenate the results into a single string
        String concatenated = "" + N + N2 + N3;

        // Check if the concatenated string contains all digits from 1 to 9 exactly once
        if (concatenated.length() != 9) {
            return false;
        }

        boolean[] seen = new boolean[10]; // Array to keep track of seen digits
        for (char ch : concatenated.toCharArray()) {
            if (ch == '0' || seen[ch - '0']) {
                return false;
            }
            seen[ch - '0'] = true;
        }

        // Verify that all digits from 1 to 9 are present
        for (int i = 1; i <= 9; i++) {
            if (!seen[i]) {
                return false;
            }
        }

        return true;
    
        
        
    }
}