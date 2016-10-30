package com.caysever.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	private static SimpleDateFormat timestampFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
	
	public static String getFormattedDate(Calendar calendar) throws ParseException{
		return timestampFormat.format(calendar.getTime());
	}
	public static String getFormattedDate(Date date){
		return timestampFormat.format(date);
	}
}
