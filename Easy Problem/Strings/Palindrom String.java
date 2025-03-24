/*
Palindrome String
Difficulty: Easy Accuracy: 51.21% Submissions: 386K+ Points: 2
You are given a string s. Your task is to determine if the string is a palindrome. A string is considered a palindrome if it reads the same forwards and backwards.
Problem Link :https://www.geeksforgeeks.org/problems/palindrome-string0817/0*/
class Solution {
    boolean isPalindrome(String s) 
    {
        // string is converted into char arr
         char[] arr= s.toCharArray();
         
         // using length var to get the number of char 
        int len = arr.length;
        
        //intialize first element @ 0 & last ele @ total length -1
        int left =0;
        int right = len-1;
        
        // edge case : total len ==1 then return true 
        if(len==1) return true;
        
        // when left (i.e 0) < right (n-1)
        while(left<right)
        {
            // chk arr left != right then it is not palindrome else move pointer first ele ptr next ; last ele ptr to prev then if = ,it is palindrom
            if(arr[left]!=arr[right])
            {
                return false;
            }
            else
            {
                left++;
                right--;
            }
        }
        return true;
        }
    }

/*
note:
    ** Instead of checking every character, we stop at len / 2, making the algorithm run twice as fast (O(n/2), still O(n), but saves time).
    
    ** We need str.length() - 1 - i to find the MIRRORED POSITION of i.
       This ensures we're comparing characters from both ends, rather than using (s.len -1) bcoz it only checks last element alone as we r checking first ele and hence forth with last elements and preceeds
       
        // length () function is used in string -- to get number of characters whereas length variable is used in arrays to get number from arr
        int len=s.length();
        
        //iterate thru string upto half elements i.e unique elements
        for(int i=0;i<len/2;i++)
        {
            //check if element @first  == last (n-1)
            if(s.charAt(i)==s.charAt(len-1-i)) // checking unique element with last half elements
            {
                return true;
            }
        }
        return false;
*/
