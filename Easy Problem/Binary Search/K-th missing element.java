/*
K-th missing element
Difficulty: Easy Accuracy: 31.53% Submissions: 32K+ Points: 2
Given an increasing sequence arr, we need to find the K-th smallest missing element, taking the first element of the array as the starting point in the increasing sequence. 
If there is no k-th missing element then output -1.
Problem Link : https://www.geeksforgeeks.org/problems/k-th-missing-element3635/1
*/
class Solution {

    int KthMissingElement(int arr[], int k) 
    {
        int ans = -1;
        
        for(int i=1; i<arr.length; i++){
            int missing = arr[i] - arr[0] - i;
            if(missing >= k){
                ans = arr[i] - 1 - missing + k;
                break;
            }
        }
        
        return ans;
         
    }
}

/*
Note : 
Simple for loop --> t.c == O(N)

for( int i= 0; i<arr.length ;i++)
        {
            if(arr[i] <= k)
                k ++;
            else
                break ;
        }
       return k; 
       
Using Binary search
       int low = 0 , high = arr.length -1;
        while(low <= high)
        {
            int mid = (low + high)/2;
            
            //1. Find the index where k lies
                // element @ mid - (index +1)
            int missing = arr[mid] - (mid+arr[0]) ;
            
            if(missing < k)
             {
                 low = mid + 1;
             }
             //missing> k trim search space
             else
             {
                 high = mid -1;
             }
        }
        
        //2.Find the number == > arr[high] + more (k - missing(arr[high] - (high +1)))
        // can be written as follow :
         return  (low + k); // or :(k +high + 1 )
   
    */
