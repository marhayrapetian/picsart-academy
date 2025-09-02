package am.picsartacademy.login.models;

import am.picsartacademy.login.exceptions.UserInvalidException;

public class User {
    private static int counter = 0;
    private int id;

    private String name;
    private int age;
    private String username;
    private String password;

    public User() {
        id = counter + 1;
        counter++;
    }

    public User(String username, String password) {
        id = counter + 1;
        counter++;
        this.username = username;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) throws UserInvalidException {
        if (username.length() < 6) {
            throw new UserInvalidException("Invalid username. Min symbol is 6");
        }
        this.username = username;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) throws UserInvalidException {
        if (password.length() < 4) {
            throw new UserInvalidException("Invalid password. Min symbol is 4");
        }
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", username='" + username + '\'' +
                '}';
    }
}




//    private static int counter = 0;
//    private String name;
//    private int age;
//    private int id;
//    private String username;
//    private String password;
//
//    public User() {
//        id = counter + 1;
//        counter++;
//    }
//
//    public User(String username, String password) {
//        id = counter + 1;
//        counter++;
//        this.username = username;
//        this.password = password;
//    }
//
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) throws UserInvalidException {
//        if (password.length() < 4) {
//            throw new UserInvalidException("Invalid username. Min symbol is 4");
//        }
//        this.password = password;
//
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String userName) throws UserInvalidException {
//        if (userName.length() < 6) {
//            throw new UserInvalidException("Invalid username. Min symbol is 6");
//        }
//        this.username = username;
//
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", username'" + username + '\'' + '}';
//    }
//}
