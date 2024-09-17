package org.example;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

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

        Animal animal = new Animal("Cat", LocalDate.of(2020,9,17));

        LocalDate birthdayDate = animal.getBirthday().withYear(currentDate.getYear());
        if(birthdayDate.isBefore(currentDate)) {
            birthdayDate = birthdayDate.plusYears(1);
        }

        long daysLeft = ChronoUnit.DAYS.between(currentDate, birthdayDate);

        System.out.println("birthday = " + birthdayDate);
        System.out.println("daysLeft = " + daysLeft);

    }
}


