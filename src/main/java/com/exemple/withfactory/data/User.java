package main.java.com.exemple.withfactory.data;

public class User {
    private final String name;
    private final String documentNumber;
    private final String documentType;

    public User(String name, String documentNumber, String documentType){
        this.name = name;
        this.documentNumber = documentNumber;
        this.documentType = documentType;
    }

    public String getName(){
        return name;
    }

    public String getDocumentNumber(){
        return documentNumber;
    }

    public String getDocumentType(){
        return documentType;
    }
}
