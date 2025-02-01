package main.java.com.exemple.nocfactory.regulations;

import main.java.com.exemple.nocfactory.User;

public class MlaUserRegulation implements UserRegulation {
    @Override
    public boolean isRegulatedUser(User user) {
        return true;
    }
}
