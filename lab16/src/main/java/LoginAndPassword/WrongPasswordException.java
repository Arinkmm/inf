package LoginAndPassword;

public class WrongPasswordException extends Exception {
    public WrongPasswordException() {
        super("Пароль введён некорректно");
    }

    public WrongPasswordException(String message) {
        super(message);
    }
}
