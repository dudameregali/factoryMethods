package main.java.com.exemple.withfactory.regulations;

import java.util.Objects;
import main.java.com.exemple.withfactory.data.User;

public class MlaUserRegulation implements UserRegulation {
    @Override
    public boolean isRegulatedUser(User user) {
        String documentType = "DNI";
        return Objects.equals(user.getDocumentType(), documentType) && user.getDocumentNumber() != null;
    }
}
