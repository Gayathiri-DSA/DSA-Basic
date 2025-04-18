/*
Find nth root of m
Difficulty: Easy Accuracy: 25.06% Submissions: 202K+ Points: 2 Average Time: 15m
You are given 2 numbers n and m, the task is to find n√m (nth root of m). If the root is not integer then returns -1.
Problem Link https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1
*/
class Solution 
{
    // To avoid Overflow Check mid and trim search space 
    // mid == m return 1
    //mid < m return 0
    //mid > m return 2
    public int funct(int mid,int n, int m) 
    {
        long ans =1 ;
        for(int i=1; i<=n ;i++)
        {
            ans = ans * mid;
            
            if(ans > m) return 2;
        }
        if(ans == m) return 1;
         return 0;
    }
    
    //Using Binaryy search we can significantly reduce searching 
    public int nthRoot(int n, int m) 
    {
        int low =1 , high = m;
        while(low <= high)
        {
            int mid = (low + high)/2;
            int midn = funct(mid,n,m) ;
            if(midn == 1)
            {
                return mid;
            }
            else if (midn == 0)
            {
                low = mid+1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return -1;
    }
}
