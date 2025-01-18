package LoginAndPassword;


public class User {
    String login;
    String password;
    Role role;

    public User(String login, String password, Role role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public static Role userCheck(String login, String password, User user) throws WrongLoginException, WrongPasswordException, WrongAuthorizationException {

        if (!(login.matches("[a-zA-Z0-9@._-]{20,}"))) {
            throw new WrongLoginException();
        }
        if (!(password.matches("[a-zA-Z0-9{}(),.;&?!_+\\-\\[\\]]{8,}"))) {
            throw new WrongPasswordException();
        }
        if (login.equals(user.login) && password.equals(user.password)) {
            return user.role;
        } else {
            throw new WrongAuthorizationException();
        }
    }
}
