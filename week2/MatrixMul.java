package week2;

import java.util.*;

public class MatrixMul {
	public static int[][] matrix1;
	public static int[][] matrix2;
	public static int[][] result;
	public static int r1,c1,r2,c2;
	public static Scanner input;
	public static void main(String[] args) {
		input = new Scanner(System.in);
		System.out.println("Enter Size of Matrix 1 (rows x cols):");
		r1=input.nextInt();
		c1=input.nextInt();
		System.out.println("Enter Size of Matrix 2 (rows x cols):");
		r2=input.nextInt();
		c2=input.nextInt();
		
		if(c1!=r2) {
			System.out.println("Matrix Multiplication Not Possible");
			System.exit(0);
		}
		
		//matrix1
		matrix1= new int[r1][c1];
		System.out.println("Enter Matrix");
		readMatrix(matrix1,r1,c1);
		
		//matrix2
		matrix2= new int[r2][c2];
		System.out.println("Enter Matrix");
		readMatrix(matrix2,r2,c2);
		
		//resultMatrix
		result= new int[r1][c2];
		calculateMatrix(matrix1,matrix2);
		displayMatrix(result);

	}
	public static void readMatrix(int [][]matrix,int r,int c) {
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				matrix[i][j]=input.nextInt();
	}
	
	public static void displayMatrix(int[][] matrix) {
		for(int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[0].length;j++)
				System.out.print(matrix[i][j]+" ");
			System.out.println();
		}
	}
	
	public static void calculateMatrix(int[][] matrix1, int[][] matrix2) {
		for(int i=0;i<matrix1.length;i++) {
			for(int j=0;j<matrix2[0].length;j++) {
				result[i][j]=0;
				for(int k=0;k<matrix2.length;k++) {
					result[i][j]+=matrix1[i][k]*matrix2[k][j];	
				}
			}
		}
	}
}
