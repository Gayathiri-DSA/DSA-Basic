/*
Koko Eating Bananas
Difficulty: Medium Accuracy: 50.27% Submissions: 20K+ Points: 4 Average Time: 20m
Given an array arr[] of integers where each element represents a pile of bananas, and Koko has k hours to finish all the piles, find the minimum number of bananas (s) Koko must eat per hour to finish all the bananas within k hours. Each hour, Koko chooses a pile and eats s bananas from it. 
If the pile has fewer than s bananas, she consumes the entire pile for that hour and won't eat any other banana during that hour.
*/
class Solution 
{
    // 1. DETERMINE RANGE 2. APPLY BS 
        
    // FIND RANGE min/low --> 1 max/high --> max ele in arr
    
    public static int findMax(int[] arr)
    {
        int maxi = Integer.MIN_VALUE;
        
        // iter thru arr and find max ele
        for(int i=0 ; i<arr.length ;i++)
        {
            // update ans to maxi
            maxi = Math.max(maxi,arr[i]);
        }
        return maxi;
    }
    //Function to calculate total hours // maxx bananas can ate per hour
    public static int totalHour(int[] arr,int hourly)
    {
        int totalH = 0;
        for(int i=0 ;i<arr.length ;i++)
        {
            totalH += Math.ceil((double)(arr[i]) / (double)(hourly));
        }
        return totalH;
    }
     // use BS to find minimum hours taken to meet deadline k   
    public static int kokoEat(int[] arr, int k) 
    {
        int low = 1, high = findMax(arr);

        //apply binary search:
        while (low <= high) {
            int mid = (low + high) / 2;
            int totalH = totalHour(arr, mid);
            if (totalH <= k) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
        
    }
}
