/*
	https://www.hackerrank.com/challenges/library-fine
*/


import java.io.*;
import java.util.*;

public class LibraryFine {

    public static void main(String[] args) {
        
	Scanner s = new Scanner(System.in);
        int fine = 0;
        int[][] date = new int[2][];
        for(int row=0; row < 2; row++)
	{            
	    date[row] = new int[3];
	}
        for(int row = 0; row < 2; row++)
	{            
            for(int col = 0; col < 3; col++)
            {                
		date[row][col] = s.nextInt();
	    }
	}
        if(date[0][2] < date[1][2])
        {
            fine = 0;   
        }
        else if(date[0][2] == date[1][2])
        {
            if(date[0][1] < date[1][1])
            {
                fine = 0;
            }
            else if(date[0][1] == date[1][1])
            {
                if(date[0][0] <= date[1][0])
                {
                    fine = 0;
                }
                else
                {
                    fine = 15 * (date[0][0] - date[1][0]);
                }
            }   
            else
            {
                fine = 500 * (date[0][1] - date[1][1]);
            }
        }
        else
        {
            fine = 10000;
        }
        System.out.println(fine);
        s.close();
    }
}