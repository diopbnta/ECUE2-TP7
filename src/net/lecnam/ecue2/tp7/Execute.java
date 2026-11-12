
package net.lecnam.ecue2.tp7;

import java.util.List;
import java.util.Iterator;
import java.util.Collections;

import net.lecnam.ecue2.tp7.nuancier.Nuancier;

public class Execute {

    public static void main(String[] args) {

        exercice1();

        //exercice2();
        //exercice3();
        //exercice4();
        //exercice5();
        //exercice6();
    }

    private static void exercice1() {

        // Création d'un objet Nuancier
        Nuancier nuancier = new Nuancier();

        // Récupération de la liste
        List<String> couleurs = nuancier.getCouleurs();

        // Afficher le nombre d'éléments
        System.out.println("Nombre de couleurs : " + couleurs.size());

        // 1. Parcours avec un for classique
        System.out.println("Parcours avec for :");

        for (int i = 0; i < couleurs.size(); i++) {
            System.out.println(couleurs.get(i));
        }

        System.out.println("----------------");

        // 2. Parcours avec foreach
        System.out.println("Parcours avec foreach :");

        for (String couleur : couleurs) {
            System.out.println(couleur);
        }

        System.out.println("----------------");

        // 3. Parcours avec Iterator
        System.out.println("Parcours avec Iterator :");

        Iterator<String> iterator = couleurs.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("----------------");

        // Vérification de la première position
        System.out.println("Première couleur : " + couleurs.get(0));

        // Trier la liste par ordre alphabétique
        Collections.sort(couleurs);

        System.out.println("----------------");
        System.out.println("Liste triée :");

        for (String couleur : couleurs) {
            System.out.println(couleur);
        }
    }

    private static void exercice2() {

    }

    private static void exercice3() {

    }

    private static void exercice4() {

    }

    private static void exercice5() {

    }

    private static void exercice6() {

    }
}
