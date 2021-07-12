/*
Longest Common Substring in an Array of Strings
We are given a list of words sharing a common stem i.e the words originate from same word for ex: the words sadness, sadly and sad all originate from the stem ‘sad’.
Our task is to find and return the Longest Common Substring also known as stem of those words. In case there are ties, we choose the smallest one in alphabetical order.

Examples:

	Input : grace graceful disgraceful gracefully
	Output : grace

	Input : sadness sad sadly
	Output : sad
*/

package com.company;

import java.util.*;

public class Que3 {
    public static void main(String[] args){

        String a[] = { "grace", "graceful",
                "disgraceful","gracefully" };
        int n = a.length;

        String s = a[0];
        int len = s.length();

        String output = "";

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String temp = s.substring(i, j);
                int k = 1;
                for (k = 1; k < n; k++)
                    if (!a[k].contains(temp))
                        break;
                if (k == n && output.length() < temp.length())
                    output = temp;
            }
        }
        System.out.println(output);
    }
}
