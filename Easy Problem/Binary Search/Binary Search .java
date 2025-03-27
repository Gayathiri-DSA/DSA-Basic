/*
Binary Search
Difficulty: EasyAccuracy: 44.32%Submissions: 574K+Points: 2Average Time: 20m
Given a sorted array arr and an integer k, find the position(0-based indexing) at which k is present in the array using binary search.
Note: If multiple occurrences are there, please return the smallest index.
Problem Link : https://www.geeksforgeeks.org/problems/binary-search-1587115620/1
*/
class Solution 
{
    public int binarysearch(int[] arr, int k)
    {
        // initialize low to 0th element in arr & high to last element
        int low =0 , high = arr.length-1,res=-1;
        
        // low should never exceed high if exceed/exhaust then element is not present return -1
        while(low <= high)
        {
            //Step 1 : find mid 
            int mid = low +(high - low) /2; //To avoid integer overflow
            
            // Step 2 : check if mid == target(k) if so return mid ;else find where target is and trim the search space
            
            //If k is found at mid, it stores the index in res but continues searching in the left half (high = mid - 1).
            //This ensures that even if k appears multiple times, the loop keeps searching for its first occurrence.
            if(arr[mid]==k)
            {
                res= mid;
                high=mid-1;
            }
            //Step 3: target is > mid then search in right half and eliminate left by bringing low to mid +1
            else if( k > arr[mid])
            {
                low = mid+1;
            }
            //Step 4:target is < than mid then search left half & eliminate  right half by moving high to mid-1
            else 
            {
              high = mid-1;
            }
        }
        return res;
    }
    
}
/*Note:
// using recursion
void binarysearch1(int[] arr,int low,int high,int k)
      //  int low=arr[0], high=arr.length;
        // Edge case : low move beyond high -- element not present
        if(low > high) return -1;
        
        // Step 1:Find mid
        int mid = (low + high)/2;
        
        //Step 2: Check mid == target (k)
        if(arr[mid]==k)  return mid;
        
        //Step 3: If not equal then trim the search space target > mid -- eliminate left and search right after mid 
        //other case target < mid --eliminate right & search left before mid
        else if (k > arr[mid])
            return binarysearch1(arr,mid+1,high,k);
        return binarysearch1(arr,mid-1,high,k);
*/
