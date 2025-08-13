import java.util.Scanner;
public class trans {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of row of matrix:");
		int row=sc.nextInt();
		System.out.println("Enter the number of columns :");
		int col=sc.nextInt();
		int [][]matrix=new int[row][col];
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.println("Enter the matrtix elements:");
				matrix[i][j]=sc.nextInt();
			}
		}
		System.out.println("The array Elements are:");
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		int [][]transpose=new int[col][row];
		System.out.println("The Transpose of the Matrix:");
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				transpose[i][j]=matrix[i][j];
			}
			
		}
		for(int i=0;i<transpose.length;i++) {
			for(int j=0;j<transpose[i].length;j++) {
				System.out.print(transpose[j][i]+"\t");
			}
			System.out.println();
		}
	}

}