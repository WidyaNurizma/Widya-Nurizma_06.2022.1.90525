package utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConvert {

    public static Date toDate(String dateStr) {
        try {
            Date date = new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);
            return date;
        } catch (ParseException e) {
        }
        return null;
    }

}
