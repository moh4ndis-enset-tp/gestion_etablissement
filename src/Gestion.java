// Classe de gestion de l'etablissement d'enseignement
public class Gestion {
    public static void main(String[] args) {
        // Creation d'un tableau de 100 elements de type Personne
        Personne[] personnes = new Personne[100];

        // Initialisation du tableau avec diverses instances requises
        // 1 secretaire
        personnes[0] = new Secretaire("Lmasoudi", "Fatna", 35, "Riad Salam", 101);

        // 2 enseignants
        personnes[1] = new Enseignant("Laazizi", "Ahmed", 45, "Casablanca", 42, false, "Mathématiques");
        personnes[2] = new Enseignant("Brahim", "Mostapha", 52, "Kenitra", 38, true, "Informatique");

        // 3 etudiants
        personnes[3] = new Etudiant("Elanaami", "Mohamed", 20, "Marrakech", 15, "Cycle Informatique");
        personnes[4] = new Etudiant("Boudans", "Salah", 22, "Essaouira", 17, "Cycle Mathématiques");
        personnes[5] = new Etudiant("lakbir", "Fatma", 19, "Rabat", 14, "Licence Physique");

        // 1 secretaire
        personnes[6] = new Secretaire("Karima", "Saadia", 40, "Riad Salam", 102);

        // 1 etudiant et 1 enseignant
        personnes[7] = new Etudiant("Wahrani", "Said", 21, "Rabat", 16, "Master Informatique");
        personnes[8] = new Enseignant("Mikla", "Fatima", 48, "Kenitra", 45, false, "Physique");

        // 1) Parcourir les elements du tableau pour les afficher
        System.out.println("=== Liste des personnes avant tri ===");
        int i = 0;
        while (i < 9) { // Seulement 9 elements ont ete initialises
            personnes[i].ecrirePersonne();
            i++;
        }

        // 2) Afficher le nombre de personnes, secretaires, enseignants et etudiants
        System.out.println("\n=== Statistiques ===");
        Personne.nbPersonnes();

        // 3) Organiser les elements du tableau : secretaires d'abord, puis enseignants, puis etudiants
        organiserTableau(personnes, 9); // 9 est le nombre d'elements que nous avons utilises

        // 4) Afficher a nouveau le tableau pour verifier les changements
        System.out.println("\n=== Liste des personnes après tri ===");
        i = 0;
        while (i < 9) {
            personnes[i].ecrirePersonne();
            i++;
        }
    }

    // Methode pour organiser le tableau : secretaires d'abord, puis enseignants, puis etudiants
    public static void organiserTableau(Personne[] personnes, int nbElements) {
        Personne[] temp = new Personne[nbElements];
        int index = 0;

        // D'abord, ajouter toutes les secretaires
        for (int i = 0; i < nbElements; i++) {
            if (personnes[i] instanceof Secretaire) {
                temp[index++] = personnes[i];
            }
        }

        // Ensuite, ajouter tous les enseignants
        for (int i = 0; i < nbElements; i++) {
            if (personnes[i] instanceof Enseignant) {
                temp[index++] = personnes[i];
            }
        }

        // Enfin, ajouter tous les etudiants
        for (int i = 0; i < nbElements; i++) {
            if (personnes[i] instanceof Etudiant) {
                temp[index++] = personnes[i];
            }
        }

        // Copier le tableau temporaire dans le tableau original
        for (int i = 0; i < nbElements; i++) {
            personnes[i] = temp[i];
        }
    }
}

