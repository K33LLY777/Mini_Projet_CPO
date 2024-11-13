package tp2_relation_1_sainterose;

/**
 * Represents a person with a first name and a last name.
 * 
 */
public class Personne {
    public String nom;
    public String prenom;
    public int nbVoitures;
    public Voiture[] liste_voitures;
    String[] liste_voitures;

    /**
     * Constructor for the Personne class.
     * 
     * @param nom the last name of the person
     * @param prenom the first name of the person
     */
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        liste_voitures = new Voiture [3] ; 
        
    }

    Personne() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    /**
     * Overrides the default toString method to provide a readable format.
     * 
     * @return a string representation of the Personne object
     */
    @Override
    public String toString() {
        return "Personne{" + "prenom='" + prenom + '\'' + ", nom='" + nom + '\'' + '}';
    }
}