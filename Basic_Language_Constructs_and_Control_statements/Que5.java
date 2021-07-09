/*Write an application that prompts the user to enter the size of the side of a square,
then displays a hollow square of that size made of asterisks. Your program should work
for squares of all side lengths between 1 and 20
 */
package com.company;
import java.util.Scanner;
public class Que5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int side=input.nextInt();
        for (int i=0;i<side;i++)
        {
            for(int j=0;j<side;j++)
            {
                if (i==0)
                {
                    System.out.print("*");
                    continue;
                }
                if (i==side-1)
                {
                    System.out.print("*");
                    continue;
                }
                if (j==0) System.out.print("*");
                if (j==side-2) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
}
