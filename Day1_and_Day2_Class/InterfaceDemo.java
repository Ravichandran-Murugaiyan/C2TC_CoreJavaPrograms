package Day2Class;

interface vegetable{
	void healthy();
}


class InterDemo implements vegetable{
	public void healthy() {
		System.out.println("The vegetables are healthy");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		
		vegetable vg = new InterDemo();
		vg.healthy();

	}

}