/*
Swap corner words and reverse middle characters
	Write a Java program to take an input string and exchange the first and last word and revers the middle word.

	Examples:

	Input : Hello World GFG Welcomes You
	Output :You semocleW GFG dlroW Hello

*/

package com.company;

import java.util.Scanner;
import java.lang.String;

public class Que2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String s=input.nextLine();
        String output = "";
        String end = "";
        String start = "";
        String middle= "";
        int i=0;
        int n=s.length();
        while(s.charAt(i)!= ' ')
        {
            end=end + s.charAt(i);
            i++;
        }

        int j=n-1;
        while(s.charAt(j)!= ' ')
        {
            start=s.charAt(j)+start;
            j--;
        }
        System.out.print(start);
        for (int m=j; m>=i;m--)
        {
            System.out.print(s.charAt(m));
        }
        System.out.print(end);

    }
}
