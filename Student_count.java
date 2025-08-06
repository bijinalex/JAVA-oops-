class Student{
	String name;
	static int StudentCount=0;
	
	Student(String name){
		this.name=name;
		StudentCount++;
	}
		
	public static int getStudentCount() {
		return StudentCount;
	}
	public void getStudentDetails() {
		System.out.println(this.name);
	}
	
}
public class Student_count {
	public static void main (String [] args) {
		Student s1=new Student("Vijilee");
		s1.getStudentDetails();
		Student s2=new Student("Sebin");
		s2.getStudentDetails();
		Student s3=new Student("Bijin");
		s3.getStudentDetails();
		int x=Student.getStudentCount();
		System.out.println("Student Count:"+x);
	}
}


