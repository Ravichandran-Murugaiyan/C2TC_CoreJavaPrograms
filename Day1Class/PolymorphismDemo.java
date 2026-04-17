package Day1Class;

public class PolymorphismDemo {


		
		//Method Overloading
		public int addition(int a, int b) {
			return a + b;
		}
		
		public float addition(float a, float b) {
			return a + b;
		}
		
		public static void main(String[] args) {
			
			PolymorphismDemo pd = new PolymorphismDemo();
			System.out.println(pd.addition(2, 5));
			System.out.println(pd.addition(3f, 6f));
		}

	}



