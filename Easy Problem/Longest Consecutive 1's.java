/*
Longest Consecutive 1's
Difficulty: EasyAccuracy: 69.74%Submissions: 69K+Points: 2
Given a number N. Find the length of the longest consecutive 1s in its binary representation.
Problem Link : https://www.geeksforgeeks.org/problems/longest-consecutive-1s-1587115620/1
*/
class Solution{
    
    /*  Function to calculate the longest consecutive ones
    *   N: given input to calculate the longest consecutive ones
    */
    public static int maxConsecutiveOnes(int N) {
       
       
       //converting number to binary digits 0's & 1's using toBinaryString() inbuilt function
       
            String result = Integer.toBinaryString(N);
      //  A binary string is a sequence of characters that represents a number using only the digits 0 and 1. It is the base-2 representation of a number.
      
      
        // keep track of consecutive numbers as arr may broke consectivness in middle & intialize count=0;
        int count = 0;
        
        // keep track of max value so far after break in consecutiviness
        int max=0;
        
        //iterate thru the binary digits of the given number
        for(int i=0;i<result.length();i++)
        {
            //as we iterate count the no of 1s in the given no binary equivalent use ''as 1 is considered as char than int 
            if(result.charAt(i)=='1')
            {
                //keep track of the count of 1s in the number
                count++;
                max=Math.max(count,max); // update the max to the value of maximum no of consecutive 1s reached in number as count increases
            }
            else
            {
                // if consecutiveness break then bring value of count to 0
                count=0;
            
            }
            
            
        }
        return max;
    }
}
