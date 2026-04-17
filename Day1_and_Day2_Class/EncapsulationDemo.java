package Day1Class;

public class EncapsulationDemo {

	private String name;
	private int age;
	private int jersyNo;
	
	
	EncapsulationDemo(String name,int age, int jersyNo ){
		this.age = age;
		this.name = name;
		this.jersyNo = jersyNo;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getJersyNo() {
		return jersyNo;
	}
	public void setJersyNo(int jersyNo) {
		this.jersyNo = jersyNo;
	}
	
	@Override
	public String toString() {
		return "EncapsulationDemo [name=" + name + ", age=" + age + ", jersyNo=" + jersyNo + "]";
	}

	public static void main(String[] args) {
		
		
		EncapsulationDemo ed = new EncapsulationDemo("Suresh Raina",46,3);
		System.out.println(ed);

	}

}
