
package net.lecnam.ecue2.tp7;

import java.util.List;
import java.util.Iterator;
import java.util.Collections;
import java.util.Set;


import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.Collections;

import net.lecnam.ecue2.tp7.film.Film;

import net.lecnam.ecue2.tp7.nuancier.Nuancier;

public class Execute {

    public static void main(String[] args) {

        //exercice1();

        //exercice2();
        //exercice3();
        exercice4();
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

        // Création de plusieurs films
        Film film1 = new Film("Les Évadés", "Frank Darabont", 1994);
        Film film2 = new Film("Le Parrain", "Francis Ford Coppola", 1972);
        Film film3 = new Film("The Dark Knight", "Christopher Nolan", 2008);
        Film film4 = new Film("Forrest Gump", "Robert Zemeckis", 1994);
        Film film5 = new Film("Inception", "Christopher Nolan", 2010);
        Film film6 = new Film("Interstellar", "Christopher Nolan", 2014);

        // Création d'une collection naturellement triée
        Set<Film> films = new TreeSet<>();

        // Ajout des films
        films.add(film1);
        films.add(film2);
        films.add(film3);
        films.add(film4);
        films.add(film5);
        films.add(film6);

        // Affichage de la collection triée
        System.out.println("Films triés par année croissante :");

        for (Film film : films) {
            System.out.println(film);
        }

        System.out.println("----------------");

        // Création d'une ArrayList à partir du TreeSet
        ArrayList<Film> listeFilms = new ArrayList<>(films);

        // Inversion de l'ordre de la liste
        Collections.reverse(listeFilms);

        // Affichage de l'ArrayList inversée
        System.out.println("Films triés par année décroissante :");

        for (Film film : listeFilms) {
            System.out.println(film);
        }
    }


    private static void exercice5() {

    }

    private static void exercice6() {

    }
}
