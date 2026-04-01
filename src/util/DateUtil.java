/*
 *
 */

package util;

/**
 *
 * @author  Martin Pröhl alias MythGraphics
 * @version 3.0.0
 *
 */

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {

    private DateUtil() {}

    public static java.sql.Date getSQLDate(Date date) {
        return new java.sql.Date( date.getTime() );
    }

    public static Date getDate(Calendar cal) {
        return cal.getTime();
    }

    public static LocalDate getLocalDate(Date date) {
        return LocalDate.ofInstant( date.toInstant(), ZoneId.systemDefault() );
    }

    public static LocalDate getLocalDate(Calendar cal) {
        return LocalDate.ofInstant( cal.toInstant(), ZoneId.systemDefault() );
    }

}
