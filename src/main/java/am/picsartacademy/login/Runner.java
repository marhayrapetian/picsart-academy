package am.picsartacademy.login;

import am.picsartacademy.login.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    static List<User> users = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static User currentUser;
    static boolean isAlive = true;

    public static void main(String[] args) {
        System.out.println("Welcome ... ");
        while (isAlive) {
            if (currentUser == null) {
                handleLogedOutAtate();
            }else {
                handleLogedInAtate();
            }
        }
    }
    public static void handleLogedInAtate() {
        System.out.println("Type 1 for view personal info");
        System.out.println("Type 2 for update personal info");
        System.out.println("Type 3 for logout");
        System.out.println("Type 4 for exit");
        String command = scanner.next();

        switch (command) {
            case "1":
                System.out.println(currentUser);
                break;
            case "2":
                updatePersonalInfo();
                break;
            case "3" :
                currentUser = null;
                break;
            case "4" :
                isAlive = false;
                break;
            default:
                System.out.println("Invalid argument");
        }
    }
   public static void handleLogedOutAtate() {
        System.out.println("Type 1 for reg");
        System.out.println("Type 2 for login");
        System.out.println("Type 3 for exit");

        String command = scanner.next();
        switch (command) {
            case "1":
                register();
                break;
            case "2":
                login();
                break;
            case "3" :
                isAlive = false;
                break;
            default:
                System.out.println("Invalid argument");
        }
    }
    public static void login() {
        System.out.println("Input username");
        String username = scanner.next();
        User user = users.stream().filter(u -> u.getUsername().equals(username))
                .findAny()
                .orElse(null);
        if (user == null) {
            System.out.println("Invalid user");
            return;
        }
        System.out.println("Input password");
        String password = scanner.next();
        if (!user.getPassword().equals(password)) {
            System.out.println("Invalid password");
            return;
        }
        System.out.println("You are succesfully logged in");
        currentUser = user;
    }
    public static void register() {
        User user = new User();
        System.out.println("Input username");
        user.setUsername(scanner.next());
        System.out.println("Input password");
        user.setPassword(scanner.next());
        users.add(user);
        System.out.println("You are successfuly registered");
    }
    public static void updatePersonalInfo() {
        System.out.println("Input name");
        String name = scanner.next();
        currentUser.setName(name);
        System.out.println("Input age");
        int age = scanner.nextInt();
        currentUser.setAge(age);
        System.out.println("User data updated");
    }
}

