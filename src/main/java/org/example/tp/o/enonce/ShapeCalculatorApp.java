package org.example.tp.o.enonce;

import java.util.ArrayList;
import java.util.List;

/*

Dans ce fichier, vous trouverez une violation du Principe Ouvert/Fermé (Open/Closed Principle).
Vous devez refactoriser ce fichier.
Vous pouvez supprimer ce fichier complètement, car il ne sera pas utilisé lors de l'évaluation de la solution.

Titre de l'exercice : Défi de refactorisation du Principe Ouvert/Fermé (OCP)

Objectif : Dans cet exercice, vous allez vous entraîner à appliquer le Principe Ouvert/Fermé (OCP) pour refactoriser une base de code donnée. L'OCP stipule que les entités logicielles doivent être ouvertes à l'extension mais fermées à la modification. Vous allez améliorer la flexibilité et la maintenabilité de la base de code en permettant son extension facile avec de nouvelles fonctionnalités, sans modifier le code existant.

Instructions :

1. **Examinez le code fourni** : Commencez par examiner le code original fourni. Identifiez les parties où le code viole le Principe Ouvert/Fermé en nécessitant des modifications pour ajouter de nouvelles fonctionnalités.

2. **Identifiez les points d'extension** : Analysez le code pour identifier les domaines où des améliorations ou modifications futures pourraient être nécessaires. Recherchez des comportements ou des fonctionnalités qui sont susceptibles de changer ou d'être étendus à l'avenir.

3. **Refactorisez le code** : Refactorisez le code pour introduire de l'abstraction et de l'encapsulation, permettant une extension facile sans modification du code existant. Utilisez des techniques telles que l'héritage, la composition ou l'injection de dépendances pour y parvenir.

4. **Implémentez des extensions** : Créez de nouvelles classes ou modules pour implémenter des fonctionnalités ou des comportements supplémentaires. Assurez-vous que ces extensions peuvent être ajoutées sans modifier le code existant, en respectant le principe OCP.

Note : Concentrez-vous sur la conception de solutions flexibles et extensibles qui permettent une maintenance facile et des améliorations futures. Prenez en compte les bonnes pratiques, notamment la validation des entrées. Considérez les cas avec des objets ayant des valeurs nulles. N'oubliez pas d'ajouter toutes les vérifications nécessaires pour les valeurs nulles dans votre solution.


*/

public class ShapeCalculatorApp {
    public static void main(String[] args) {
        Circle c1 = new Circle(5);
        Rectangle r1 = new Rectangle(5, 5);
        ArrayList<Shape> lst = new ArrayList<Shape>();
        lst.add(r1);lst.add(c1);
        System.out.println(ShapeCalculatorApp.shapeCalculateToTalArea(lst));
    }

    public static double shapeCalculateToTalArea(List<Shape> shapes){
        double sum = 0.0;
        for(Shape shape : shapes){
            sum += shape.calculateArea();
        }
        return sum;
    }
}

