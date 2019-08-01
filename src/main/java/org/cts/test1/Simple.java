package org.cts.test1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Simple {
	public static void main(String[] args) {
		Date d=new Date();
		System.out.println(d);
		SimpleDateFormat fr=new SimpleDateFormat();
		String name=fr.format(d);
		System.out.println(name);
		
	}

}
