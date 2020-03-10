package com.Practice;




import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class TimeStamp {

	
	
	@Test
	public void getTime() {
		Date date=new Date();
		System.out.println(date.getTime());
		
		SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy/hh:mm:ss");
		String formatDate=sdf.format(date.getTime());
		System.out.println(formatDate);
		
	}
}
