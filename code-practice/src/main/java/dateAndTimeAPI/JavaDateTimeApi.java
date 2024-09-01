package dateAndTimeAPI;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class JavaDateTimeApi {

    public static void main(String[] args) {
        String localTime = LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL));
        System.out.println("Local Time: " + localTime);

        LocalDate today = LocalDate.now();

        LocalDate customDate = LocalDate.of(2023, 11, 10);

        LocalDate yesterday = today.minusDays(1);

        int year = today.getYear();
        int month = today.getMonthValue();

        Month month1 = today.getMonth();
        int day = today.getDayOfMonth();
        Month[] values = Month.values();

        Month month2 = Month.of(5);


    }
}
