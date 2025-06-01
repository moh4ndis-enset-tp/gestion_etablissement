// Classe representant une secretaire dans un etablissement d'enseignement
public class Secretaire extends Personne {
    // Variable d'instance privee
    private int numeroBureau;

    // Variable de classe publique pour compter les secretaires
    public static int nb_secretaires = 0;

    // Constructeur
    public Secretaire(String lenom, String leprenom, int lage, String ladresse,
                     int numeroBureau) {
        super(lenom, leprenom, lage, ladresse);
        this.numeroBureau = numeroBureau;
        nb_secretaires++; // Incrementation du compteur de secretaires
    }

    // Retourne une representation sous forme de chaine de caracteres de la secretaire
    @Override
    public String toString() {
        return super.toString() + ", Numéro de bureau: " + numeroBureau;
    }

    // Affiche les caracteristiques de la secretaire
    @Override
    public void ecrirePersonne() {
        System.out.println("Secretaire: " + toString());
    }
}

