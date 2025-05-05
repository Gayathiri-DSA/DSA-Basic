/*
Row with max 1s
Difficulty: MediumAccuracy: 33.09%Submissions: 345K+Points: 4
You are given a 2D binary array arr[][] consisting of only 1s and 0s. Each row of the array is sorted in non-decreasing order. 
Your task is to find and return the index of the first row that contains the maximum number of 1s. If no such row exists, return -1.
Note:
The array follows 0-based indexing.
The number of rows and columns in the array are denoted by n and m respectively.
Problem Link :https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1
*/
class Solution
{ // Binary search to find the first occurrence of 1 in a sorted row
    public int lowerBound(int row[],int n ,int x)
    {
       
        int low = 0, high = n-1;
        int ans = n;
        
        while( low <= high)
        {
            int mid = (low +high) / 2;
            if(row[mid] >= x)
            {
                ans = mid;
                high = mid -1;
            }
            else
            {
                low = mid + 1;
            }
        }
        return ans;
    }
    //method to find the row with the maximum number of 1s
    public int rowWithMax1s(int arr[][])
    {
        int m = arr.length;
        int n = arr[0].length;
        
       int cnt_max =-1;
       int index = -1;
       for( int i= 0;i <arr.length ;i++)
       {
           int cnt_one = n - lowerBound(arr[i] , n ,1); 
           if( cnt_one > cnt_max)
           {
               //update 
               cnt_max = cnt_one;
               index = i;
           }
       }
        return index;
    } 

}
