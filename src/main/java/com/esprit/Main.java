package com.esprit;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        GestionEnseignant gestionHashSet = new EspritHashSet();
        GestionEnseignant gestionTreeSet = new EspritTreeSet();

        Enseignant e1 = new Enseignant(1, "Dupont", "Jean");
        Enseignant e2 = new Enseignant(2, "Martin", "Pierre");
        Enseignant e3 = new Enseignant(3, "Durand", "Sophie");
        Enseignant e4 = new Enseignant(1, "Dupont", "Jean"); // Idem que e1 pour tester l'égalité

        gestionHashSet.ajouterEnseignant(e1);
        gestionHashSet.ajouterEnseignant(e2);
        gestionHashSet.ajouterEnseignant(e3);
        gestionHashSet.ajouterEnseignant(e4);

        gestionTreeSet.ajouterEnseignant(e1);
        gestionTreeSet.ajouterEnseignant(e2);
        gestionTreeSet.ajouterEnseignant(e3);
        gestionTreeSet.ajouterEnseignant(e4);

        gestionHashSet.displayEnseignants();
        gestionTreeSet.displayEnseignants();

        System.out.println("Recherche par id (HashSet) : " + gestionHashSet.rechercherEnseignant(2)); // true
        System.out.println("Recherche par id (TreeSet) : " + gestionTreeSet.rechercherEnseignant(4)); // false

        gestionHashSet.supprimerEnseignant(e1);
        gestionTreeSet.supprimerEnseignant(e1);

        gestionHashSet.displayEnseignants();
        gestionTreeSet.displayEnseignants();

    }
}