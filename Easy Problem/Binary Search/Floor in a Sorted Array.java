/*
Floor in a Sorted Array
Difficulty: Easy Accuracy: 33.75% Submissions: 462K+ Points: 2 Average Time: 30m
Given a sorted array arr[] and an integer x, find the index (0-based) of the largest element in arr[] that is less than or equal to x. 
This element is called the floor of x. If such an element does not exist, return -1.
Note: In case of multiple occurrences of ceil of x, return the index of the last occurrence.
Problem Link : https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1?track=DSASP-Searching&amp%253BbatchId=154&utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=floor-in-a-sorted-array
*/

class Solution {

    static int findFloor(int[] arr, int x) 
    {
        // Initializing variable low -0 -- first index --high-n-1 --last element -- ans - -1--if ele not present
        
        int low =0; 
        int high =arr.length-1;
        int ans = -1;
        
        // low should never cross high if it does element not present in arr and will return -1
        while(low <= high)
        {
            // in Binary search trim the search space using Mid --  to avoid oveflow use below formula
            int mid = low +(high-low)/2;
            
            //largest element in arr[] that is LESS THAN OR EQUAL TO X.
            
            if(arr[mid] <= x)
            {
                // if ele @ mid = x then update ans to mid--return index 
                ans=mid;
                
                // trim the left search space as we're looking for largest ele by moving low right after mid
                low = mid+1;
                
            }
            // if we move beyond <= x then move high before mid to get the largest element
            else
            {
                high=mid-1;
            }
        }
        return ans;
    }
}
