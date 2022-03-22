package practice;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Birthdays {

    public static void main(String[] args) {

        int day = 31;
        int month = 12;
        int year = 1990;

        System.out.println(collectBirthdays(year, month, day));

    }

    public static String collectBirthdays(int year, int month, int day) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy - E", Locale.ENGLISH);
        LocalDate today = LocalDate.now();
        LocalDate birthday = LocalDate.of(year, month, day);
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (birthday.isBefore(today) || birthday.equals(today)) {
            String text = i + " - " + birthday.format(formatter);
            sb.append(text + "\n");
            i++;
            birthday = birthday.plusYears(1);
        }
        return sb.toString();
    }
}
