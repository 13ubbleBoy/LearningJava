package Assignment_01;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Three t1 = new Three(10);
		Three t2 = new Three();
	}

}

class One{
	One(int x){
		System.out.println("One's constructor");
	}
}

class Two extends One{
	Two(){
		super(2);
		System.out.println("Two's constructor");
	}
}

class Three extends Two{
	Three(){
		System.out.println("Three's non-parameterized constructor");
	}
	
	Three(int x){
		System.out.println("Three's parameterized constructor");
	}
}