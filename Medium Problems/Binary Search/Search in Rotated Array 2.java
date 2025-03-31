/*
Search in Rotated Array 2
Difficulty: Medium Accuracy: 46.6% Submissions: 23K+ Points: 4 Average Time: 20m
Given a sorted and rotated array arr and a target key k which is rotated at some point, and may contain duplicates and given an element key. 
Check whether the key is present in the array or not.
Problem Link :https://www.geeksforgeeks.org/problems/search-in-rotated-array-2/1
*/
class Solution {
    public static boolean Search(int[] arr, int k) {
       
        // Initializing low,high
        int low = 0 , high = arr.length-1;
        
        while(low <=high)
        {
            int mid = (low + high)/2;
            
            // I .if ele @ mid == k return True/False
            if(k == arr[mid]) 
                return true;
                
            // II. Identify the sorted half since duplicates present this condt is mandatory and check where key lies and eliminate the other half
            
            // if low,mid,high = same no then move low and high by 1 
            if(arr[low]== arr[mid] &&  arr[mid]== arr[high])
            {
                low ++;
                high --;
                continue; // incase of multiple duplicates do the same
            }
            
            // if left half is sorted
            if(arr[low] <= arr[mid])
            {
                // check which half k exist
                if(arr[low] <= k && k <= arr[mid])
                    {
                        // k is @ left move high before mid to trim search space by n/2
                        high = mid-1;
                    }
                else// k is @ right move low after mid to trim search space
                    {
                        low = mid+1;
                    }
            }
            // if Right half is sorted  arr[mid] <= arr[high]
            else
            {
                // check where key exist and trim the other half
                if(arr[mid] <= k && k <= arr[high])
                {
                    // k is @ right move low after mid to trim search space
                    low = mid +1;
                }
                else
                {
                    // k is @ left move high before mid to trim search space by n/2
                    high = mid -1;
                }
            }
        }
         return false;
    }
}
