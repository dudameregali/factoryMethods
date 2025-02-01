package main.java.com.exemple.withfactory;

import main.java.com.exemple.withfactory.data.User;
import main.java.com.exemple.withfactory.regulations.UserRegulation;
import main.java.com.exemple.withfactory.factories.MlbRegulationFactory;

public class UserAccountManager {

    public static void main(String[] args) {
        User mlbUser = new User("Duda", "1234", "CPF");

        MlbRegulationFactory mlbFactory = new MlbRegulationFactory();
        UserRegulation mlbRegulation = mlbFactory.createUserRegulation();

        boolean isRegulated = mlbRegulation.isRegulatedUser(mlbUser);
        System.out.println("User " + mlbUser.getName() + " is valid: " + isRegulated);
    }

}
