/*
Pattern Printing
Difficulty: Basic Accuracy: 54.24% Submissions: 24K+ Points: 1
Given a number N. The task is to print a series of asterisk(*) from 1 till N terms with increasing order and difference being 1.
Problrm Link : https://www.geeksforgeeks.org/problems/pattern-printing1347/0
*/
class Solution{
    static void printPattern(int N){
        // code here
        StringBuilder result=new StringBuilder();
        for (int i = 1; i <= N; i++) 
        {
            result.append("*".repeat(i)); // Append i stars
            result.append(" "); // Append space after each pattern
        }

        // Print the final result
        System.out.print(result.toString().trim()); // Remove the last trailing space
    }
}

/*
note: 
    **String.repeat(i): This method repeats the string * exactly i times for each iteration of the loop.
        ** The loop runs from 1 to N, and on each iteration, it prints i stars followed by a space.
            **Using a StringBuilder avoids repeatedly invoking System.out.print(), which can be inefficient for large inputs.
    ** toString() is a method of StringBuilder that converts the content of the StringBuilder into a regular String.
        **The trim() method removes leading and trailing whitespace from the string. In our case, it removes the trailing space that was added after the last set of stars.
n=3

int sum=0;
        for(int i=1;i<=N;i++)
        {
            for(int j=1;j<=i;j++) // can also use string.repeat (i) function
             {
                System.out.print( "*" );
            }
            System.out.print( " " );
        }
        
        //System.out.println( " " );
        
    ** outer loop : i=1;i<=3
            inner loop : j=1; 1<=1
                print * then space i++ ,j++
    **outer loop : i=2;i<=3
            inner loop : j=2; 2<=2
                print * then space i++,j++
    **outer loop : i=3;i<=3
            inner loop : j=3; 3<=3
                print * then space i++,j++
    outer loop : i=4 ;i<=3 //false 
            inner loop : j=1; 4<=3 // false 
                Exit loop 
                */
