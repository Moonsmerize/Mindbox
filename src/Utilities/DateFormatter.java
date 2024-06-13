package Utilities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

        public static String Format(Date date) {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MMM/dd");
                return dateFormat.format(date).toUpperCase();
        }

}
