/*
Minimum days to make M bouquets
Difficulty: Medium Accuracy: 46.85% Submissions: 16K+ Points: 4 Average Time: 30m
You have a row of flowers, where each flower blooms after a specific day. The array arr represents the blooming schedule: arr[i] is the day the flower at position i will bloom.
To create a bouquet, you need to collect k adjacent bloomed flowers. Each flower can only be used in one bouquet.
Your goal is to find the minimum number of days required to make exactly m bouquets. If it is not possible to make m bouquets with the given arrangement, return -1.
Problem Link : https://www.geeksforgeeks.org/problems/minimum-days-to-make-m-bouquets/1
*/

class Solution 
{ // Function to check if bouquets can be made if so the count is increased and count / k --> adjacent flowers present to make bouquets 
    public static boolean possible(int[] arr, int days,int m,int k)
    {
        //Initialize counter & no of bouquets to 0
        int n = arr.length;
        int cnt = 0;
        int noOfB= 0;
        
        // iterate thru array -->blooming schedule
        for(int i = 0 ; i < n ;i++)
        {
            // if ele @ arr < days incr cnt
            if(arr[i] <= days)
            {
                cnt++;
            }
            // ele > days --> reinitialize cnt to 0 and find how many bouquets can be made with count
            else
             {
                noOfB += (cnt / k); //--> dividing cnt with adjacent flower k gives the count of bouquets can be made
                cnt = 0;
              }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }
    
    
    
    //Using BS to find min days
    public static int minDaysBloom(int m, int k, int[] arr) 
    {  
        int n = arr.length;
        // To avoid overflow store vlaues in long datattype
    long value = (long)m * k; // to avoid type exception convert ans to long
    
        // Address edge case : what if size of arr < bouquets made with adjacent flower m * k --> return -1
        if(value > n)
            return -1;
            
      //Initialize range min ,max
      int mini = Integer.MAX_VALUE, maxi = Integer.MIN_VALUE;
      
      // Find maximum and minimum:
        
        for (int i = 0; i < n ; i++) 
        {
            mini = Math.min(mini, arr[i]);
            maxi = Math.max(maxi, arr[i]);
        }
        
        //Apply BS
        //Initialize low ,high to min,max
        int low = mini , high = maxi;
        while(low <= high) // Boundary check
        {
            // find mid
            int mid = (low  + high) / 2;
            if(possible (arr,mid, m ,k))
            {
                //Trim search space to find min days
                high = mid-1;
            }
            else
            {
                low =mid+1;
            }
        }
        return low;
    }
}



/*Note : 
    Rather using third variable to store answer 
    the opposite polarity where Initially low is not possible and high is possible moves to low -- possible and high impossible 
    marks low --ans since it would crossed boundary stop.*/
