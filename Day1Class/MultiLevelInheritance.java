package Day1Class;

class GrandParent {
 void speak() {
     System.out.println("Bold Attitude");
 }
}

//Parent class
class Father extends GrandParent {
 void Talk() {
     System.out.println("Clear Speech");
 }
}

//Child class
class Children extends Father {
 void character() {
     System.out.println("My Speaking Styles");
 }
}


public class MultiLevelInheritance {
 public static void main(String[] args) {

     Children obj = new Children();

     obj.speak();   
     obj.Talk();  
     obj.character();  
 }
}
