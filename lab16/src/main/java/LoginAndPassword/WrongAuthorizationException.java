package LoginAndPassword;

public class WrongAuthorizationException extends Exception{
    public WrongAuthorizationException() {
        super("Ошибка авторизации");
    }

    public WrongAuthorizationException(String message) {
        super(message);
    }
}
