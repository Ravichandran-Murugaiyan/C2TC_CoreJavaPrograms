package Day1Class;

class Parent{
	void display() {
	System.out.println("This is the Parent Class !!");
		}
	}
	
class Child1 extends Parent{
		void dp() {
		System.out.println("This is the Child Class !!");
		}
	}
	
class InheritanceDemo{
	public static void main (String args[]) {	
		Child1 c = new Child1();
		c.display();
		c.dp();
		
	}
}



