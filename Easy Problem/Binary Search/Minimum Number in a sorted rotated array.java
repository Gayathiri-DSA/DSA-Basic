/*
Minimum Number in a sorted rotated array
Difficulty: Easy Accuracy: 43.12% Submissions: 83K+ Points: 2 Average Time: 30m
Given an array of distinct elements which was initially sorted. This array may be rotated at some unknown point.
The task is to find the minimum element in the given sorted and rotated array. 
Problem Link : https://www.geeksforgeeks.org/problems/minimum-number-in-a-sorted-rotated-array-1587115620/1
*/
class Solution
{
    //Function to find the minimum element in sorted and rotated array.
    static int minNumber(int arr[], int low, int high)
    {
        int ans=Integer.MAX_VALUE; //Integer.MAX_VALUE is an inbuilt method to store smallest elemenet 
        
        // stop loop when low goes beyond high or vicec versa
        while(low <= high)
        {
           // find mid 
        int mid =(low + high)/2;
        
        // fing the rotating point to find minimum element & unsorted half in array
        
        // if left half is sorted based on ele at lower index are lower than mid then take smallest element from them and store in ans then eliminate them by moving low next to mid
        if(arr[low] <= arr[mid])
        {
            ans = Math.min(ans,arr[low]); // update ans
            
            low = mid+1;// trim search space
        }
        // if right is sorted then take smalest element and update ans to smallest element trim search space for finding next smallest element by moving high before to mid
        else
        {
            ans =Math.min(ans,arr[mid]);
            
            high = mid-1;
        }
         }
         return ans;
    }
}
