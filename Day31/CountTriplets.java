//{ Driver Code Starts
    import java.util.*;
    class Node{
        int data;
        Node next;
        
        Node(int a){
            data = a;
            next = null;
        }
        
    }
    
    class LinkedList{
        
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-->0){
                int n=sc.nextInt();
                int x=sc.nextInt();
                Node head=null;
                for(int i=0;i<n;i++)
                {int a=sc.nextInt();
                if(head==null){
                    head=new Node(a);
                }
                else
                    insert(head,a);
                }
            
                Solve y = new Solve();
                System.out.println(y.countTriplets(head,x));
            }
        }
        public static Node insert(Node head,int a){
            if(head==null){
                return new Node(a);
            }
            head.next=insert(head.next,a);
            return head;
        }
        
    }
    
    
    // } Driver Code Ends
    
    
    //User function Template for Java
    
    class Solve
    {
        static int countTriplets(Node head, int x) 
        { 
            //code here.
            ArrayList<Integer> list = new ArrayList<>();
            Node node = head;
            while(node != null){
                list.add(node.data);
                node = node.next;
                
            }
            
            int c = 0;
            for(int i = 0;i<list.size();i++){
                int left = i+1;
                int right = list.size() - 1;
                
            
                while(left < right){
                    int sum = list.get(i) + list.get(left) + list.get(right);
                    if(sum == x){
                        c++;
                        left++;
                        right--;
                    }else if (sum < x){
                        right-- ;
                    }else{
                        left++;
                    }
                    
                }
            }
            return c;
        } 
    }