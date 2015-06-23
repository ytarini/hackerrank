import java.util.Scanner;

/*
	https://www.hackerrank.com/challenges/time-conversion
*/

public class TimeConversion {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
    	String st=s.next();
		int i=Integer.parseInt(st.substring(0, 2));
		if(st.charAt(8)=='P')
		{
			if(i!=12)
			{
			i+=12;
			}
			System.out.println(i+st.substring(2, 8));
		}
		else if(st.charAt(8)=='A')
		{
			if(i==12)
			{
				System.out.println("00"+st.substring(2,8));
			}
			else
			{
				System.out.println(st.substring(0,8));
			}
		}
		s.close();
	}

}