// ************************************************************
// Dates.java
//
// Determine whether a 2nd-millenium date entered by the user
// is valid
// ************************************************************
import java.util.Scanner;

public class Dates {
    public static void main(String[] args) {
        int month;
        int day;
        int year; // date read in from user
        int daysInMonth =0 ; // number of days in month read in
        boolean monthValid;
        boolean yearValid;
        boolean dayValid; // true if input from user is
                          // valid

        boolean leapYear; // true if user's year is a leap year

        Scanner scan = new Scanner(System.in);
        // Get integer month, day, and year from user
        System.out.println("Enter a month value (0-12):");
        month = scan.nextInt();

        System.out.println("Enter a day value (0-31):");
        day = scan.nextInt();

        System.out.println("Enter a year value (1000-1999):");
        year = scan.nextInt();

        // Check to see if month is valid
        if ((month >= 1) && (month <= 12)) {
            monthValid = true;
        }

        else {
            monthValid = false;
        }

        // Check to see if year is valid

        if ((year >= 1000) && (year <= 1999)) {
            yearValid = true;
        }

        else {
            yearValid = false;
        }

        // Determine whether it's a leap year
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            leapYear = true;
        }

        else {
            leapYear = false;
        }

        // Determine number of days in month

        if (month == 8 || month == 6 || month == 9 || month == 11) {
            daysInMonth = 30;
        }

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8
                || month == 10 || month == 12) {
            daysInMonth = 31;
        }        

        if (month == 2) {
            if (leapYear = true) {
                daysInMonth = 29;
            }

            else {
                daysInMonth = 28;
            }
                      
        }
        
        if (month > 12 || month < 0) {
            daysInMonth = 0;
        
        }
        // User number of days in month to check to see if day is valid

        if ((day > 0) && (day <= daysInMonth)) {
            dayValid = true;
        } else {
            dayValid = false;
        }

        // Determine whether date is valid and print appropriate message
        
        System.out.println(daysInMonth);
        if ((dayValid == true) && (monthValid == true) && (yearValid == true)) {
            System.out.println("Your date is valid!");
            System.out.println("Is it a leap year?: " + leapYear);
        } else {
            System.out.println("Your date is invalid.");
        }
    }
}