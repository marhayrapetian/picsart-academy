package am.picsartacademy.login.exceptions;


public class UserInvalidException extends RuntimeException{
    public UserInvalidException(String message) {
        super(message);
    }
}

