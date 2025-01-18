package LoginAndPassword;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("first0123456789@._abc", "firstpass", Role.USER);
        User user2 = new User("second0123456789@._abc", "secondpass", Role.ADMIN);
        User[] users = {user1, user2};

        String login;
        String password;
        Role role;

        for (int i = 0; i < users.length; i++) {
            boolean wrongData = true;
            while (wrongData) {
                try {
                    login = Data.loginInput();
                    if (login.equals("exit")) {
                        wrongData = false;
                        break;
                    }
                    password = Data.passwordInput();
                    if (password.equals("exit")) {
                        wrongData = false;
                        break;
                    }
                    role = User.userCheck(login, password, users[i]);
                    if (role == Role.ADMIN) {
                        System.out.println("1. File\n2. Create new user\n3. exit");
                    } else {
                        System.out.println("1. File\n2. Get play list\n3. exit");
                    }
                    wrongData = false;
                } catch (WrongLoginException e) {
                    System.out.println("Логин некорректный, попробуйте еще раз: ");
                } catch (WrongPasswordException e) {
                    System.out.println("Пароль некорректный, попробуйте еще раз: ");
                } catch (WrongAuthorizationException e) {
                    System.out.println("Логин или пароль неверные, попробуйте еще раз: ");
                }
            }
        }
    }
}
