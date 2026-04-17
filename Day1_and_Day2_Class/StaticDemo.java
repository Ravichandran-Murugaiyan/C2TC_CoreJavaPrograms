package Day2Class;

import java.util.*;

public class StaticDemo {
	Scanner s = new Scanner(System.in);
	static String Name;
	
	static void Display() {
		
		Name= "Teddy";
		System.out.println("Hello I'm "+ Name +"!.");
	}
	
	static {
		System.out.println("Welcome !!!");
	}
	
	public static void main(String args[]) {
		Display();
		System.out.println("Thank You!");
		
	}
}
