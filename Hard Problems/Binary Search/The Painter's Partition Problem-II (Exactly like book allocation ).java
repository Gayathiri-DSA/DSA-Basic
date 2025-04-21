/*
The Painter's Partition Problem-II
Difficulty: Hard Accuracy: 27.52% Submissions: 133K+ Points: 8
Dilpreet wants to paint his dog's home that has n boards with different lengths. 
The length of ith board is given by arr[i] where arr[] is an array of n integers. He hired k painters for this work and each painter takes 1 unit time to paint 1 unit of the board.
Return the minimum time to get this job done if all painters start together with the constraint that any painter will only paint continuous boards, say boards numbered [2,3,4] or only board [1] or nothing but not boards [2,4,5].
Problem Link : https://www.geeksforgeeks.org/problems/the-painters-partition-problem1535/1

*/
class Solution 
{
    public int countPainters(int[] arr , int time)
    {
        //Initialize 1st painter painted 0 units
        int painter = 1 , painted = 0;
        
        //Iterate thru arr of units painted
        for(int i =0 ;i< arr.length ;i++)
        {
            if(painted + arr[i] <= time)
            {
                // add units to painted till time exceeds
                painted += arr[i];
            }
            else // time exceeds move to next painter and start from remaining unit
            {
                painter ++;
                painted = arr[i];
            }
        }
        return painter;
    }
    public int minTime(int[] arr, int k) 
    {
        /*//Edge case : painter > given unit --> exceed the constraint atleast 1 painter should be given a unit
        if(painter > arr.length)
                return -1;
                */
                
                
                //Range is b/w : max -- summation (arr) worst case 
            // max -- in order to allocate all painter with atleast 1 unit -- >where min is used when not all painters get unit
            // summation --> where only 1 painter is present in that case all units are added and allocated to painter1
      int low = Arrays.stream(arr).max().getAsInt();
      int high = Arrays.stream(arr).sum();
      
      while(low <= high)
      {
          int mid = (low + high) /2;
          int painter = countPainters(arr,mid);
          
          //Count of painter exceed given painter find min among them  
          if(painter > k)
          {
              // trim search space to find min (max units painted by painters)
              low = mid +1;
          }
          //Count of painter smaller than given painter Trim search space to find equal count of painters & given painter
          else
            {
                high = mid -1;
            }
      }
      return low;
    }
}
