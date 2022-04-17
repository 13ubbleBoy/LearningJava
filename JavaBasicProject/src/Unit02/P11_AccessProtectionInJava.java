package Unit02;

public class P11_AccessProtectionInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		G obj = new G();
		obj.setDetails("Praveen Kumar", "13ubbleBoy");
		obj.setID(200111214);
		obj.setPassword(2018567);
		
		obj.showDetailsIfPasswordMatches(20151618);
		obj.showDetailsIfPasswordMatches(2018567);
		
		H object = new H();
		object.setID(200111214);
		object.setDetails("Praveen Kumar", "13ubbleBoy");
		object.showDetails();
	}

}


/*
 * There are 3 types of Access modifiers in Java
 * Public : Available for everyone and within the package and outside the package.
 * Protected : Available for members within the class and subclass, it cannot be accessed from outside the package.
 * Private : Cannot be accessed from outside of the class
 * Default : It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.
 */


class G{
	private int Password;
	protected int ID;
	public String name;
	String userName;
	
	public void setDetails(String N, String uN) {
		name = N;
		userName = uN;
	}
	
	public void setPassword(int pass) { // Using public method we can access private members 
		Password = pass;
	}
	
	public void setID(int id) { // Using public method we can access protected members
		ID = id;
	}
	
	void showDetailsIfPasswordMatches(int pass) {
		if(pass == Password) {
			System.out.println("User Name : " + userName);
			System.out.println("Name : " + name);
			System.out.println("ID : " + ID);
		} else {
			System.out.println("Wrong password !");
		}
	}
}

class H extends G{
	void showDetails() {
		System.out.println("\nUser Name : " + userName);
		System.out.println("Name : " + name);
		System.out.println("ID : " + ID);
	}
}
