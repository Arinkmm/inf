package LoginAndPassword;

import java.util.Scanner;

public class Data {
    public static String loginInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин: ");
        String login = scanner.next();
        return login;
    }

    public static String passwordInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String password = scanner.next();
        return password;
    }
}
