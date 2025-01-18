package LoginAndPassword;

public class WrongLoginException extends Exception {
    public WrongLoginException() {
        super("Логин введён некорректно");
    }

    public WrongLoginException(String message) {
        super(message);
    }

}
