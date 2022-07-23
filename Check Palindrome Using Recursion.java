/*

Check Palindrome
Difficulty: EASY

|
Level 1
Problem Statement
Given an alphabetical string ‘S’. Determine whether it is palindrome or not. A palindrome is a string that is equal to itself upon reversing it.
For Example:
‘S’ = racecar
The reverse of ‘S’ is: racecar
Since ‘S’ is equal to its reverse. So ‘S’ is a palindrome.
Hence output will be 1.
Input Format:
The first line of the input contains a single integer ‘T’ representing the no. of test cases.

The first line of each test case contains a single alphabetical string, ‘S’.
Output Format:
For each test case, print a single integer value 1 if the given string ‘S’ is palindrome and 0 otherwise.

Print a separate line for each test case.
Note
You are not required to print anything; it has already been taken care of. Just implement the function and return the answer.
Constraints -
1 ≤ T ≤ 1000
1 ≤ |S| ≤ 10^5
S consists of only lowercase english alphabets.
Σ|S| ≤ 2 * 10^6

Time limit: 1 Sec
Sample Input 1 :
2
racecar
niinja
Sample Output 1 :
1
0
Explanation For Sample Input 1 :
For First Case - Same as explained in above example.

For the second case -

‘S’ = niinja
Reverse of ‘S’ is: ajniin
Since ‘S’ is not equal to its reverse. So ‘S’ is not a palindrome.
Hence output will be 0.
Sample Input 2 :
2
level
panama
Sample Output 2 :
1
0

*/





public class Solution {
    
    public static Boolean isPalindrome(String s, int i, int j)
    {
        if(i > j)
        {
            return true;
        }

        if(s.charAt(i) != s.charAt(j))
        {
            return false;
        }
        else
        {
            return isPalindrome(s, i+1, j-1);
        }
    }
    
    
    public static Boolean isPalindrome(String s) {
     
        return isPalindrome(s, 0, s.length()-1);
        
    }

}
