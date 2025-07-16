
import java.util.Scanner;

public class Factorial{
	public static void main(String [] args) {
		int i,f=1;
		Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a = sc.nextInt();
	if(a==0){
		f=1;
	}
	else{
        for(i=1;i<=a;i++) {
        	f*=i;
	 }
	}
        System.out.println("The factorial of "+a+" is :"+f);
	  }
   }
