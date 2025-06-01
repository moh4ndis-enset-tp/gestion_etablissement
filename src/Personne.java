// Classe abstraite representant une personne
public abstract class Personne {
    // Variables d'instance privees
    private String nom;
    private String prenom;
    private int age;
    private String adresse;

    // Variable de classe publique pour compter le nombre total de personnes
    public static int nb_personnes = 0;

    // Constructeur
    public Personne(String lenom, String leprenom, int lage, String ladresse) {
        this.nom = lenom;
        this.prenom = leprenom;
        this.age = lage;
        this.adresse = ladresse;
        nb_personnes++; // Incrementation du compteur quand une personne est creee
    }

    // Retourne une representation sous forme de chaine de caracteres de la personne
    @Override
    public String toString() {
        return "Nom: " + nom + ", Prénom: " + prenom + ", Age: " + age + ", Adresse: " + adresse;
    }

    // Methode abstraite pour afficher les caracteristiques et la categorie de la personne
    public abstract void ecrirePersonne();

    // Methode statique pour afficher le nombre total de personnes
    public static void nbPersonnes() {
        System.out.println("Nombre total de personnes: " + nb_personnes);
        System.out.println("Nombre de secrétaires: " + Secretaire.nb_secretaires);
        System.out.println("Nombre d'enseignants: " + Enseignant.nb_enseignants);
        System.out.println("Nombre d'étudiants: " + Etudiant.nb_etudiants);
    }

    // Methode pour modifier l'adresse de la personne
    public void modifierPersonne(String nouvelleAdresse) {
        this.adresse = nouvelleAdresse;
        ecrirePersonne(); // Appel de ecrirePersonne pour verifier la modification
    }

    // Accesseurs pour les champs prives
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public String getAdresse() {
        return adresse;
    }
}

