/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author viewt_000
 */
public class DateFormatter {
    public static Date getDateFromString(String format, String input) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.parse(input);        
    }
    
    public static Calendar getCalendarFromString(String format, String input) throws ParseException
    {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d = sdf.parse(input);
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        return cal;
    }
    
    public static String getStringFromDate(String format, Date date) throws IllegalArgumentException
    {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }
    
    public static String getStringFromCalendar(String format, Calendar cal) throws IllegalArgumentException
    {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(cal.getTime());
    }
}
