package Day1Class;

	class Fruits{
		void sweet() {
			System.out.println("The fruits are very sweet");
		}
	}

	class Apple extends Fruits{
		void sweetApple() {
			System.out.println("The Apples are very sweet");
		}
	}

	class Banana extends Fruits{
		void sweetBanana() {
			System.out.println("The Banana are very sweet");
		}
	}
	public class HierarchicalInheritance {	
	public static void main (String args[]) {
		Banana b = new Banana();
		Apple a = new Apple();
		a.sweet();
		a.sweetApple();
		b.sweet();
		b.sweetBanana();
	}
}
