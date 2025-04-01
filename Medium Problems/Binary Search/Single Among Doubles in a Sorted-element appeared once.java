/*
Single Among Doubles in a Sorted
Difficulty: Medium Accuracy: 55.54% Submissions: 99K+ Points: 4
Given a sorted array arr[]. Find the element that appears only once in the array. All other elements appear exactly twice. 
You solution must run in O(log n) time and O(1) space.
Problem Link : https://www.geeksforgeeks.org/problems/find-the-element-that-appears-once-in-sorted-array0624/1
*/
class Solution 
{
    int findOnce(int[] arr) 
    {
        // (even,odd) -- single element in right half -- eliminate left 
        //(odd,even) -- single element in left half -- eliminate right
        
        int n=arr.length;
        
        // edge case : 
         //Single element present 
         if(n==1)  return arr[0];
         
         // First element appeared once
        if(arr[0]!=arr[1]) return arr[0];
        
        //Last element appeared once
        if(arr[n-1]!=arr[n-2]) return arr[n-1];
        
        int low =1,high=n-2;
        
        while(low <= high)
        {
            int mid = (low+high)/2;
            
            //Mid element appeared once;return mid --check either prev or next to be same -- in case of appearing twice
            //Search :
            if(arr[mid]!= arr[mid-1] && arr[mid]!= arr[mid+1])
            {
                return arr[mid];
            }
            //Eliminate: we r in left trim/eliminate search space to find ele appeared once
            
            // (even,odd) -- single element in right half -- eliminate left 
            //(odd,even) -- single element in left half -- eliminate right
            
            if((mid%2 == 1 && arr[mid]==arr[mid-1])
                || (mid%2 == 0 && arr[mid]==arr[mid+1]))
            {
                low =mid+1;
            }
            //Eliminate: we r in right trim/eliminate search space to find ele appeared once
            else
            {
                high =mid-1;
            }
        }
        return -1;
    }
}
