package org.example.climbingStairs;

public class main {

    public int climbing(int n){
        if (n==1) return 1;
        if (n==2) return 2;

        int[] a = new int[n];
        a[0] =1;
        a[1]=2;
        for (int i = 2; i < n ; i++) {
            a[i] = a[i-1] + a[i-2];
        }
        return a[n-1];
    }
    /*
    Simba has a number of staircases in his house, and he likes to climb each staircase 1 or 2 steps at a time.
It takes n steps to reach the top. In how many distinct ways can he climb to the top?

Example 1:
Input: n = 2 Output: 2
Explanation: There are two ways to climb to the top.
1. 1 step + 1 step
2. 2 steps
Example 2:

Input: n = 3 Output: 3
Explanation: There are three ways to climb to the top.
1. 1 step + 1 step + 1 step
2. 1 step + 2 steps
3. 2 steps + 1 step

Constraints:
• 1 <= n <= 45
Follow-up: What if he climbs each staircase 1, 2 or 3 steps at a time?
Please, try to test your solution via JUnit and also test your solution here:
https://leetcode.com/problems/climbing-stairs/
Hint: Think about Fibonacci numbers. How would you find the n’th number in Fibonacci series?
     */
}
