/*
Ludic numbers are obtained by considering list of natural numbers (starting from 2) and 
removing i-th number in i-th iteration (where i begins with 2). In every iteration, the 
first removed number is Ludic. 1 is considered as Ludic.

			Process of generating Ludic numbers :

			Ludic = {1, …}

			Consider natural numbers from 2,
			2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21 …

			Delete every 2nd number
			3, 5, 7, 9, 11, 13, 15, 17, 19, 21 ..
			The first deleted number is 2.
			Ludic = {1, 2, …}

			Delete every 3rd number.
			5, 7, 11, 13, 17, 19, 22 ..
			The first deleted number is 3
			Ludic = {1, 2, 3, …}

			Delete every 4th number.
			5, 7, 11, 13, 17, 19, 22 ..
			The first deleted number is 5
			Ludic = {1, 2, 3, 5, ..}

			This process continues..

	Given a number n, print all Ludic numbers smaller than or equal to n.

	Examples :

	Input : n = 10
	Output : 1, 2, 3, 5, 7

	Input : n = 25
	Output : 1, 2, 3, 5, 7, 11, 13, 17, 23, 25 

*/

package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Que6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        List<Integer> ludics = new ArrayList<Integer>(n);
        for (int i = 1; i <= n; i++)
            ludics.add(i);
        for (int index = 1; index < ludics.size(); index++) {
            int first_ludic = ludics.get(index);
            int remove_index = index + first_ludic;
            while (remove_index < ludics.size()) {
                ludics.remove(remove_index);
                remove_index = remove_index + first_ludic - 1;
            }
        }
        System.out.println(ludics);
    }
}
