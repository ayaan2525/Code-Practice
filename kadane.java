
import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws IOException {
		//code
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test = Integer.parseInt(br.readLine());
		while(test > 0) {
		    test -= 1;
		    int length = Integer.parseInt(br.readLine());
		    int	maxSoFar = Integer.MIN_VALUE;
		    int maxEndingHere =	0;
	        String input[] = br.readLine().split(" ");
			for	(int i = 0;	i <	length; i++) {
			    int ele = Integer.parseInt(input[i]);
			
				maxEndingHere =	maxEndingHere + ele;
				
				if	(maxSoFar <	maxEndingHere) {
					maxSoFar =	maxEndingHere;
			 }
			
				if	(maxEndingHere < 0)	{
				    maxEndingHere =	0;
				}

			
		}
		System.out.println(maxSoFar);
	}
}
}
