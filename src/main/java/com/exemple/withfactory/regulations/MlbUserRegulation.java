package main.java.com.exemple.withfactory.regulations;

import java.util.Objects;
import main.java.com.exemple.withfactory.data.User;

public class MlbUserRegulation implements UserRegulation {
    @Override
    public boolean isRegulatedUser(User user) {
        String documentType = "CPF";
        return Objects.equals(user.getDocumentType(), documentType)
            && user.getDocumentNumber() != null;
    }
}
