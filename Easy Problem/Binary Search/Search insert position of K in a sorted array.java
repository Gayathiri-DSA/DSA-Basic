/*
Search insert position of K in a sorted array
Difficulty: Easy Accuracy : 38.99% Submissions: 77K+ Points: 2
Given a sorted array Arr[](0-index based) consisting of N distinct integers and an integer k, the task is to find the index of k, if its present in the array Arr[].
Otherwise, find the index where k must be inserted to keep the array sorted.
Problem Link : https://www.geeksforgeeks.org/problems/search-insert-position-of-k-in-a-sorted-array/1
*/
class Solution
{
    static int searchInsertK(int Arr[], int N, int k)
    {
        // Initializing low -0 ,high -last ele & ans = N 
        int low =0 , high = Arr.length-1,ans=N;
        
        // as long is low <= high loop runs so high does not go beyond low
        while(low <= high)
        {
            // find mid to trim the search space
            int mid = low + (high - low)/2;
            
            // to insert ele check using lower bound 
            if(Arr[mid] >= k)
            {
                // condt true add index to ans then trim the search space to look for smallest index
                ans = mid;
                high = mid -1;
            }
            // if it goes beyond condt then trim search space from other end
            else
            {
                low = mid+1;
            }
        }
        return ans;
    }
}
