
import java.util.*;

import CIE.Internals;
import SEE.External;


public class marks {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of students");
		int n = sc.nextInt();
		Internals cies[] = new Internals[n];
		External sees[] = new External[n];
		
		for(int i = 0 ; i < n ; i++)
		{
			sees[i] = new External();
			cies[i] = new Internals();
			int fMarks[] = new int[5];
			for(int j = 0; j< 5; j++)
				fMarks[j]  = sees[i].seeMarks[j]/2 + cies[i].cieMarks[j];
			
			System.out.println("\n\nName = "+sees[i].name+"\nUSN = "+sees[i].usn+"\n");
			for(int j = 0; j< 5; j++)
				System.out.println("Subject "+j+" : "+fMarks[j]);
		}
	}
}
