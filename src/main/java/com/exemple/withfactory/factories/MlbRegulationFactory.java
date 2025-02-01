package main.java.com.exemple.withfactory.factories;

import main.java.com.exemple.withfactory.regulations.UserRegulation;
import main.java.com.exemple.withfactory.regulations.MlbUserRegulation;

public class MlbRegulationFactory extends RegulationFactory{
    @Override
    public UserRegulation createUserRegulation(){
        return new MlbUserRegulation();
    }
}
