package main.java.com.exemple.nocfactory;

import main.java.com.exemple.nocfactory.regulations.MlaUserRegulation;
import main.java.com.exemple.nocfactory.regulations.MlbUserRegulation;
import main.java.com.exemple.nocfactory.regulations.UserRegulation;

public class UserAccountManager {

    public boolean isRegulatedUser(String country, User user) {
        UserRegulation regulation = switch (country) {
            case "brasil" -> new MlbUserRegulation();
            case "argentina" -> new MlaUserRegulation();
            default -> throw new IllegalArgumentException("Country not supported");
        };
        return regulation.isRegulatedUser(user);
    }

    public static void main(String[] args) {
        UserAccountManager manager = new UserAccountManager();

        User mlbUser = new User("Duda", "12345678910", "duda@email.com");

        boolean isRegulated = manager.isRegulatedUser("brasil", mlbUser);
        System.out.println("User is valid: " + isRegulated);
    }
}
