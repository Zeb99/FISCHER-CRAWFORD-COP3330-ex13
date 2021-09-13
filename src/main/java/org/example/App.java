package org.example;
import java.util.Scanner;
import java.io.*;

/**
 * Determining Compound Interest
 * UCF cop3330 Fall 2021 Assignment 13 Solution
 * Copyright 2021 Zeb Fischer-Crawford
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the principal: ");
        float principal = scan.nextInt();
        System.out.print("Enter the rate of interest: ");
        float rate = scan.nextFloat();
        System.out.print("Enter the number of years: ");
        float years = scan.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        float years_compounded = scan.nextInt();

        float total_accrued = (float)(principal * Math.pow((1 + (rate/100)/years), (years * years_compounded)));
        System.out.println("$" + principal + " invested at " + rate + "% for " + years + " years compounded " + years_compounded + " times per year is $" + total_accrued);
    }
}
