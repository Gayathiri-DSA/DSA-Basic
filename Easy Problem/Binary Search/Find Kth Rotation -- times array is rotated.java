/*
Find Kth Rotation
Difficulty: Easy Accuracy: 23.16% Submissions: 277K+ Points: 2 Average Time: 20m
Given an increasing sorted rotated array arr of distinct integers. The array is right-rotated k times. Find the value of k.
Let's suppose we have an array arr = [2, 4, 6, 9], so if we rotate it by 2 times so that it will look like this:
After 1st Rotation : [9, 2, 4, 6]
After 2nd Rotation : [6, 9, 2, 4]
Problem Link : https://www.geeksforgeeks.org/problems/rotation4723/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=rotation
*/

class Solution 
{
    public int findKRotation(List<Integer> arr)
    {
        int low =0 ,high =arr.size()-1 ;
        int ans =Integer.MAX_VALUE;
        int index =-1;
        
        while(low <=high)
        {
            int mid =(low+high)/2;
            
            //if arr/search space is sorted low <=high
            if(arr.get(low) <=arr.get(high))
            { 
                // check if ele@low < ans return index of low and update ans to value in low
                if(arr.get(low)< ans)
                {
                    index=low;
                    ans=arr.get(low);
                }
                break;
            }
            // left sorted low-- mid
            if(arr.get(low)<=arr.get(mid))
            {
                // check if ele@low < ans return index of low and update ans to value in low and trim search space for finding next smallest element 
                if(arr.get(low)<ans)
                {
                    index = low;
                    ans=arr.get(low);
                }
                low =mid+1;
            }
            //right sorted  mid -- high
            else
            {
                if(arr.get(mid)<=arr.get(high))
                {
                // check if ele@ mid < ans= return index of mid and update ans to value in mid and trim search space for finding next smallest element 
                    if(arr.get(mid)<ans)
                    {
                        index=mid;
                        ans=arr.get(mid);
                    }
                    high = mid-1;
                }
            }
        }
        // finally return index -- which contains the no of times an array is sorted
        return index;
    }
}

/*Note :

        ** Similar to find minimum in rotated sorted array only difference is return the index and store & update minimum element in ans ( i.e low,mid,high)
        
        In Java, when working with List<Integer>, we need to use .size() and .get(index) instead of .length and array indexing (arr[index]).
        
            ** size() -- Lists in Java are zero-based indexed (like arrays) 
                        arr.size() returns the number of elements in the list.
            ** .get() --Unlike arrays (arr[index]), lists in Java do not allow direct indexing.
                        Instead, you must use .get(index) to access elements.
*/
