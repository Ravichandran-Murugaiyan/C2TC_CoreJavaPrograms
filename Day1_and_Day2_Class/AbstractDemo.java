package Day2Class;

abstract class ShapeDemo{
	abstract void draw(); 
	
	void drawing() {
		System.out.println("Drawing Competition"); 
	}
}

class CircleDemo extends ShapeDemo{
	void draw() {
		System.out.println("Drawing a circle");
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		ShapeDemo sd = new CircleDemo();
		sd.draw();
sd.drawing();
		
	}

}