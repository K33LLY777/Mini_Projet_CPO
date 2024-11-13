package tp2_relation_1_sainterose;

import static java.lang.constant.ConstantDescs.NULL;

/**
 * Represents a car with a model, brand, and power in horsepower.
 * 
 */
public class Voiture {
    public String modele;
    public String marque;
    public int puissanceCv;
    public Personne Proprietaire;
    
    // Constructor for the Voiture class
    public Voiture(String modele, String marque, int puissanceCv) {
        
        this.Proprietaire = (Personne) NULL;
        this.modele = modele;
        this.marque = marque;
        this.puissanceCv = puissanceCv;
    }
    
    // Override of the toString method for better readability
    @Override
    public String toString() {
        return "Voiture{" + "modele='" + modele + '\'' + ", marque='" + marque + '\'' + ", puissanceCv=" + puissanceCv + '}';
    }
}