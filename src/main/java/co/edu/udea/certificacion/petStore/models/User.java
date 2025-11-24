package co.edu.udea.certificacion.petStore.models;

public class User {
    private String username;
    private String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static User invalidUser() {
        return new User("usuario_invalido", "clave_invalida");
    }

    public static User lockedUser() {
        return new User("locked_out_user", "secret_sauce");
    }

    public static User standardUser() {
        return new User("standard_user", "secret_sauce");
    }

}
