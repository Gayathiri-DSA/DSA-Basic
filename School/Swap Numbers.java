/*
Swap The Numbers
Difficulty: School Accuracy: 66.55% Submissions: 40K+ Points: 0
Given two numbers a and b, you need to swap their values so a holds the value of b and b holds the value of a. Just write the code to swap values of a and b at the specified place.
Problem Link : https://www.geeksforgeeks.org/problems/swap-the-numbers/0*/

class Solution {
    public void swap(int a, int b) {
        // code here

        a=a+b; // add a & b store it in a
        b=a-b; // sub b from a and store it in b
        a=a-b; // sub the current val b (i.e a) from a and that leaves us with original a val
        
        System.out.println(a + " " + b);
    }
}
/*alternate method:

USing 3 rd var ==temp
    temp = a; -- store  var a value in temp
    a=b; -- store variable b val in a
    b=temp; -- store a(temp) val in b thus swaped */
