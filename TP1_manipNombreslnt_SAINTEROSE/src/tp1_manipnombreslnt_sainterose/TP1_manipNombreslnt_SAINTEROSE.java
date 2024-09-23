/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombreslnt_sainterose;

import java.util.Scanner;

/**
 *
 * @author saint
 */
public class TP1_manipNombreslnt_SAINTEROSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1
        Scanner scanna = new Scanner (System.in);//Création d'un scanner qui recuperera la valeur entrée par l'utilisateur
        System.out.println("\n veuillez entrer le premier entier:");
        int entier1=scanna.nextInt();//Création d'un entier prennant la valeur lue
        Scanner scammer = new Scanner (System.in);
        System.out.println("\n veuillez entrer le second entier:");
        int entier2=scammer.nextInt();// Répétition de la procédure
        int aff [] = new int [2];//Création d'un tableau de deux éléments
        aff[0]=entier1;
        aff[1]=entier2;
        System.out.println("le premier entier choisi est"+aff[0]);
        System.out.println("Le second entierr choisi est"+aff[1]);
        int somme=aff[0]+aff[1];
        int difference=aff[0]-aff[1];
        int produit=aff[0]*aff[1];
        System.out.println("la somme de ces deux entiers est" +somme); 
        System.out.println("tandis que leur difference est" +difference);
        System.out.println("pour finir, leur produit est" +produit);
        int quotient=entier1/entier2;
        System.out.println("le quotient de ces deux entiers est"+quotient);
        int reste= entier1%entier2;
        System.out.println("le reste de ce quotient est"+reste);
    }
    
}
