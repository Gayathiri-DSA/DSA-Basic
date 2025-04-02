/*
Peak element
Difficulty: Basic Accuracy: 38.86% Submissions: 544K+ Points: 1 Average Time: 30m
Given an array arr[] where no two adjacent elements are same, find the index of a peak element. 
An element is considered to be a peak if it is greater than its adjacent elements (if they exist). 
If there are multiple peak elements, return index of any one of them. The output will be "true" if the index returned by your function is correct; otherwise, it will be "false".
Note: Consider the element before the first element and the element after the last element to be negative infinity.
Problem Link : https://www.geeksforgeeks.org/problems/peak-element/1
*/

class Solution 
{

    public int peakElement(int[] arr)
    {
        int n=arr.length;
        // Iterate thru array
        for(int i=0;i<n;i++)
        {
            // if either first or last element to be peak return i - since it has hypothetical -infinity on either end 
            
            // that is not the case then check A peak element is one that is greater than both its neighbors.
            
            //arr[i-1]<arr[i]>arr[i+1]
            if((i==0 || arr[i]>arr[i-1]) && (i==n-1||arr[i]>arr[i+1]))
            {
                return i;
            }
        }
        return -1;
    }
}
/*
Note : Optimized approach for multiple peaks 

// Peak : arr[i-1] < arr[i] > arr[i+1]
        int n=arr.length;
        
        //edge case : only 1 element present ; first ele to be peak ; last ele to be peak == return true
        if(n==1) return arr[0];
        
        if(arr[0]>arr[1]) return arr[0];
        
        if(arr[n-1]>arr[n-2]) return arr[n-1];
        
        int low = 1,high = n-2;
        
        while(low<=high)
        {
            int mid= (low + high)/2;
            
            //Mid is peak
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1])
            { 
                
                return arr[mid];
                
            }
            // peak is @ right--mid @ increasing curve 
            else if(arr[mid] > arr[mid-1])
            {
                low = mid+1;
            }
            // peak is @ left -- mid @ decreasing curve
            else
            {
                high = mid-1;
            }
        }
        return -1;
    */
