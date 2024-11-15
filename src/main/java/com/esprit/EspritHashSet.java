package com.esprit;

import java.util.HashSet;
import java.util.Set;

public class EspritHashSet implements GestionEnseignant {
    private Set<Enseignant> enseignants = new HashSet<>();


    @Override
    public void ajouterEnseignant(Enseignant e) {
        if (enseignants.add(e)) {
            System.out.println("Enseignant ajouté : " + e);
        } else {
            System.out.println("Enseignant déjà existant avec l'id : " + e.getId());
        }
    }

    @Override
    public boolean rechercherEnseignant(Enseignant e) {
        return enseignants.contains(e);
    }

    @Override
    public boolean rechercherEnseignant(int id) {
        return enseignants.stream().anyMatch(e -> e.getId() == id);
    }

    @Override
    public void supprimerEnseignant(Enseignant e) {
        if (enseignants.remove(e)) {
            System.out.println("Enseignant supprimé : " + e);
        } else {
            System.out.println("Enseignant non trouvé : " + e);
        }
    }

    @Override
    public void displayEnseignants() {
        System.out.println("Liste des enseignants (HashSet) :");
        enseignants.forEach(System.out::println);
    }
}
