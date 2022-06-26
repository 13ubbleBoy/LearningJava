package Assignment_02;

import java.util.Scanner;

public class Ques04 {

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
			int tMX = 0, tMN = 99, idxMX = 0, idxMN = 0;
			for(int j=0; j<5; j++) {
				if(temp[i][j] > tMX) {
					tMX = temp[i][j];
					idxMX = j;
				}
				if(temp[i][j] < tMN) {
					tMN = temp[i][j];
					idxMN = j;
				}
			}
			System.out.println("Day : " + (int)(i+1) + " | Highest : " + tMX + " | City : " + cities[idxMX]);
			System.out.println("Day : " + (int)(i+1) + " | Lowest : " + tMN + " | City : " + cities[idxMN]);
			System.out.println();
		}
	}
}
