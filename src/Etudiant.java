// Classe representant un etudiant dans un etablissement d'enseignement
public class Etudiant extends Personne {
    // Variables d'instance privees
    private int noteMoyenne;
    private String diplomeEnCours;

    // Variable de classe publique pour compter les etudiants
    public static int nb_etudiants = 0;

    // Constructeur
    public Etudiant(String lenom, String leprenom, int lage, String ladresse,
                   int noteMoyenne, String diplomeEnCours) {
        super(lenom, leprenom, lage, ladresse);
        this.noteMoyenne = noteMoyenne;
        this.diplomeEnCours = diplomeEnCours;
        nb_etudiants++; // Incrementation du compteur d'etudiants
    }

    // Retourne une representation sous forme de chaine de caracteres de l'etudiant
    @Override
    public String toString() {
        return super.toString() + ", Note Moyenne: " + noteMoyenne +
               ", Diplôme en cours: " + diplomeEnCours;
    }

    // Affiche les caracteristiques de l'etudiant
    @Override
    public void ecrirePersonne() {
        System.out.println("Etudiant: " + toString());
    }
}

