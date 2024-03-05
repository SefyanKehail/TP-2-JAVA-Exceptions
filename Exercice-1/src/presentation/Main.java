package presentation;

import metier.EntierNaturel;
import metier.NombreNegatifException;

public class Main {
    public static void main(String[] args) {
        try {
            EntierNaturel entierNaturelValide = new EntierNaturel(5);
            EntierNaturel entierNaturelNonValide = new EntierNaturel(-5);

        } catch (NombreNegatifException exception){
            System.out.println("L'argument choisi '"+exception.consulterValeur()+"' doit etre positif !");
        }

        try {
            EntierNaturel entierNaturelValideNonDecrementable = new EntierNaturel(0);
            entierNaturelValideNonDecrementable.decrementer();
        } catch (NombreNegatifException exception){
            System.out.println("La valeur choisi '"+exception.consulterValeur()+"' est non decrementable");
        }

    }
}
