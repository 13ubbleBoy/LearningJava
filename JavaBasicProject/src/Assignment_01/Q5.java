package Assignment_01;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e[] = new Employee[8];
		
		Scanner scN = new Scanner(System.in);
		Scanner scA = new Scanner(System.in);
		Scanner scD = new Scanner(System.in);
		Scanner scS = new Scanner(System.in);
		
		for(int i=0; i<8; i++) {
			System.out.print("Name : ");
			String name = scN.nextLine();
			
			System.out.print("Age : ");
			int age = scA.nextInt();
			
			System.out.print("Department : ");
			String dep = scD.next();
			
			System.out.print("Salary : ");
			int sal = scS.nextInt();
			if(sal > 30000) {
				sal = 25000;
			}
			
			e[i] = new Employee(name, age, dep, sal);
			System.out.println();
		}
		
		scN.close();
		scA.close();
		scD.close();
		scS.close();
		
		int salA = 0, salB = 0, salC = 0, salD = 0;
		
		for(int i=0; i<8; i++) {
			if(e[i].Department == "A") {
				salA += e[i].Salary;
			} else if(e[i].Department == "B") {
				salB += e[i].Salary;
			} else if(e[i].Department == "C") {
				salC += e[i].Salary;
			} else {
				salD += e[i].Salary;
			}
		}
		
		System.out.println("Total salary of Department A " + salA);
		System.out.println("Total salary of Department B " + salB);
		System.out.println("Total salary of Department C " + salC);
		System.out.println("Total salary of Department D " + salD);
	}

}

class Employee{
	String Name;
	int Age;
	String Department;
	int Salary;
	
	Employee(String nm, int age, String dep, int sal){
		Name = nm;
		Age = age;
		Department = dep;
		Salary = sal;
	}
}