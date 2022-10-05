import javax.swing.text.DateFormatter;
import java.text.DateFormat;
import java.time.*;
import java.time.format.*;

public class DateAndTime {
    public static void main(String[] args) {
        // LocalDate class
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println("Today's Date : " + date);
        System.out.println("Yesterday's Date : " + yesterday);
        System.out.println("Tomorrow's Date : " + tomorrow);
        // Local DateTime class
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Today's Date and Time : " + dateTime);
        // DateTimeFormatter
        String dateTimeFormatted = dateTime.format(DateTimeFormatter.ISO_DATE);
        System.out.println("formatted dateTime : " + dateTimeFormatted);
        // Date Formatting
        LocalDateTime date1 = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formatDate = date1.format(format);
        DateTimeFormatter formatTime = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formatTime1 = date1.format(formatTime);
        System.out.println("formatted Date : " + formatDate);
        System.out.println("formatted Time : " + formatTime1);

    }
}
