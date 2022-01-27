package dateprgm;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.Test;

public class date1 {
  @Test
  public void date() {
	  
	  Date d1=new Date();
	  System.out.println("Default date:"+d1);
	     SimpleDateFormat simpleDateFormat = new SimpleDateFormat ("MM/dd/yyy");
	     System.out.println()

  }
}
