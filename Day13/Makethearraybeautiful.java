//{ Driver Code Starts
    import java.io.*;
    import java.util.*;
    
    class IntArray {
        public static int[] input(BufferedReader br, int n) throws IOException {
            String[] s = br.readLine().trim().split(" ");
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(s[i]);
    
            return a;
        }
    
        public static void print(int[] a) {
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    
        public static void print(ArrayList<Integer> a) {
    
            for (int e : a) System.out.print(e + " ");
            System.out.println();
        }
    }
    
    class GFG {
        public static void main(String[] args) throws IOException {
            BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));
            PrintWriter out = new PrintWriter(System.out);
            int t;
            t = Integer.parseInt(br.readLine());
            while (t-- > 0) {
    
                int n;
                n = Integer.parseInt(br.readLine());
    
                int[] arr = IntArray.input(br, n);
    
                Solution obj = new Solution();
                ArrayList<Integer> res = obj.makeBeautiful(arr);
                for (int e : res) out.print(e + " ");
                out.println();
            }
            out.close();
        }
    }
    
    // } Driver Code Ends
    
    
    class Solution {
        public static ArrayList<Integer> makeBeautiful(int[] arr) {
            // code h(iere
            ArrayList<Integer> brr = new ArrayList<>();
            int n = arr.length;
    
            for (int i = 0; i < n ; i++) {
                int m = brr.size();
    
                if (m == 0 || check(brr.get(m - 1), arr[i])) {
                    brr.add(arr[i]);
                } else {
                    brr.remove(m - 1);
                }
            }
    
            return brr;
        }
    
        static boolean check(int a, int b) {
            if (a < 0 && b >= 0) {
                return false;
            } else if (a >= 0 && b < 0) {
                return false;
            }
            return true;
        }
            
        
    }
    