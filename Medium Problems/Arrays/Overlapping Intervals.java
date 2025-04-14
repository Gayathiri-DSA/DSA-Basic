/*
Overlapping Intervals
Difficulty: Medium Accuracy: 57.41% Submissions: 97K+ Points: 4
Given an array of Intervals arr[][], where arr[i] = [starti, endi]. The task is to merge all of the overlapping Intervals.
Problem Link : https://www.geeksforgeeks.org/problems/overlapping-intervals--170633/1
*/
class Solution {
    public List<int[]> mergeOverlap(int[][] arr) {
        //Edge Case : if arr is empty 
        if(arr==null || arr.length == 0)
        {
            return Collections.emptyList();
        }
        
        // Store merged intervals on list --> ans
        List<int[] > ans = new ArrayList<>();
        
        // Sort the array if 1st--start element is same then sort them according to  2nd element-- end
        /// Sort intervals based on the start time
        Arrays.sort(arr,(a,b)->a[0]-b[0]);
        
        //Initializing start and end of the interval -->lambda operator
        int start = arr[0][0];
        int end = arr[0][1];
        
        //Iterate thru intervals ;// Start from the second interval since first is already considered
        for(int i=1;i<arr.length ;i++)
        {
            // 2nd ele(end) of the interval is found to be greater than start of next element 
            if(end>= arr[i][0])
            {
                //Update end with max value to merge overlapping interval
                end = Math.max(arr[i][1],end);
            }
            // end ! > then the interval is found to be new interval and repeat the above to merge interval
            //// No overlap, add the previous interval and move to the next
            else
            {
                ans.add(new int[]{start,end});
                start = arr[i][0];
                end = arr[i][1];
                
            }
        }
         // Add the last interval
         ans.add(new int[]{start,end});
         return ans;
    }
}
