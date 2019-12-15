package DateClassAndCallendarConcepts;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Prac1DateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//how to print current time and date 
		// we need to create an object of the clas
		
		Date date = new Date();
		
		
		
		System.out.println(date.toString());//in order to print current data we need to put.and selecte toString.
		
		//but I want to print the date in US format like mm/dd/yyyy and HH:MM:SS
	
		/*
		 * DATE FORMATS 
		 * y   = year   (yy or yyyy)
		M   = month  (MM)
		d   = day in month (dd)
		h   = hour (0-12)  (hh)
		H   = hour (0-23)  (HH)
		m   = minute in hour (mm)
		s   = seconds (ss)
		S   = milliseconds (SSS)
		z   = time zone  text        (e.g. Pacific Standard Time...)
		Z   = time zone, time offset (e.g. -0800)
				 */
		SimpleDateFormat sdf = new SimpleDateFormat("M/dd/YYYY");// crate another object for SimpleDateFormat
		System.out.println(sdf.format(date));
		
		
		Date d = new Date();
		System.out.println(d.toString());
		System.out.println(d.toString());
		SimpleDateFormat simpleDate = new SimpleDateFormat("yyyy/d/M H:m:s:S z Z");
		System.out.println("The date is: "+simpleDate.format(d));
	
	
	}

}
