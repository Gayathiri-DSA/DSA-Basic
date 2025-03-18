/*
Check if array is sorted
Difficulty: Easy Accuracy: 39.37% Submissions: 242K+ Points: 2 Average Time: 15m
Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.
problem link :https://www.geeksforgeeks.org/problems/check-if-an-array-is-sorted0701/1 */
class Solution 
{
    public boolean arraySortedOrNot(int[] arr)
    {
       //// Iterate through the array starting from the second element
       for(int i=1 ; i<arr.length ; i++)
       {
          // If the current element arr[i] is greater than or equal to the previous element arr[i-1], 
          // do ntg the condition will be true.
           if(arr[i] >= arr[i-1]) //non descending 
           {
             // ok it is in sorted order  
           }
           else
           {
               return false;
           }
       }
    
        return true;
    }
}
