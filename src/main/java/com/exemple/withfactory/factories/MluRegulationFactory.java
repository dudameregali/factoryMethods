package main.java.com.exemple.withfactory.factories;

import main.java.com.exemple.withfactory.regulations.UserRegulation;
import main.java.com.exemple.withfactory.regulations.MluUserRegulation;

public class MluRegulationFactory extends RegulationFactory {
    @Override
    public UserRegulation createUserRegulation(){
        return new MluUserRegulation();
    }
}
