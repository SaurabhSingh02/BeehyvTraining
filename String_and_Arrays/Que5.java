/*
Write a Java program to print the following grid. Go to the editor

Expected Output :

	        - -                                                                                            
	      - - - -                                                                                            
	    - - - - - -                                                                                          
	  - - - - - - - -                                                                                           
	- - - - - - - - - -                                                                                           
	  - - - - - - - -                                                                                            
	    - - - - - -                                                                                            
	      - - - -                                                                                            
	        - -                                                                                            
*/
package com.company;

public class Que5 {
    public static void main(String[] args){
        for (int i=1;i<=5;i++)
        {
            for (int j=0;j<10;j++)
            {
                if(j%2==0)
                {
                    if(j>=(10-2*i)) System.out.print("-");
                    else System.out.print(" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int j=0;j<10;j++)
            {
                if(j%2==0)
                {
                    if(j<2*i) System.out.print("-");
                    else System.out.print(" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
        for (int i=1;i<5;i++)
        {
            for (int j=0;j<10;j++)
            {
                if(j%2==0)
                {
                    if(j>=2*i) System.out.print("-");
                    else System.out.print(" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            for (int j=0;j<10;j++)
            {
                if(j%2==0)
                {
                    if(j<(10-2*i)) System.out.print("-");
                    else System.out.print(" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }
    }
}
	             