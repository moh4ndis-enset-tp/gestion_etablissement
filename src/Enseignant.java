// Classe representant un enseignant dans un etablissement d'enseignement
public class Enseignant extends Personne {
    // Variables d'instance privees
    private int nbHeuresCours;
    private boolean grincheux;
    private String specialite;

    // Variable de classe publique pour compter les enseignants
    public static int nb_enseignants = 0;

    // Constructeur
    public Enseignant(String lenom, String leprenom, int lage, String ladresse,
                      int nbHeuresCours, boolean grincheux, String specialite) {
        super(lenom, leprenom, lage, ladresse);
        this.nbHeuresCours = nbHeuresCours;
        this.grincheux = grincheux;
        this.specialite = specialite;
        nb_enseignants++; // Incrementation du compteur d'enseignants
    }

    // Retourne une representation sous forme de chaine de caracteres de l'enseignant
    @Override
    public String toString() {
        return super.toString() + ", Spécialité: " + specialite +
               ", Heures de cours: " + nbHeuresCours +
               ", Grincheux: " + (grincheux ? "Oui" : "Non");
    }

    // Affiche les caracteristiques de l'enseignant
    @Override
    public void ecrirePersonne() {
        System.out.println("Enseignant: " + toString());
    }

    // Calcule le salaire de l'enseignant
    public double salaireEnseignant(double tauxHoraire) {
        double salaire = 0;

        if (nbHeuresCours <= 40) {
            salaire = nbHeuresCours * tauxHoraire;
        } else {
            salaire = 40 * tauxHoraire;

            // Applique un taux de 150% pour les heures supplementaires uniquement pour les enseignants non grincheux
            if (!grincheux) {
                salaire += (nbHeuresCours - 40) * tauxHoraire * 1.5;
            } else {
                salaire += (nbHeuresCours - 40) * tauxHoraire;
            }
        }

        return salaire;
    }
}

