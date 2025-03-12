/*
Square Root

Difficulty: EasyAccuracy: 54.03%Submissions: 308K+Points: 2Average Time: 20m

Given a positive integer n, find the square root of n. If n is not a perfect square, then return the floor value.
Floor value of any number is the greatest Integer which is less than or equal to that number

problem link :https://www.geeksforgeeks.org/problems/square-root/1?page=1&category=Mathematical,Numbers,pattern-printing&difficulty=Basic,Easy,Medium&sortBy=submissions
*/

class Solution 
{
    int floorSqrt(int n) 
    {
        
        if(n<0)
        {
            return n;
            //System.out.println("Square root is  not definedd for negative numbers");
        }
        
            return (int)Math.sqrt(n);
           /*
           Alternate Way:
           
           int sqrt=0;
          for(int i=1 ; i*i<=n ; i++)
          {
              if(i*i==n) // perfect square 
              {
                  return i;
              }
              sqrt=i;
          } 
          return sqrt; // floor sqrt*/
    }
}
/*Note:
        ** Ive used Inbuilt Method of Math.Sqrt() to get sq root and floor value
        ** Math.Sqrt() will return double value regardless so explicitly casting to int type
        ** function will return perfect square if not present then it return floor value (closest square for that no)
        ** Cover Edge case as Math.sqrt() wont handle negative number
        */
