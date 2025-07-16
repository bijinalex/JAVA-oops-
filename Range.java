import java.util.Scanner;

public class Range {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Range:");
		int a =sc.nextInt();
		System.out.println("The Number from 1 to " +a+ "are:\n ");
		for(int i=1;i<a;i++) {
			System.out.println(i);
		}
	} 
	
}
