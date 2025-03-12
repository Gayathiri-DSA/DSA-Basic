/*
Remove a Character from a Given Position

Difficulty: EasyAccuracy: 71.66%Submissions: 60+Points: 2Average Time: 10m

Given a string and a position (0 based), remove a character from the given position. 

problem link: https://www.geeksforgeeks.org/problems/remove-a-character-from-a-given-position/1?page=1&sortBy=latest

*/
class Solution 
{
    public String removeCharacter(String s, int pos)
    {
        // code here
        if(pos <0 || pos > s.length())
         return s;
         
        StringBuilder sb=new StringBuilder(s);  
            sb.deleteCharAt(pos);
            return sb.toString();
        
            
    }
}

/*Note:
        ** Edge Case : Check position < 0 or > length of str return string
        **  A StringBuilder is a mutable object can change/modify str
        ** deleteCharaAt()--function to delete char at specified index/position
        ** sb cant return str so convert sb into str ..toString() function is used
        
        
Def :
    A StringBuilder is a mutable object, whereas a String is immutable. 
    Even though both represent sequences of characters, a String cannot be changed after it is created, 
    and a StringBuilder is designed to support modifications.

    To convert a StringBuilder back to a String, you need to call the toString() method. 
    This is necessary because StringBuilder stores characters in a way that supports efficient mutation,
    while a String has a fixed representation.
*/
