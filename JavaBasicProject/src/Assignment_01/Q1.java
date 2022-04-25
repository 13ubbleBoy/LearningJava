package Assignment_01;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s[] = new Student[6];
		
		Scanner scN = new Scanner(System.in);
		Scanner scA = new Scanner(System.in);
		Scanner scP = new Scanner(System.in);
		
		for(int i=0; i<6; i++) {
			System.out.print("Enter name : ");
			String name = scN.nextLine();
			System.out.print("Enter age : ");
			int age = scA.nextInt();
			System.out.print("Enter percentage : ");
			int percentage = scP.nextInt();
			
			s[i] = new Student(name, age, percentage);
			
			System.out.println();
		}
		
		scN.close();
		scA.close();
		scP.close();
		
		int res = 0;
		for(int i=0; i<6; i++) {
			res += s[i].Percentage;
		}
		
		System.out.println("Average : " + res/6);
	}

}

class Student{
	String Name;
	int Age;
	char Section = 'A';
	int Percentage;
	
	Student(String name, int age, int percentage){
		Name = name;
		Age = age;
		Percentage = percentage;
	}
}