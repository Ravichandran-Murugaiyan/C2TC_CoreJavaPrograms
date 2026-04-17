package Day2Class;

public class GreetingClass {

	public static void main(String[] args) {
		
		GreetingsDemo gd = () -> {
			System.out.println("Hi All! welcome to the Java Session");
		};
		
		gd.greet();

	}

}
