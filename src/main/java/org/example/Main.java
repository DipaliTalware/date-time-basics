package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

//Step 1: Write code to output the current date and time.
//Step 2: Add a timespan of 2 weeks to the current date and output the new date.
//Step 3: Compare the current date with a specified future date and output whether the current date is before or after the specified date.
//Step 4: Calculate the difference in days between two arbitrary dates and output the result.
public class Main {
    public static void main(String[] args) {
        LocalDateTime timeRightNow = LocalDateTime.now();
        System.out.println("Time right now : "+ timeRightNow);

        LocalDateTime addTimeSpan = timeRightNow.plusWeeks(2);
        System.out.println("2 weeks time span added: "+ addTimeSpan);

        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = LocalDate.of(2025, 1,1);

        if(currentDate.isBefore(futureDate)) {
            System.out.println("Current date is before future date");
        }
        else{
            System.out.println("Current date is after future date");
        }

        long differenceInDays = ChronoUnit.DAYS.between(currentDate, futureDate);
        System.out.println(differenceInDays);

    }
}


