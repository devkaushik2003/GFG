//{ Driver Code Starts
    import java.util.Scanner;
    import java.io.*;
    
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    class GFG1 {
        public static void printList(Node head)
        {
            Node start=head;
            System.out.print(head.data+" ");
            head=head.next;
            while(head!=start)
            {
                System.out.print(head.data+" ");
                head=head.next;
            }
            System.out.println();
        }
        public static void main (String[] args) {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0)
            {
                int n=sc.nextInt();
                Node start=null,cur=null;
                for(int i=0;i<n;i++)
                {
                    int a=sc.nextInt();
                    Node ptr=new Node(a);
                    if(start==null)
                    {
                        start=ptr;
                        cur=ptr;
                    }
                    else
                    {
                        cur.next=ptr;
                        cur=ptr;
                    }
                }
                int delNode=sc.nextInt();
                cur.next=start;
                GFG obj=new GFG();
                Node head=obj.deleteNode(start,delNode);
                start=obj.reverse(head);
                printList(start);
            }
        }
    }
    // } Driver Code Ends
    
    
    /*class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data=d;next=null;
        }
    }*/
    
    class GFG
    {
        //This method returns the head of the LL after deleting node with value d.
        public static Node deleteNode(Node head,int d)
        {
            //Add your code here.
            Node tail = null;
            Node node  = head;
            while(node.next != head){
                node = node.next;
            }
            tail = node;
            node = head;
            if(node.data == d){
                head = head.next;
                tail.next = head;
                return head;
            }
            
            do{
                Node n = node.next;
                if(n.data == d){
                    node.next = n.next;
                }
                node = node.next;
            }while(node != head);
            return head;
        }
        //This method returns the head node of the reversed Linked list.
        public static Node reverse(Node head)
        {
            //Add your code here
            Node temp = head.next;
            Node prev = head;
            while(temp != head){
                Node nex = temp.next;
                
                temp.next = prev;
                prev = temp;
                temp = nex;
            }
            temp.next = prev;
            head = prev;
            return head;
            
        }
    }