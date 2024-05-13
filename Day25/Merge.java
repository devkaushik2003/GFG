//{ Driver Code Starts
    import java.util.*;

    class Node
    {
        int data;
        Node next;
        Node(int d) {
            data = d; 
            next = null;
        }
    }
    
    
    class MergeLists
    {
        Node head;
    
    
    
      /* Function to print linked list */
       public static void printList(Node head)
        {
            
            while (head!= null)
            {
               System.out.print(head.data+" ");
               head = head.next;
            }  
            System.out.println();
        }
        
         
     
         /* Driver program to test above functions */
        public static void main(String args[])
        {
           
             
            /* Constructed Linked List is 1->2->3->4->5->6->
               7->8->8->9->null */
             Scanner sc = new Scanner(System.in);
             int t=sc.nextInt();
             
             while(t>0)
             {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                Node head1 = new Node(sc.nextInt());
                Node tail1 = head1;
                for(int i=0; i<n1-1; i++)
                {
                    tail1.next = new Node(sc.nextInt());
                    tail1 = tail1.next;
                }
                Node head2 = new Node(sc.nextInt());
                Node tail2 = head2;
                for(int i=0; i<n2-1; i++)
                {
                    tail2.next = new Node(sc.nextInt());
                    tail2 = tail2.next;
                }
                
                LinkedList obj = new LinkedList();
                Node head = obj.sortedMerge(head1,head2);
                printList(head);
                
                t--;
                
             }
        }
    }
    
    // } Driver Code Ends
    
    
    /*
      Merge two linked lists 
      head pointer input could be NULL as well for empty list
      Node is defined as 
        class Node
        {
            int data;
            Node next;
            Node(int d) {data = d; next = null; }
        }
    */
    
    class LinkedList
    {
        //Function to merge two sorted linked list.
        Node sortedMerge(Node head1, Node head2) {
         // This is a "method-only" submission. 
         // You only need to complete this method
         Node node1 = head1;
         Node node2 = head2;
         Node head = null;
         Node prev = null;
         if (node1 == null) return node2; // If one list is empty, return the other list
         if (node2 == null) return node1;
         if(node1.data < node2.data){
             head = node1;
             prev = node1;
             node1 = node1.next;
         }else{
             head = node2;
             prev = node2;
             node2 = node2.next;
         }
         
         while(node1 != null && node2 != null){
             if(node1.data < node2.data){
                 prev.next = node1;
                 prev = node1;
                 node1 = node1.next;
             }else{
                 prev.next = node2;
                 prev = node2;
                 node2 = node2.next;
             }
             
             
         }
         if (node1 != null) {
             
             prev.next = node1;
            }
    
            // Append remaining nodes of list 2
         if (node2 != null) {
             prev.next = node2;
            }
         return head;
       } 
    }

    