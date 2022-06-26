package Assignment_02;

import java.util.Scanner;

public class Ques05 {

	public static void main(String[] args) {
		String cities[] = {"Delhi", "Mumbai", "Kolkata", "Chennai", "Dehradun"};
		int[][] temp = new int[5][5];
		Scanner sc=new Scanner(System.in);
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				int x = sc.nextInt();
				temp[i][j] = x;
			}
		}
		
		for(int i=0; i<5; i++) {
			double res = 0;
			for(int j=0; j<5; j++) {
				res = res + temp[i][j];
			}
			System.out.println("Day : " + (int)(i+1) + " | Average : " + res);
		}
		
	}

}
