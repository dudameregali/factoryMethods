package main.java.com.exemple.nocfactory.regulations;

import main.java.com.exemple.nocfactory.User;

public class MlbUserRegulation implements UserRegulation {
    @Override
    public boolean isRegulatedUser(User user) {
        return user.getCpf() != null && user.getName() != null && user.getEmail() != null;
    }
}
