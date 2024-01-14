package codesoft.StudentManagementSystem;

import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {

	Scanner scanner = new Scanner(System.in);

	public void addStudent(Student student) {
		StudentManagementSystemInterface<Student,String> di = new StudentManagementSystemDao();
		System.out.println("Enter Student ID: ");
		String studentId = scanner.nextLine();
		System.out.println("Enter Student Name: ");
		String studentName = scanner.next();
		System.out.println("Enter Roll No.: ");
		int rollNo = scanner.nextInt();
		System.out.println("Enter Grade: ");
		String grade = scanner.next();
		Student stu = new Student(studentName,rollNo,grade,studentId);
		di.createNew(stu);
	}
	
	public void removeStudent(Student student) {
		StudentManagementSystemInterface<Student, String> di = 
				new StudentManagementSystemDao();
		System.out.println("Enter Student ID: ");
		String id = scanner.nextLine();
		      di.deleteById(id);
	}
	
	public void updateStudent(Student student) {
		
		StudentManagementSystemInterface<Student, String> di = 
				new StudentManagementSystemDao();
		
		System.out.println("Enter Student ID: ");
		String id = scanner.nextLine();
		Student rst = di.getOneById(id);
		
		System.out.println("Enter Student Name: ");
		String name = scanner.next();
		System.out.println("Enter Roll No.: ");
		int rollno = scanner.nextInt();
		System.out.println("Enter Grade: ");
		String grade = scanner.next();
		
		rst.setStudentName(name);
		rst.setStudentGrade(grade);
		rst.setStudentRollName(rollno);
		di.update(rst);
	}
	
	public void showOne() {
		StudentManagementSystemInterface<Student, String> di = 
				new StudentManagementSystemDao();
		System.out.println("Enter Student ID: ");
		String id = scanner.nextLine();
		Student rst = di.getOneById(id);
		if(rst != null)
			System.out.println(rst);
		else
			System.out.println("Student with this id not found");
	}
	
	
	public void showAll() {
		StudentManagementSystemInterface<Student, String> di = 
				new StudentManagementSystemDao();
		List<Student> allStudents = di.getAll();
		for(Student rs : allStudents)
			System.out.println(rs);
	}
	
}