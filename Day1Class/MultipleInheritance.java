package Day1Class;


interface Father1 {
 void showFather();
}

interface Mother {
 void showMother();
}

class Childrens implements Father1, Mother {

 public void showFather() {
     System.out.println("This is Father's method");
 }

 public void showMother() {
     System.out.println("This is Mother's method");
 }

 void showChild() {
     System.out.println("This is Child class");
 }
}

public class MultipleInheritance {
 public static void main(String[] args) {

     Childrens obj = new Childrens();

     obj.showFather();
     obj.showMother();
     obj.showChild();
 }
}