//{ Driver Code Starts
    import java.util.*;
    class Node {
            char data;
            Node next;
     
            // Constructor to create a new node
            Node(char d) 
            {
                data = d;
                next = null;
            }
        }
      class LinkedList_Compare
       {
        Node head;
        
        public void addToTheLast(Node node)
        {
            if (head == null) 
            {
               head = node;
            } else 
            {
               Node temp = head;
               while (temp.next != null)
                temp = temp.next;
    
               temp.next = node;
            }
        }
     
         public static void main(String args[])
        {
           
             
            /* Constructed Linked List is 1->2->3->4->5->6->
               7->8->8->9->null */
             Scanner sc = new Scanner(System.in);
             int t=sc.nextInt();
             
             while(t>0)
             {
                 LinkedList_Compare llist1 = new LinkedList_Compare();
                 LinkedList_Compare llist2 = new LinkedList_Compare();
                int n1 = sc.nextInt();
                
                int value = 0;
                
                        char a1=sc.next().charAt(0);
                                Node head1= new Node(a1);
                                llist1.addToTheLast(head1);
                                
                                for (int i = 1; i < n1; i++) 
                                {
                                        char a = sc.next().charAt(0); 
                                        llist1.addToTheLast(new Node(a));
                                     
                                }
                    
                
                    int n2 = sc.nextInt();
                            char b1=sc.next().charAt(0);
                            Node head2 = new Node(b1);
                            llist2.addToTheLast(head2);
                             
                            for (int i = 1; i < n2; i++) 
                            {
                                //int b;
                                
                                 char b = sc.next().charAt(0); 
                                llist2.addToTheLast(new Node(b));
                            }
     
            //int value=0;
            GfG g = new GfG();
            value = g.compare(llist1.head, llist2.head);
            System.out.println(value);
        t--;
        }
        
    }}
    // } Driver Code Ends
    
    
    /*  Structure of Node
    class Node
     {
        char data;
        Node next;
     
        // Constructor to create a new node
        Node(char d) 
        {
           data = d;
           next = null;
        }
     }*/
    
    class GfG
    {
        int compare(Node node1, Node node2)
        {
          //Your code here
          Node n1 = node1;
          Node n2 = node2;
          
          String s1 = "";
          String s2 = "";
          while(n1 != null){
              s1 += n1.data;
              n1 = n1.next;
          }
          while(n2 != null){
              s2 += n2.data;
              n2 = n2.next;
          }
          int result = s1.compareTo(s2);
          if( result > 0){
              return 1;
          }else if(result < 0){
              return -1;
          }
          return 0;
        }
    }