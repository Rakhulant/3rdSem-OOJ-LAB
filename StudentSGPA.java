//package Rakshith;

import java.util.*;

class Student{
	String usn, name;
	int credits[] = new int[6];
	int marks[] = new int[6];
	
	void detailsIn()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the usn and name of student");
		name = sc.next();
		usn = sc.next();
		System.out.println("Enter the credits and marks of 6 subjects alternatively");
		for(int i = 0; i<6; i++)
		{
			credits[i] = sc.nextInt();
			marks[i] = sc.nextInt();
		}
		sc.close();
	}
	
	void detailsPr()
	{
		System.out.println(usn+" "+name);
		for(int i = 0; i<6; i++)
		{
			System.out.println(credits[i] + " " + marks[i]+ "\n");
			
		}
	}
	void sgpa() {
		double sgpa = 0;
		double sum  = 0;
		for(int i = 0; i<6 ; i++) {
			sgpa+=(credits[i]*(marks[i]/10.0));
			sum+=credits[i];
		}
		System.out.println("Sgpa is : "+sgpa/sum);
	}
}

public class StudentSGPA{
	public static void main(String ars[])
	{
		Student s = new Student();
		s.detailsIn();
		System.out.println("The details of the student are : ");
		s.detailsPr();
		s.sgpa();
		
	}
}