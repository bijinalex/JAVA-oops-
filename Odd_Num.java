 
public class Odd_Num {
	public static void main(String [] args) {
		System.out.println("odd number from 1 to 50 :");
		int i;
		for(i=1;i<50;i++) {
			if(i%2==0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
