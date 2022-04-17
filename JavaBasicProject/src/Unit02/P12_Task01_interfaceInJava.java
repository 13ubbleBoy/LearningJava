package Unit02;

import static java.lang.System.*;

/*
 * An interface is a 100% abstract class
 * Its object cannot be created
 * It can only be implemented by other classes
 */

interface BABY{
	void Walking();
	void Talking();
	void Running();
}

interface BOY{
	void study();
	void play();
}

public class P12_Task01_interfaceInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MAN m = new MAN();
		m.Walking();
		m.Talking();
		m.Running();
		
		m.study();
		m.play();
	}

}


class MAN implements BABY, BOY{
	
	// Methods of BABY interface
	public void Walking() {
		out.println("Baby can WALK");
	}
	
	public void Talking() {
		out.println("Baby can TALK");
	}
	
	public void Running() {
		out.println("Baby can RUN");
	}
	
	
	
	// Methods of BOY interface
	public void study() {
		out.println("Boy is studying");
	}
	
	public void play() {
		out.println("Boy is playing");
	}
}

