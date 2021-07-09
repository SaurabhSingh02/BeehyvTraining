/*Factorials are used frequently in probability problems. The factorial of a
positive integer n (written n! and pronounced “n factorial”) is equal to the
product of the positive integers from 1 to n. Write an application that calculates
the factorials of 1 through 20. Use type long . Display the results in tabular format.
What difficulty might prevent you from calculating the factorial of 100?
 */

package com.company;

public class Que8
{
    public static void main(String args[])
    {
        int limit=21;
        int c=1;
        while (c < limit) {
            long fact=1;
            for(int i=0;i<c;i++)
                fact=fact*(i+1);
            c++;
            System.out.println(fact);
        }
    }
}
