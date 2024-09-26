/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur_sainterose;

import java.util.Scanner;

/**
 *
 * @author saint
 */
public class TP1_convertisseur_SAINTEROSE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temp=0;
        Scanner SCAN;
        SCAN = new Scanner (System.in);
        System.out.println("\n veuillez entrer la temperature:");
        double reel1=SCAN.nextDouble();
        System.out.println(reel1);
        Scanner SCANNING;
        SCANNING = new Scanner (System.in);
        System.out.println("Saisissez la conversion que vous souhaiter effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Celcius");
        System.out.println("4) De Celcius vers Farenheit");
        System.out.println("5) De Kelvin vers Farenheit");
        System.out.println("6) De Farenheit vers Kelvin");
        int indice = SCANNING.nextInt();
        System.out.println(indice);
        switch (indice) {
    case 1 -> temp = CelciusVersKelvin(reel1);
    case 2 -> temp = KelvinVersCelcius(reel1);
    case 3 -> temp = FarenheitVersCelcius(reel1);
    case 4 -> temp = CelciusVersFarenheit(reel1);
    case 5 -> temp = KelvinVersFarenheit(reel1);
    case 6 -> temp = FarenheitVersKelvin(reel1);
            // Ajout du break manquant ici
    default -> {
        System.out.println("Indice invalide");
        return; // permet de ne pas exécuter `System.out.println(temp)` si l'indice est invalide.
            }
}

// Placer l'affichage ici en dehors du switch
System.out.println(temp);

        }
    

public  static double CelciusVersKelvin (double tCelcius) {
    double tKelvin=tCelcius +273.14;
        return tKelvin;
}

public static double KelvinVersCelcius (double tKelvin) {
    double tCelcius=tKelvin -273.14;
        return tCelcius;
}

public static double FarenheitVersCelcius(double tFarenheit) {
    double soustract = tFarenheit-32;
    double tCelcius = soustract*5/9;
        return tCelcius;
}
public static double CelciusVersFarenheit(double tCelcius) {
    double tFarenheit=(tCelcius);
    return tFarenheit;
}

public static double KelvinVersFarenheit (double tKelvin) {
    double tCelcius=KelvinVersCelcius(tKelvin);
    double tFarenheit=(tCelcius+32)/5*9;
        return tFarenheit;
}

public static double FarenheitVersKelvin(double tFarenheit) {
    double tCelcius= FarenheitVersCelcius(tFarenheit);
    double tKelvin= CelciusVersKelvin(tCelcius);
        return tKelvin;
}
}