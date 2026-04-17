package Day1Class;


interface Parent1 {
    void show1();
}

interface Parent2 {
    void show2();
}

class Base {
    void display() {
        System.out.println("This is Base class");
    }
}

class Child extends Base implements Parent1, Parent2 {

    public void show1() {
        System.out.println("This is Parent1 interface method");
    }

    public void show2() {
        System.out.println("This is Parent2 interface method");
    }

    void showChild() {
        System.out.println("This is Child class");
    }
}

public class HybridInheritance {
    public static void main(String[] args) {

        Child obj = new Child();

        obj.display();  
        obj.show1();     
        obj.show2();    
        obj.showChild(); 
    }
}

