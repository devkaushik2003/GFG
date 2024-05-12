//{ Driver Code Starts
    import java.util.*;
    import java.lang.*;
    
    class Node
    {
        int data;
        Node next;
        Node(int key)
        {
            data = key;
            next = null;
        }
    }
    
    class Rerrange
    {
        static Node head;
        public static void main (String[] args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            
            while(t-- > 0)
            {
                int n = sc.nextInt();
                int a1 = sc.nextInt();
                Node head = new Node(a1);
                addToTheLast(head);
                
                for(int i = 1; i < n; i++)
                {
                    int data = sc.nextInt();
                    addToTheLast(new Node(data));
                }
                GfG gfg = new GfG();
                Node node = gfg.rearrange(head);
                printList(node);
                System.out.println();
            }
        }
        
        public static void addToTheLast(Node node)
        {
            if(head == null)
            {
                head = node;
            }
            else
            {
                Node temp = head;
                while(temp.next != null)
                  temp = temp.next;
                  temp.next = node;
            }
        }
        
        public static void printList(Node node)
        {
            while(node != null)
            {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }
    }
    
    
    // } Driver Code Ends
    
    
    /*
    The structure of linked list is the following
    
    class Node
    {
    int data;
    Node next;
        Node(int key)
        {
            data = key;
            next = null;
        }
    }
    */
    
    class GfG 
    {
        public static Node rearrange(Node head)
        {
            Node mid = middle(head);
            Node newhead = reverse(mid);
            Node node = head;
            
            Node temp;
            while(node != null && newhead != null){
                temp = node.next;
                node.next = newhead;
                node = temp;
                temp = newhead.next;
                newhead.next = node;
                newhead = temp;
            }
            if(node != null){
                node.next = null;
            }
            return head;
        }
        static Node middle(Node head){
            Node s = head;
            Node f = head;
            while(f != null && f.next != null){
                f = f.next.next;
                s = s.next;
                
            }
            return s;
            
        }
        static Node reverse(Node head){
            Node prev = null;
            Node pres = head;
            Node nex = pres.next;
            while(pres != null){
                pres.next = prev;
                prev = pres;
                pres  = nex;
                if(nex != null){
                    nex = nex.next;
                }
            }
            return prev;
        }
    }
    
    
    