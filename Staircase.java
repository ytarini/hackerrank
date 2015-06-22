import java.util.Scanner;

/*
 https://www.hackerrank.com/challenges/staircase
 */
public class Staircase {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int stepNo=1;stepNo<=N;stepNo++)
		{
			for(int space = N-stepNo; space > 0; space--)
				System.out.print(" ");
			for(int hash = 1; hash <= stepNo; hash++)
				System.out.print("#");
			System.out.printf("\n");
		}
		s.close();
	}

}