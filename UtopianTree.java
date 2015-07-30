/*
	https://www.hackerrank.com/challenges/utopian-tree	
*/


import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int N, x;
        while(T > 0)
        {
            N = s.nextInt();
            x = 1;
            if( N > 0 && N % 2 != 0)
            {
                x*=2;
            
                for(int i = 0; i < N/2; i++)
                {
                    x++;
                    x*=2;
                }
            }
            else
            {
                for(int i = 0; i < N/2; i++)
                {
                    x*=2;
                    x++;
                }
            }
            System.out.println(x);
            T--;
        }
        s.close();
    }
}