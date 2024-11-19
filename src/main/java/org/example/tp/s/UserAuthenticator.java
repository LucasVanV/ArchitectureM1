package org.example.tp.s;

public class UserAuthenticator {
    private UserValidator userValidator;
    private DataBase data;

    UserAuthenticator(DataBase data, UserValidator userValidator){
        this.userValidator = userValidator;
        this.data = data;
    }
 
    public void loginUser(User user) {
        // Valider le nom d'utilisateur et le mot de passe
        if (userValidator.validateUsername(user.getUsername()) && userValidator.validatePassword(user.getPassword())) {
            // Authentifier l'utilisateur
            if(data.isUserRegistred(user)){
                System.out.println("Utilisateur connecté avec succès.");
            }else{
                System.out.println("Utilisateur non enregistré.");
            }
        } else {
            System.out.println("Nom d'utilisateur ou mot de passe invalide.");
        }
    }
}
