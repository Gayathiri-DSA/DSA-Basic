/*
Ceil The Floor
Difficulty: Easy Accuracy: 43.76% Submissions: 173K+ Points: 2
Given an unsorted array arr[] of integers and an integer x, find the floor and ceiling of x in arr[].
Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x is smaller than smallest element of arr[].
Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x is greater than greatest element of arr[].
Return an array of integers denoting the [floor, ceil]. Return -1 for floor or ceiling if the floor or ceiling is not present.
Problem Link : https://www.geeksforgeeks.org/problems/ceil-the-floor2802/1?utm_source=youtube&utm_medium=collab_striver_ytdescription&utm_campaign=ceil-the-floor
*/

class Solution {
    public int[] getFloorAndCeil(int x, int[] arr) {
        
        // floor -- largest element <=x
        //sorting the array is important for efficient processing test cases
        Arrays.sort(arr);
        
        int low = 0, high = arr.length - 1;
        int floor = -1, ceil = -1;
        
         while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            
            //largest element in arr[] that is LESS THAN OR EQUAL TO X.
            if(arr[mid] <= x)
            {
                floor = arr[mid];
                 // trim the left search space as we're looking for largest ele by moving low right after mid
                low = mid +1;
            }
            else
            {
                //if we move beyond <= x then move high before mid to get the largest element
            
                high = mid-1;
            }
        }
        // ceil smallest element > x -- upper bound
        
        
        // Reset low and high for Ceil search
        low = 0;
        high = arr.length - 1;
        
        while(low <=high)
        {
            int mid = low + (high - low) / 2;
            //smallest  element in arr[] that is Greater THAN OR EQUAL TO X.
            if(arr[mid] >= x)
            {
                // return element @ mid and move high before mid to trim the search space
                ceil = arr[mid];
                high = mid -1;
            }
            else
            {
                
                low = mid + 1;
            }
        }
        return new int[] {floor,ceil};
        
    }
}
/*Note : 
This approach doesnt consider other cases not better
int low = 0, high = arr.length - 1;
        int floor = -1, ceil = -1;

        while (low <= high) 
        {
            int mid = low + (high - low) / 2;
            
            // If exact match, floor and ceil are both x
            if (arr[mid] == x) 
            { 
                return new int[]{x, x};  
            } 
            // Floor candidate (largest element ≤ x) trim left search space move low right after mid
            else if (arr[mid] < x) 
            { 
                floor = arr[mid];  
                low = mid + 1; // Move right
            }
             // Ceil candidate (smallest element ≥ x) trim right search space move high before mid
            else 
            { 
                ceil = arr[mid];  
                high = mid - 1; // Move left
            }
        }

        return new int[]{floor, ceil};
        */
