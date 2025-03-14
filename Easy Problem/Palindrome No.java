/*
Palindrome

Difficulty: Easy Accuracy: 56.28% Submissions: 98K+ Points: 2

You are given an integer n. Your task is to determine whether it is a palindrome.
A number is considered a palindrome if it reads the same backward as forward, like the string examples "MADAM" or "MOM".

problem link : https://www.geeksforgeeks.org/problems/palindrome0746/1*/


class Solution 
{
    public boolean isPalindrome(int n)
    {
      
      int temp =n;
      int rev = 0;
      
      //entire number is reversed
       while(temp > 0)
       {
           rev=rev * 10 + temp % 10;// extract & add ld to rev and shift left == ld ->last digit
           temp/=10;// remove ld and carry on with rest of digits
       }
       //the reversed no is compared here
       if(rev==n)
       {
           return true;
       }
       else
       {
           return false;
       }
        
    }
}

/*
Note:


/*if (n < 0) 
        {
            return false;
        }
        
        int rev = 0; // initialize reverse var with 0
        
        // Reverse the second half of the number
        while (n > rev) 
        {
            rev = rev * 10 + n % 10; // Add the last digit of n to rev
            n = n / 10; // Remove the last digit from n
        }

        // For even-length numbers, n will be equal to rev
        // For odd-length numbers, n will be equal to rev / 10 after removing the middle digit
        return n == rev || n == rev / 10;
        
        ** why  not n>0 == Keeps processing as long as there are digits to process in n. takes time for longer nos
        ** why n > rev ==  until we have reversed enough digits to compare both halves
        ** why rev * 10== shift one place left 
        
        eg:  iter 1: 123 == extract las digit (n%10)=3 + rev (0) *10 =3. 
                                            remove last digit n/10 = 12
            iter 2 : 12= extract 2 + rev (3) +10 = 32
                                        remove last digit n/10 =1
            iter 3 : 1 = extract 1 + rev (32) * 20 = 321 
        ** when n > rev = false ; then it start compare in return n==rev 
        ** what if palindrome is of odd length to not mind ( leave )odd digit rev / 10 is done; 
         
            
*/
