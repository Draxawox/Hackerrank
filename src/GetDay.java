import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetDay {
    public static String findDay(int month, int day, int year) {
        Calendar c = Calendar.getInstance();
        String d = "";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String date = day + "/" + month + "/" + year;
        Date date1 = null;
        try {
            date1 = format.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        c.setTime(date1);
        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        switch (dayOfWeek) {
            case 1 -> d = "SUNDAY";
            case 2 -> d = "MONDAY";
            case 3 -> d = "TUESDAY";
            case 4 -> d = "WEDNESDAY";
            case 5 -> d = "THURSDAY";
            case 6 -> d = "FRIDAY";
            case 7 -> d = "SATURDAY";
        }
        return d;
    }
}
