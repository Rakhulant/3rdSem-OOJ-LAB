import java.util.*;

class Student
{
	double sgpa,sum;
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
	}
	void detailsPr()
	{
		System.out.println(usn+" "+name);
		for(int i = 0; i<6; i++)
		{
			System.out.println(credits[i] + " " + marks[i]+ "\n");
			
		}
		System.out.println("SGPA :"+sgpa);
	}
}

class SGPA extends Student
{
	SGPA()
	{
		detailsIn();
	}
	double sgpa() {
		for(int i = 0; i<6 ; i++) {
			sgpa+=(credits[i]*(marks[i]/10.0));
			sum+=credits[i];
		}
		super.sgpa = sgpa/sum;
		return sgpa;
	}
}
public class InhSgpa {

	public static void main(String[] args) {
		SGPA s1 = new SGPA();
		System.out.println("SGPA calculated is :"+s1.sgpa());
		System.out.println("The Details of the students are :");
		s1.detailsPr();
	}

}
