/*
Perfect Numbers

Difficulty: Easy Accuracy: 17.21% Submissions: 196K+ Points: 2

Given a number n, check if a number is perfect or not. 
A number is said to be perfect if sum of all its factors excluding the number itself is equal to the number.

Problem Link :https://www.geeksforgeeks.org/problems/perfect-numbers3207/1?page=1&category=Mathematical,Numbers,pattern-printing&difficulty=Basic,Easy,Medium&sortBy=submissions

*/

class Solution {
    static boolean isPerfectNumber(int n) {
        // code here
        
        if(n<=1)
        {
         return false;
        }   
        int sum=1;
        for(int i=2 ; i<=Math.sqrt(n) ; i++)
        {
            if(n%i==0)
            {
                sum+=i;
                int pairDivisor = n / i;  // Find the pair divisor
                if (pairDivisor != i) 
                { 
                    // Avoid adding the square root twice
                    sum += pairDivisor;  //
                }
            }
        }
        return sum==n;
    }
}
/*Note:

    ** Edge case : when n is < 1 (i.e negative nos) return alse
    ** initialize sum to 1 since 1 is always a divisior
    ** run loop from 2 through sqrt(n) cause Using Math.sqrt(n) reduces the number of iterations we need to check for divisors. 
    Instead of checking all numbers from 1 to n/2, we can check only up to sqrt(n) and add both i and n / i as divisors.
    
    
    ** For every divisor i of n, there is a corresponding pair divisor n / i.
    ** We only iterate up to sqrt(n), as the divisors beyond sqrt(n) are just the pair divisors of those found before it.
    **Avoid counting i twice if i and n / i are the same (when n is a perfect square). 



 Alternate method:
        Time Limit Exceeded
        int sum=0;
        for (int i=1;i<=n/2;i++)
        {
            if(n%i==0)
            {
                sum=sum+i;
            }
        }
        return sum==n;
        
    ** To Get divisors of n run loop through n/2 as after certain no the multiples/factors repeat 
    but they tend to provide only first half of the divisor (inefficient)
    ** check if i % n completely we consider it factor i then Add it and store in sum
    ** when given no == Sum then it is perfect Number
    ** Floor division is a mathematical operation that divides two numbers 
    and rounds the result down to the nearest integer
    
    ** Edge case are so Importatnt Focus on Handling in case of serious problem solving
*/
