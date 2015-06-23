import java.util.Scanner;
/*
		https://www.hackerrank.com/challenges/time-conversion
*/

public class TimeConversion {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
    	String timein12=s.next();
		int hour=Integer.parseInt(timein12.substring(0, 2));
		String timein24=timein12.substring(2, 8);
		if(timein12.charAt(8)=='P')
		{
			if(hour!=12)
			{
				hour+=12;
			}
			timein24=hour+timein24;
		}
		else
		{
			timein24=hour==12?"00"+timein24:timein12.substring(0,8);
		}
		System.out.println(timein24);
		s.close();
	}

}
