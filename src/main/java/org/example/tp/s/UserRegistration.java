package org.example.tp.s;

public class UserRegistration {
    private UserValidator userValidator;
    private DataBase dataBase;

    UserRegistration(DataBase dataBase, UserValidator userValidator){
        this.userValidator = userValidator;
        this.dataBase = dataBase;
    }

    public void registerUser(User user) {
        // Valider le nom d'utilisateur et le mot de passe
        if (userValidator.validateUsername(user.getUsername()) && userValidator.validatePassword(user.getPassword())) {
            // Enregistrer l'utilisateur dans la base de données
            this.dataBase.addUser(user);
            System.out.println("Utilisateur enregistré avec succès.");
        } else {
            System.out.println("Nom d'utilisateur ou mot de passe invalide.");
        }
    }
}
