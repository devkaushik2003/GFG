//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.lang.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

public class Driverclass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(in.readLine().trim());

        while (t-- > 0) {
            int n = Integer.parseInt(in.readLine().trim());
            String s[] = in.readLine().trim().split(" ");
            Node head = new Node(Integer.parseInt(s[0]));
            Node tail = head;
            for (int i = 1; i < n; i++) {
                tail.next = new Node(Integer.parseInt(s[i]));
                tail = tail.next;
            }

            head = new Solution().segregate(head);
            printList(head, out);
            out.println();
        }
        out.close();
    }

    public static void printList(Node head, PrintWriter out) {
        if (head == null) return;

        Node temp = head;
        while (temp != null) {
            out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
// } Driver Code Ends


// User function Template for Java

/*
class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    // Function to sort a linked list of 0s, 1s, and 2s.
    static Node segregate(Node head) {
        // Add your code here
        if (head == null || head.next == null) {
            return head;
        }
        int z = 0;
        int o = 0;
        int t = 0;
        

        Node node = head;
        while(node != null){
            if(node.data == 0){
                z++;
            }else if(node.data == 1){
                o++;
            }else{
                t++;
            }
            node = node.next;
        }
        node = head;
        while(node != null){
            while(z > 0){
                node.data = 0;
                z--;
                node = node.next;
            }
            while(o > 0 ){
                node.data = 1;
                o--;
                node = node.next;
            }
            while( t > 0){
                node.data = 2;
                t--;
                node = node.next;
            }
        }
        return head;
    }
}

