package Unit03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import java.io.IOException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class P15_FileHandling {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		B b1 = new B();
		//b1.takeInputFromAFile();
		
		
		// Writing into a file
		//b1.saveOutputIntoAFile();
		
		
		
		// Saving output with time and date
		//b1.saveLogOfProgram();
		
		
		// read bytes
		b1.readbytes();

	}

}

class B{
	static int a = 10;
	
	void takeInputFromAFile() throws IOException { // If file is not available then it will show error an IOException
		String path = "/Users/praveenkumar/git/LearningJava/JavaBasicProject/src/Unit03/demo.txt";
		File file = new File(path);
		
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		
		String s;
		while((s = br.readLine()) != null) {
			System.out.println(s);
		} System.out.println("\nNext try----------");
		
		br.close();
	}
	
	void saveOutputIntoAFile() throws IOException{ // To write into a file
		FileWriter myObj = null;
		
		try {
			myObj = new FileWriter("/Users/praveenkumar/git/LearningJava/JavaBasicProject/src/Unit03/sample.txt");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		BufferedWriter f_writer = new BufferedWriter(myObj);
		
		String text = "This will get store in the file";
		f_writer.write(text); // This will erase everything and write its own content
		f_writer.close();
	}
	
	void saveLogOfProgram() throws IOException{
		// This will store all the outputs with its time and date 
		a++;
		LocalTime Ltime = java.time.LocalTime.now();
		LocalDate Ldate = java.time.LocalDate.now();
		
		FileWriter myObj = null;
		
		try {
			myObj = new FileWriter("/Users/praveenkumar/git/LearningJava/JavaBasicProject/src/Unit03/log.txt");
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		BufferedWriter f_writer = new BufferedWriter(myObj);
		
		String text = "The Program was executed at : " + Ltime.toString() + " | " + Ldate.toString() + "\n";
		
		try {
			f_writer.write("Value of a : " + a +", ");
			f_writer.write(text);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		f_writer.close();
	}
	
	void readbytes() throws IOException{
		int a;
		
		String path = ("/Users/praveenkumar/git/LearningJava/JavaBasicProject/src/Unit03/sample.txt");
		File file = new File(path);
		BufferedReader br = new BufferedReader(new FileReader(file));
		
		// reads character by character
		while((a = br.read()) != -1) { // read() function returns ASCII value of the character
			System.out.println((char)a);
		}
		
		br.close();
	}
}