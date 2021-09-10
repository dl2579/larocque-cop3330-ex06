package org.example;
import java.util.Scanner;
import java.util.Calendar;


/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Damian LaRocque
 */

public class App 
{
    public static void main( String[] args )
    {
        Scanner sc = new Scanner(System.in);
        System.out.print( "What is your current age? " );
        int age = Integer.parseInt(sc.nextLine());

        System.out.print( "At what age would you like to retire? " );
        int retAge = Integer.parseInt(sc.nextLine());

        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);

        int yrsLeft = retAge-age;

        System.out.printf("You have %d years left until you can retire.%n", yrsLeft);
        System.out.printf("It's %d, so you can retire in %d.", year, year+yrsLeft);


    }
}
