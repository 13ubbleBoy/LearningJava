package Unit02;

import static java.lang.System.*;
import Unit01.P5_Task03_ConstructorsInJava;

public class P11_Task02_ImportingAndPackagesInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * No need to write 'System' because we imported it as static
		 * Because our method is static
		 */
		out.println("Hello !");
		
		
		/*
		 * We can also import other packages and use their content
		 * We make packages so that we can keep class with similar properties in the same package
		 */
		
		// Using method of a class which is a part of another class
		P5_Task03_ConstructorsInJava obj = new P5_Task03_ConstructorsInJava();
		obj.main(args);
	}

}
