import java.util.Scanner;

/*
	https://www.hackerrank.com/challenges/caesar-cipher-1
 */

public class CaesarCipher {

	public static int forUpper(int ascii,int K)
	{
		if(ascii + K > 90)
			return forUpper(ascii - 26, K);
		else 
			return ascii + K;
	}
	public static int forLower(int ascii,int K)
	{
		if(ascii + K > 122)
			return forLower(ascii - 26, K);
		else 
			return ascii + K;
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int N = s.nextInt();
		String S = s.next();
		int K = s.nextInt();
		int ascii=0;
		String Encrypted = "";
		
		for(int index = 0; index < N; index++)
		{
			ascii = (int)S.charAt(index);
			if(ascii >= 65 && ascii <= 90)
			{
				ascii = forUpper(ascii, K);
			}
			else if(ascii >= 97 && ascii <= 122)
			{
				ascii = forLower(ascii, K);
			}
			Encrypted = Encrypted + (char)ascii; 
		}
		System.out.println(Encrypted);
		s.close();
	}

}
