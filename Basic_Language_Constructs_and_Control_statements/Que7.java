/*A right triangle can have sides whose lengths are all integers.
The set of three integer values for the lengths of the sides of a
right triangle is called a Pythagorean triple. The lengths of the
three sides must satisfy the relationship that the sum of the squares
of two of the sides is equal to the square of the hypotenuse. Write
an application that displays a table of the Pythagorean triples for
side1 , side2 and the hypotenuse , all no larger than 500.
 */

package com.company;
class Que7 {
    public static void main(String args[])
    {
        int limit = 500;
        int a, b, c = 0;
        int m = 2;

        while (c < limit) {
            for (int n = 1; n < m; ++n) {
                a = m * m - n * n;
                b = 2 * m * n;
                c = m * m + n * n;
                if (c > limit)
                    break;
                System.out.println(a + " " + b + " " + c);
            }
            m++;
        }
    }
}
 