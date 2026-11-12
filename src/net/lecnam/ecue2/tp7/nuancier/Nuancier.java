package net.lecnam.ecue2.tp7.nuancier;



import java.util.ArrayList;
import java.util.List;

public class Nuancier {

    // Liste de couleurs
    private List<String> couleurs;

    // Constructeur sans paramètre
    public Nuancier() {

        // Initialisation de la liste
        couleurs = new ArrayList<>();

        // Ajout des couleurs
        couleurs.add("noir");
        couleurs.add("rouge");
        couleurs.add("vert");
        couleurs.add("marron");
        couleurs.add("blanc");

        // Ajout d'une deuxième fois rouge
        couleurs.add("rouge");

        // Ajout de cyan à la première position
        couleurs.add(0, "cyan");
    }

    // Getter
    public List<String> getCouleurs() {
        return couleurs;
    }
}
