import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
		int positive=0,negative=0;
		int num;
		Scanner s=new Scanner(System.in);
		int N=s.nextInt();
		for(int index=0; index < N; index++)
		{
			num=s.nextInt();
			if(num > 0)
				positive++;
			else if(num < 0)
				negative++;
		}
		System.out.printf("%.3f\n", (float)positive/N);
		System.out.printf("%.3f\n", (float)negative/N);
		System.out.printf("%.3f", 1-(float)(positive+negative)/N);
		s.close();
	}

}