package sdet_java_task2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class Q7 {
		
		 public static void main(String[] args) {
		      
		        String string = "2017-07-25";
		        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

		        System.out.println(date);
		    }
}
