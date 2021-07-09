/*Develop a Java application that determines the gross pay for each 
of three employees. The company pays straight time for the first 40 
hours worked by each employee and time and a half for all hours worked 
in excess of 40. You’re given a list of the employees, their number 
of hours worked last week and their hourly rates. Your program should 
input this information for each employee, then determine and display 
the employee’s gross pay. Use class Scanner to input the data.*/


package com.company;
import java.util.Scanner;
public class Que4{
    public static void main(String[] args){
        int pay=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter No of hours for the employee");
        int hours = input.nextInt();
        System.out.println("Enter the rate per hour");
        int rates= input.nextInt();
        
        if(hours>40)
        {
            pay = 40*rates + (hours-40)*rates/2;
        }
        else pay = hours*rates;
        System.out.println(pay);
        System.out.println(pay);
    }
}