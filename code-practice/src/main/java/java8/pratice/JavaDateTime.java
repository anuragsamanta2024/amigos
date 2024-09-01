package java8.pratice;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class JavaDateTime {

    public static void main(String[] args) {

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        printDayOfTheWeek();
        LocalDate localDate = convertStringToLocalDate(dateTimeFormatter);
        convertLocalDateToString(dateTimeFormatter, localDate);
    }


    private static void printDayOfTheWeek() {
        LocalDate localDate = LocalDate.of(2024, Month.FEBRUARY, 4);
        String displayName = localDate.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.getDefault());
        System.out.println(displayName);
    }

    private static LocalDate convertStringToLocalDate(DateTimeFormatter dateTimeFormatter) {
        String date = "05/11/2022";

        LocalDate localDate = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(localDate);
        return localDate;
    }

    private static void convertLocalDateToString(DateTimeFormatter dateTimeFormatter, LocalDate localDate) {

        String value = dateTimeFormatter.format(localDate);
        System.out.println(value);
    }

}
