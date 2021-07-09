/*
Write a program that inputs five numbers and determines and prints the number
of negative numbers input, the number of positive numbers input and the number
of zeros input.
 */
import java.util.Scanner;

package com.company;
public class Que3 {
    public static void main(String[] args){
        int[] a=new int[5];
        Scanner input = new Scanner(System.in);
        int Cp=0,Cn=0,Co=0;
        for(int i=0;i<5;i++)
        {
            a[i]=input.nextInt();
            if(a[i]==0) Co++;
            if(a[i]>0) Cp++;
            if(a[i]<0) Cn++;
        }

        System.out.println("No of Positive Numbers " +Cp+" No of Negative Numbers " +Cn+ " No of Zeroes " + Co);

    }
}
