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
    }
    

public static double CelciusVersKelvin (double tCelcius) {
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
    double tFarenheit=(tCelcius)
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