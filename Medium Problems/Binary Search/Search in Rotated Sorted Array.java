/*
Search in Rotated Sorted Array
Difficulty: Medium Accuracy: 37.64% Submissions: 258K+ Points: 4
Given a sorted and rotated array arr[] of distinct elements, the task is to find the index of a target key. Return -1 if the key is not found.
Problem Link :https://www.geeksforgeeks.org/problems/search-in-a-rotated-array4618/1
*/


class Solution {
    int search(int[] arr, int key) {
        // Initializing low,high
        int low = 0 , high = arr.length-1;
        
        while(low <=high)
        {
            int mid = (low + high)/2;
            
            // if ele @ mid == key return key/element
            if(key == arr[mid]) 
                return mid;
            
            // if left half is sorted
            if(arr[low] <= arr[mid])
            {
                // check which half key exist
                if(arr[low] <= key && key <= arr[mid])
                    {
                        // key is @ left move high before mid to trim search space by n/2
                        high = mid-1;
                    }
                else// key is @ right move low after mid to trim search space
                    {
                        low = mid+1;
                    }
            }
            // if Right half is sorted  arr[mid] <= arr[high]
            else
            {
                // check where key exist and trim the other half
                if(arr[mid] <= key && key <= arr[high])
                {
                    // key is @ right move low after mid to trim search space
                    low = mid +1;
                }
                else
                {
                    // key is @ left move high before mid to trim search space by n/2
                    high = mid -1;
                }
            }
        }
         return -1;
    }
}
