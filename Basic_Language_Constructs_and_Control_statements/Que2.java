/*Write an application that inputs one number consisting of five digits from the user,
separates the number into its individual digits and prints the digits separated from one
another by three spaces each. For example, if the user types in the number 42339 , the program should print
 4  2  3  3  9
Assume that the user enters the correct number of digits. What happens when you execute the
program and type a number with more than five digits? What happens when you execute the pro-
gram and type a number with fewer than five digits?
 */

package com.company;
import java.util.Scanner;
public class Que2 {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a five digit number");
        int a = input.nextInt();

        int[] b=new int[5] ;

        for (int i=4;i>=0;i--)
        {
            b[i]=a%10;
            a=a/10;
        }
        for (int i=0;i<5;i++)
        {
            System.out.print(b[i]+"   ");
        }
    }
}
