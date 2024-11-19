package org.example.tp.l.enonce;
/*
Dans ce fichier, vous trouverez une violation du Principe de Substitution de Liskov (Liskov Substitution Principle - LSP).
Vous devez refactoriser ce fichier.
Vous pouvez supprimer ce fichier complètement, car il ne sera pas utilisé lors de l'évaluation de la solution.

Objectif : Comprendre et appliquer le Principe de Substitution de Liskov (LSP) en programmation Java.

Tâche :

Vous disposez d'un code Java initial qui viole le Principe de Substitution de Liskov.

Identifiez la violation dans le code et refactorisez-le pour qu'il respecte le LSP.

Étapes :

        1. Étudiez attentivement le code fourni, en prêtant attention à la hiérarchie d'héritage et aux méthodes redéfinies (overrides).

        2. Identifiez comment la classe `Square` (Carré) viole le LSP lorsqu'elle hérite de la classe `Rectangle`.

        3. Refactorisez le code pour créer une solution où `Rectangle` et `Square` peuvent être substitués par une classe mère commune `Shape` (Forme).

        4. Assurez-vous que le code refactorisé maintient la fonctionnalité tout en respectant le LSP.

        Note : Lors de l'implémentation, prenez en compte les bonnes pratiques. Notamment, faites des validations d'entrées. Si une valeur négative ou égale à zéro est passée pour l'un des côtés de la forme, vous devez lancer une exception `IllegalArgumentException`.

        */

public class AreaCalculation {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,3);
        System.out.println("Aire du rectangle : " + rectangle.calculateArea());

        Square square = new Square(2);
        System.out.println("Aire du carre : " + square.calculateArea());
    }
}
