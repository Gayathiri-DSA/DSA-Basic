/*
First and Last Occurrences
Difficulty: Medium Accuracy: 37.36% Submissions: 280K+ Points: 4 Average Time: 15m
Given a sorted array arr with possibly some duplicates, the task is to find the first and last occurrences of an element x in the given array.
Note: If the number x is not found in the array then return both the indices as -1.
Problem Link : http://geeksforgeeks.org/problems/first-and-last-occurrences-of-x3116/1
*/
class GFG 
{
    ArrayList<Integer> find(int arr[], int x) 
    {
        
        int n=arr.length;
        
        // Call function firstoccurence & store ans in var first
        int first = FirstOccurence(arr,n,x);
        
        //check : if first still =-1 if so dont waste time on searching last occrence straightaway return -1 element not present in array
        if(first == -1)
                return new ArrayList<>(Arrays.asList(-1,-1));
                
        //similarly call lastoccurence and store in var last since its an arraylist return value should be of arraylist -- following code was similar syntax
        int last = LastOccurence(arr,n,x);
                return new ArrayList<>(Arrays.asList(first,last));    
    }
    
    //Sub Function1 : Binary Search -- First occurence
    int FirstOccurence(int[] arr,int n,int x)
    {
        // initializing variables
        int low =0 , high=n-1 ;
        int first = -1;
        
        // check : low always <= high
        while(low<=high)
        {
            // Finding mid 
           int mid = low +(high - low)/2;
           
           // condt 1: if value==x return val and trim search space move left to find first occurence
           if(arr[mid] == x)
           {
               first = mid;
               high = mid -1;
           }
           
           // condt 2: element < x trim search space --shift to right by moving low after mid
           else if (arr[mid] < x)
           {
               low = mid + 1;
           }
           //condt 3: element > x trim search space -- shift to left by moving high before mid
           else
           {
               high = mid-1;
           }
        }
        // return final answer stored @ first var
        return first;
    }
    //Sub Function2 :Binary Search -- Last occurence
     
    int LastOccurence(int[] arr,int n,int x)
    {
      
       int low =0 ,high=n-1 ;
        int last = -1;
        
        while(low<=high)
        {
           int mid = low +(high - low)/2;
           
           // condt 1: if value == x return val and trim search space move right to find last occurence
           if(arr[mid] == x)
           {
               last = mid;
                low = mid + 1;
           }
           // condt 2: element < x trim search space --shift to right by moving low after mid
           else if(arr[mid] < x)
           {
               low = mid + 1;
           }
           //condt 3: element > x trim search space -- shift to left by moving high before mid
           else
           {
               high = mid -1;
           }
        }
        // return final answer stored @ last var
        return last;
    }

}
