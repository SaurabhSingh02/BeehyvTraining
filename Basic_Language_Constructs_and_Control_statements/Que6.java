/*A palindrome is a sequence of characters that reads the same backward as forward.
For example, each of the following five-digit integers is a palindrome: 12321, 55555,
45554 and 11611. Write an application that reads in a five-digit integer and determines
whether it’s a palindrome. If the number is not five digits long, display an error message
and allow the user to enter a new value.
 */

package com.company;
import java.util.Scanner;
public class Que6 {
    public static void main(String[] args){
        int flag=1;
        while(flag!=0)
        {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter a 5 digit number");
            int a=input.nextInt();
            if(a/100000==0 && a/10000!=0)
            {
                flag=0;
                int[] b=new int[5];
                for(int i=0;i<5;i++)
                {
                    b[i]=a%10;
                    a=a/10;
                }
                if (b[0]==b[4] && b[1]==b[3])
                    System.out.println("It is a palindrome");
                else
                    System.out.println("It is not a palindrome");
            }
            else
                System.out.println("Wrong Input Enter Again");

        }

    }
}
