//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.io.*;

class FastReader{ 
    BufferedReader br; 
    StringTokenizer st; 

    public FastReader(){ 
        br = new BufferedReader(new InputStreamReader(System.in)); 
    } 

    String next(){ 
        while (st == null || !st.hasMoreElements()){ 
            try{ st = new StringTokenizer(br.readLine()); } catch (IOException  e){ e.printStackTrace(); } 
        } 
        return st.nextToken(); 
    } 

    String nextLine(){ 
        String str = ""; 
        try{ str = br.readLine(); } catch (IOException e) { e.printStackTrace(); } 
        return str; 
    } 
    
    Integer nextInt(){
        return Integer.parseInt(next());
    }
} 

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class GFG{
	static void printList(Node node, PrintWriter out) 
	{ 
		while (node != null) 
		{ 
			out.print(node.data + " "); 
			node = node.next; 
		} 
		out.println(); 
	}
    public static void main(String args[]) throws IOException { 
        FastReader sc = new FastReader();
        PrintWriter out = new PrintWriter(System.out);
        int t = sc.nextInt();
        while(t > 0){
        	int n = sc.nextInt();
            Node head = new Node(sc.nextInt());
            Node tail = head;
            for(int i=0; i<n-1; i++)
            {
                tail.next = new Node(sc.nextInt());
                tail = tail.next;
            }
            Solution ob = new Solution();
            Node ans = ob.divide(n, head);
            printList(ans, out); 
            t--;
        }
        out.flush();
    } 
} 
// } Driver Code Ends


//User function Template for Java

/* 
class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution{
    Node divide(int N, Node head){
        // code here
        Node node = head;
        
        Node evehead = null;
        Node evetail = null;
        Node oddhead = null;
        Node oddtail = null;
        
        for(int i = 0;i<N;i++){
            if(node.data % 2 == 0){
                if(evehead == null){
                    evehead = node;
                    evetail = evehead;
                }else{
                    evetail.next = node;
                    evetail = node;
                }
            }else{
                if(oddhead == null){
                    oddhead = node;
                    oddtail = oddhead;
                    
                }else{
                    oddtail.next = node;
                    oddtail = node;
                }
            }
            node = node.next;
        }
        if (evetail != null) {
            evetail.next = oddhead;  // Connect the end of even list to the start of odd list
        }
        
        if (oddtail != null) {
            oddtail.next = null;  // Ensure the last odd node points to null
        }
        
        return evehead != null ? evehead : oddhead;
    }
}

