package org.example.tp.s;

public class UserValidator {

    public boolean validateUsername(String username) {
        // Valider le nom d'utilisateur (ex: longueur, caractères autorisés)
        return username.length() >= 5 && username.matches("[a-zA-Z_0-9]+");
    }

    public boolean validatePassword(String password) {
        // Valider le mot de passe (ex: longueur, complexité)
        return password.length() >= 8 && password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$");
    }
}
