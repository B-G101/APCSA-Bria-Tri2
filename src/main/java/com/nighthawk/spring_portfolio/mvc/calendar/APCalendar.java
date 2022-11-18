package com.nighthawk.spring_portfolio.mvc.calendar;

// Prototype Implementation

public class APCalendar {

    /** Returns true if year is a leap year and false otherwise.
     * isLeapYear(2019) returns False
     * isLeapYear(2016) returns True
     */          
    public static boolean isLeapYear(int year) {
        // check first if the number is divisible by 4 since leap yeas occur every 4 years. if it is not divisible by 4 then we know it isn't a leap year
        if (year%4 == 0) {
            // then check if the number is also divisible by 100 which would include numbers like 2000, 1900, etc some of which are and are not leap years
            if (year%100 == 0) {
                // to make sure the right centural years are counted we must only include the numbers that are divisible by 400, otherwise it is not a leap year
                if (year%400 == 0) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return true;
            }
        }
        else {
            return false;   
        }

        }
        
    /** Returns the value representing the day of the week 
     * 0 denotes Sunday, 
     * 1 denotes Monday, ..., 
     * 6 denotes Saturday. 
     * firstDayOfYear(2019) returns 2 for Tuesday.
    */
    private static int firstDayOfYear(int year) {
        // implementation not shown
        return 0;
        }


    /** Returns n, where month, day, and year specify the nth day of the year.
     * This method accounts for whether year is a leap year. 
     * dayOfYear(1, 1, 2019) return 1
     * dayOfYear(3, 1, 2017) returns 60, since 2017 is not a leap year
     * dayOfYear(3, 1, 2016) returns 61, since 2016 is a leap year. 
    */ 
    private static int dayOfYear(int month, int day, int year) {
        // implementation not shown

        return 1;
        }

    /** Returns the number of leap years between year1 and year2, inclusive.
     * Precondition: 0 <= year1 <= year2
    */ 
    public static int numberOfLeapYears(int year1, int year2) {
         // to be implemented in part (a)

         int numLeapYears = 0;  //intializes the variable numLeapYears starting at 0
         for (int i = year1; i <= year2; i++) { //incriments the value by 1
            if (isLeapYear(i)) { 
                 numLeapYears ++;  //checking how many leap years happen between the two years 
             }
         }
         return numLeapYears; //ends the function
        }

    /** Returns the value representing the day of the week for the given date
     * Precondition: The date represented by month, day, year is a valid date.
    */
    public static int dayOfWeek(int month, int day, int year) { 
        // to be implemented in part (b)
        int firstDay = firstDayOfYear(year);  //initializes the firstDay as the firstDayOfYear
        int theDate = dayOfYear(month, day, year); //finds the day of the year
        int theDay = (firstDay + theDate - 1) % 7; //calculates the day of the year from the first day
        return theDay; //ends the function
        }

    /** Tester method */
    public static void main(String[] args) {
        // Private access modifiers
        System.out.println("firstDayOfYear: " + APCalendar.firstDayOfYear(2022));
        System.out.println("dayOfYear: " + APCalendar.dayOfYear(1, 1, 2022));

        // Public access modifiers
        System.out.println("isLeapYear: " + APCalendar.isLeapYear(2022));
        System.out.println("numberOfLeapYears: " + APCalendar.numberOfLeapYears(2000, 2022));
        System.out.println("dayOfWeek: " + APCalendar.dayOfWeek(1, 1, 2022));
    }

}