package override;

import java.util.Scanner;

public class MainMethod extends Object  {
	
	
	public void findRollDetailsint(Student s[])
	{
		for(int i=0;i<5;i++)
		{
			if(s[i] instanceof SchoolStudent)
			{
				System.out.println("School student");
			}
			else if(s[i] instanceof CollegeStudent) {
				System.out.println("College Student");
			}
			
		}
		
	}
	
	public void grade(Student s[])
	{
		int cnt=0;
		for(int i=0;i<5;i++)
		{
			if(s[i].getPer()>75)
			{
				cnt++;	
			}
			
		}
		System.out.println("A grade student = "+cnt);
	}
	
	public static void main(String args[])
	{
		MainMethod x= new MainMethod();
		Scanner sc = new Scanner(System.in);
		SchoolStudent s1 = new SchoolStudent(10,89.5f,"Seventh");
		//s1.show();
		SchoolStudent s2 = new SchoolStudent(11,81.5f,"eighth");
		//s2.show();
		SchoolStudent s3 = new SchoolStudent(12,80.5f,"second");
		//s3.show();
		CollegeStudent cs1 = new CollegeStudent(13,45.5f,10);
		//cs1.show();
		CollegeStudent cs2 = new CollegeStudent(14,45.5f,10);
		//cs2.show();
		Student []s = new Student[5];
		s[0] = s1;
		s[1] = s2;
		s[2] = s3 ;
		s[3] = cs1;
		s[4] = cs2;
		for(int i=0;i<5;i++)
		{
			s[i].show();
		}
		
		x.findRollDetailsint(s);
		x.grade(s);
		
		
		
	}

}
