package Day44;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class _02_DateAndTime {

    public static void main(String[] args) {

        // LocalDate
        LocalDate currentDate = LocalDate.now(ZoneId.of("Australia/Sydney"));
        System.out.println("Current Date in Sydney: " + currentDate);


        // LocalTime
        LocalTime currentTime = LocalTime.now(ZoneId.of("Australia/Sydney"));
        System.out.println("Current Time in Sydney: " + currentTime);


        // LocalDateTime
        LocalDateTime currentDateAndTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateAndTime);

        DateTimeFormatter newFormat = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateAndTime = currentDateAndTime.format(newFormat);

        System.out.println(formattedDateAndTime);

    }

}
