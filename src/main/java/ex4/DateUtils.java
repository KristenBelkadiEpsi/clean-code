package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class DateUtils {

    private static final String DEFAULT_DATE_FORMAT = "dd/MM/yyyy HH:mm:ss";

    private DateUtils() {
    }

    public static String formatDate(String pattern, Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        return formatter.format(date);
    }

    public static String formatDateDefault(Date date) {
        return formatDate(DEFAULT_DATE_FORMAT, date);
    }
}
