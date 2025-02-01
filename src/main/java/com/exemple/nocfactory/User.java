package main.java.com.exemple.nocfactory;

public class User {
    private String name;
    private String cpf;
    private String email;

    public User(String name, String cpf, String email) {
        this.name = name;
        this.cpf = cpf;
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
