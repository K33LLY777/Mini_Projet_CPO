/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_sainterose;

/**
 *
 * @author saint
 */
public class TP2_relation_1_SAINTEROSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ; 
Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ; 
Voiture uneNSX = new Voiture ("NSX", "Honda", 100000000 ) ; 
Voiture uneS14 = new Voiture ("S14", "Nissan",  4) ; 

Personne bob = new Personne("Bobby", "Sixkiller"); 
Personne reno = new Personne("Reno", "Raines"); 
System.out.println("liste des voitures disponibles "+ uneClio  + 
"\n" + uneAutreClio   + "\n" + uneNSX   + "\n" + uneS14 ) ; 

bob.liste_voitures[0] = uneClio ; 
bob.nbVoitures = 1 ; 
uneClio.Proprietaire = bob ; 

System.out.println("la premiere voiture de Bob est " + 
bob.liste_voitures[0] ) ; 
      

bob.liste_voitures[1] = uneAutreClio ; 
bob.nbVoitures = 2 ; 
uneAutreClio.Proprietaire = bob ; 

System.out.println("la seconde voiture de Bob est " + 
bob.liste_voitures[1] );

reno.liste_voitures[0] = uneS14;
reno.nbVoitures = 1 ; 
uneS14.Proprietaire = reno; 
    }
    
}