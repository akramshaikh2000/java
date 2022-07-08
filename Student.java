import java.util.Scanner;
class Student
	{
	public static void main (String args[])
		{
		System.out.println("Student Details:");
		Scanner sc=new Scanner(System.in);
		
			System.out.println("StudentName:");
			String StudentName=sc.next();
		
			System.out.println("StudentIDno:");
			byte StudentIDno=sc.nextByte();
		
			System.out.println("StudentGender(M/F):");
			char StudentGender=sc.next().charAt(0);
		
			System.out.println("StudentAge:");
			byte StudentAge=sc.nextByte();
		
			System.out.println("StudentMobileno:");
			long StudentMobileno=sc.nextLong();
		
			System.out.println("StudentCGPA:");
			float StudentCGPA=sc.nextFloat();	
		
		System.out.println("Student Details:");
		System.out.println("StudentName: "+StudentName);
		System.out.println("StudentIDno: "+StudentIDno);
		System.out.println("StudentGender: "+StudentGender);
		System.out.println("StudentAge: "+StudentAge);
		System.out.println("StudentMobileno: "+StudentMobileno);
		System.out.println("StudentCGPA: "+StudentCGPA);
		}		
	}