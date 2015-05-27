package studentinfo;

import teacherinfo.*;



public class Student {

	public static void main(String[] args) {

		//TeacherDetails td1 = new TeacherDetails();

		
		
		StudentDetails std1 = new StudentDetails();
		
		std1.name = "Sam";
		std1.rollNumber = 023;
		std1.grade = 12;
		System.out.println("Student Info");
		System.out.println("Name: " +std1.name);
		System.out.println("ID: "+std1.rollNumber);
		System.out.println("Grade: "+std1.grade);
		

		
		
		StudentDetails std2 = new StudentDetails();
		std2.name = "Paul";
		std2.rollNumber = 011;
		std2.grade = 10;
		System.out.println("\nStudent Info");
		System.out.println("Name: "+std2.name);
		System.out.println("Id: "+std2.rollNumber);
		System.out.println("Grade: "+std2.grade);
		

	}

}
