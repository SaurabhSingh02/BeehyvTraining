/*
Given a string as input, write a program to convert the characters of given string into hexadecimal equivalent of ASCII values.
	Examples :

	Input : Geek
	Output : 4765656b 

	Input :  IronMan part 3
	Output : 49726f6e4d616e20706172742033 
*/

package com.company;

import java.util.Scanner;

public class Que1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s=input.nextLine();
        String hex = "";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int in = (int) ch;
            String part = Integer.toHexString(in);
            hex += part;
        }
        System.out.println(hex);
    }
}
