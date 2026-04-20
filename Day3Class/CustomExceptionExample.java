package Day3Class;

class InvalidBalanceException extends Exception {

    private static final long serialVersionUID = 1L;
    InvalidBalanceException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {

    static void withdraw(int balance) throws InvalidBalanceException {
        if (balance < 1000) {
            throw new InvalidBalanceException("Insufficient balance");
        }
        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {
        try {
            withdraw(1000);
        } catch (InvalidBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}