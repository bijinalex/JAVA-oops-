class _Student{
	String name;
	int age;
public void Displaydetails() {
	System.out.println(name);
	System.out.println(age);
}
}
public class Student{
	public static void main(String [] args) {
		_Student std1=new _Student();
		std1.name="Bijin";
		std1.age=18;
		std1.Displaydetails();
		_Student std2=new _Student();
		std2.name="Amal";
		std2.age=19;
		std2.Displaydetails();	
}
}
