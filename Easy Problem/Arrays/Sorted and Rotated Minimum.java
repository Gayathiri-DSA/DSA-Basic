/*
Sorted and Rotated Minimum
Difficulty: Easy Accuracy: 40.57% Submissions: 143K+ Points: 2
A sorted array of distinct elements arr[] is rotated at some unknown point, the task is to find the minimum element in it. 
Problem link :https://www.geeksforgeeks.org/problems/minimum-element-in-a-sorted-and-rotated-array3611/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=who-will-win
*/

class Solution {
    public int findMin(int[] arr) 
    { // assume the first ele n an arr to be minimum
        int min = arr[0];
        
        // iterate thru arr
        for(int i=1;i<arr.length;i++)
        {
            // if i encounter the element @ possition i to be smaller that min
            if(arr[i] <= min)
            {
                //then ill returm that element @ i position to be minimum
                return arr[i];
            }
        }
        // after iterating thru arr no min is found then the intial (ie first element )to be minimum which is stored @ min
        return min;
    }
}
