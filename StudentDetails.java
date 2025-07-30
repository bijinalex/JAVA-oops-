package java_lab_projects;

	class Student{
		String name;
		int rollNumber;
		int m1,m2,m3;
		float avg;
	
	
	Student(String name,int rollNumber,int m1,int m2,int m3){
			this.name=name;
			this.rollNumber=rollNumber;
			this.m1=m1;
			this.m2=m2;
			this.m3=m3;
			}
	
	public void CalculateAverage() {
		avg=(m1+m2+m3)/3;
			}

		public void displayDetails(){
		System.out.println("Name:"+name);
		System.out.println("Rollnumber:"+rollNumber);
		System.out.println("Subject 1:"+ m1);
		System.out.println("Subject 2:"+ m2);
		System.out.println("Subject 3:"+ m3);
		System.out.println("Average:"+ avg);
	}
}

public class StudentDetails {
	public static void main(String[] args) {
		Student s1=new Student("Batistuta",32,98,96,91);
		s1.CalculateAverage();
		s1.displayDetails();
		
		System.out.println("\n");
		
		Student s2=new Student("cyrus",40,100,75,90);
		s2.CalculateAverage();
		s2.displayDetails();
	}
}
