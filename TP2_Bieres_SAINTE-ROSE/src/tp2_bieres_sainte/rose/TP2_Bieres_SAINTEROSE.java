/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_sainte.rose;

/**
 *
 * @author saint
 */
public class TP2_Bieres_SAINTEROSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée des trolls", (float) 7.0, "Dubuisson");
        uneBiere.lireEtiquette();
        System.out.println(uneBiere.Decapsuler());
        
        BouteilleBiere uneAutreBiere = new BouteilleBiere("Leffe", (float) 6.6, "Abbaye de Leffe");
        uneAutreBiere.lireEtiquette();
        System.out.println(uneAutreBiere.Decapsuler());
        
        BouteilleBiere AllezUneDerniereBiere = new BouteilleBiere ( "Jade", (float) 100.0, "La Brasserie");
        System.out.println(AllezUneDerniereBiere.Decapsuler());
    }
    
}
