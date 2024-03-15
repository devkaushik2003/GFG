//{ Driver Code Starts
//Initial Template for Java

//Initial Template for Java

//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;


class Array {
    
    // Driver code
	public static void main (String[] args) throws IOException{
		// Taking input using buffered reader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testcases = Integer.parseInt(br.readLine());
		
		// looping through all testcases
		while(testcases-- > 0){
		    int sizeOfArray = Integer.parseInt(br.readLine());
		    int arr [] = new int[sizeOfArray];
		    
		    String line = br.readLine();
		    String[] elements = line.trim().split("\\s+");
		    for(int i = 0;i<sizeOfArray;i++){
		        arr[i] = Integer.parseInt(elements[i]);
		    }
		    
		    Complete obj = new Complete();
		    arr = obj.greaterElement(arr, sizeOfArray);
		    for(int i=0; i< sizeOfArray;i++){
		        if(arr[i] == -10000000)
		            System.out.print("_ ");
		        else
		            System.out.print(arr[i] + " ");
		    }
		    System.out.println();
		}
	}
}



// } Driver Code Ends


//User function Template for Java

//User function Template for Java

//User function Template for Java

            

class Complete{
    
   
    // Function for finding maximum and value pair
    public static int[] greaterElement (int arr[], int n) {
        // Complete the function
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0;i<n;i++){
            set.add(arr[i]);
        }
        int m = 0;
        int[] brr = new int[set.size()];
        for(int i : set){
            brr[m++] = i;
        }
        
        Arrays.sort(brr);
        int[] crr = new int[n];
        for(int i = 0;i<n;i++){
            int index = binary(brr,arr[i]) + 1;
            if(index < set.size()){
                crr[i] = brr[index];
                
            }else{
                crr[i] = -10000000;
            }
        }
        
        return crr;
    }
    static int binary(int[] arr , int target){
        int start = 0;
        int end = arr.length -1;
        while(start <=  end){
            int mid = start + ( end - start )/2;
            if(target == arr[mid]){
                return mid;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else{
                end = mid -1;
            }
            
        }
        return -1;
    }
    
    
}


