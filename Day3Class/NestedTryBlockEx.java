package Day3Class;

public class NestedTryBlockEx {

    public static void main(String[] args) {

        String[] names = {"Ravi", "Kumar", null, "Java"};

        try {

            for (int i = 0; i <= names.length; i++) {

                try {
                    System.out.println("Length of " + names[i] + " is: " + names[i].length());

                } catch (NullPointerException e) {
                    System.out.println("Name is null, cannot find length");
                }
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bounds reached");
        }

        System.out.println("Program continues normally...");
    }
}