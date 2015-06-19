import java.util.Scanner;

/*
	URL: https://www.hackerrank.com/challenges/diagonal-difference
*/
public class Solution {
	public static void main(String[] args) {
		int ele;
		Scanner s = new Scanner(System.in);
		int N=s.nextInt();
		int lrDiagSum=0,rlDiagSum=0;
		
		for(int row=0;row<N;row++)
			for(int col=0;col<N;col++)
			{	
				ele=s.nextInt();
				if(row==col)
				{
					lrDiagSum+=ele;
				}
				if(row+col==N-1)
				{
					rlDiagSum+=ele;
				}
			}
		System.out.println( java.lang.Math.abs(lrDiagSum-rlDiagSum));
		s.close();
	}

}