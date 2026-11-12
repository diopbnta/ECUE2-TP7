
package net.lecnam.ecue2.tp7;

import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Set;

import net.lecnam.ecue2.tp7.nuancier.Nuancier;

public class Execute {

    public static void main(String[] args) {

        //exercice1();

        //exercice2();
        exercice3();
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




        // Création d'un objet Nuancier
        Nuancier nuancier = new Nuancier();

        // Récupération du TreeSet
        Set<String> couleurs = nuancier.getCouleursTreeSet();

        // Affichage du contenu
        System.out.println("Contenu du TreeSet :");

        for (String couleur : couleurs) {
            System.out.println(couleur);
        }

        // Remarque : le TreeSet trie automatiquement les couleurs
        // par ordre alphabétique et supprime les doublons.



    }


    private static void exercice3() {

        // Création d'un objet Nuancier
        Nuancier nuancier = new Nuancier();

        // Recherche de la couleur correspondant à r
        String couleur = nuancier.getCouleurFromCode('r');

        // Affichage du résultat
        System.out.println("La couleur correspondant à r est : " + couleur);
    }


    private static void exercice4() {

    }

    private static void exercice5() {

    }

    private static void exercice6() {

    }
}
