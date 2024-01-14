package codesoft.StudentManagementSystem;

public class Student {
	
	private String studentName;
	private int studentRollName;
	private String studentGrade;
	private String studentId;
	
	public Student() {
		super();
	}

	public Student(String studentName, int studentRollName, String studentGrade, String studentId) {
		super();
		this.studentName = studentName;
		this.studentRollName = studentRollName;
		this.studentGrade = studentGrade;
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentRollName() {
		return studentRollName;
	}

	public void setStudentRollName(int studentRollName) {
		this.studentRollName = studentRollName;
	}

	public String getStudentGrade() {
		return studentGrade;
	}

	public void setStudentGrade(String studentGrade) {
		this.studentGrade = studentGrade;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	public Student getDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
