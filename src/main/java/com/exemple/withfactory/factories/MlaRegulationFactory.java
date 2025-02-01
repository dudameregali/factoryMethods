package main.java.com.exemple.withfactory.factories;

import main.java.com.exemple.withfactory.regulations.UserRegulation;
import main.java.com.exemple.withfactory.regulations.MlaUserRegulation;

public class MlaRegulationFactory extends RegulationFactory {
    @Override
    public UserRegulation createUserRegulation(){
        return new MlaUserRegulation();
    }
}
