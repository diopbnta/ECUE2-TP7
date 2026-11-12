
package net.lecnam.ecue2.tp7.nuancier;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.Map;
import java.util.HashMap;

public class Nuancier {

    private List<String> couleurs;

    // Attribut de l'exercice 3
    private Map<Character, String> couleursMap;

    public Nuancier() {

        couleurs = new ArrayList<>();

        couleurs.add("noir");
        couleurs.add("rouge");
        couleurs.add("vert");
        couleurs.add("marron");
        couleurs.add("blanc");
        couleurs.add("rouge");

        // Ajouter cyan en première position
        couleurs.add(0, "cyan");

        // Initialisation de la HashMap
        initializeMap();
    }

    // Getter de la liste
    public List<String> getCouleurs() {
        return couleurs;
    }

    // Méthode de l'exercice 2
    public Set<String> getCouleursTreeSet() {
        return new TreeSet<>(couleurs);
    }

    // Méthode de l'exercice 3
    private void initializeMap() {

        couleursMap = new HashMap<>();

        // Parcours du TreeSet
        for (String couleur : getCouleursTreeSet()) {

            char initiale = couleur.charAt(0);

            couleursMap.put(initiale, couleur);
        }
    }

    // Récupérer une couleur à partir de son initiale
    public String getCouleurFromCode(char initiale) {
        return couleursMap.get(initiale);
    }
}
