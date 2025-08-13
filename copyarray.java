
import java.util.Scanner;
public class copyarray {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row:");
		int row=sc.nextInt();
		System.out.println("Enter the number of columns:");
		int col=sc.nextInt();
		int [][] matrix=new int[row][col];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.println("Enter the matrtix elements:");
				matrix[i][j]=sc.nextInt();
			}
		}
		int [][] copyMatrix=new int[row][col];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				copyMatrix[i][j]=matrix[i][j];
			}
		}
		System.out.println("The Copyed content:");
		for(int i=0;i<copyMatrix.length;i++) {
			for(int j=0;j<copyMatrix[i].length;j++) {
				System.out.print(copyMatrix[i][j]+"\t");
			}
			System.out.println();
			
		}
	}

}