package presentation;

import metier.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Liste de comptes

        ArrayList<CompteBancaire> compteBancaires = new ArrayList<>();

        try {
            // Comptes
            CompteCourant compteCourant = new CompteCourant(
                    "122942741224097",
                    29000,
                    "TitulaireCompteCourant",
                    500
            );

            CompteEpargne compteEpargne = new CompteEpargne(
                    "39559322795543257",
                    115000,
                    "TitulaireCompteEpargne",
                    0.05
            );

            CompteCourant compteCourantASupprimer = new CompteCourant(
                    "56654423948573394",
                    0,
                    "TitulaireCompteASuprimer",
                    0
            );


            // Opérations sur ArrayList<CompteBancaire>
            compteBancaires.add(compteCourant);
            compteBancaires.add(compteEpargne);
            compteBancaires.add(compteCourantASupprimer);
            compteBancaires.remove(compteCourantASupprimer);


            System.out.println("***** Avant operations *****");
            for (CompteBancaire compteBancaire : compteBancaires) {
                System.out.println("Compte " + compteBancaire.getClass().getSimpleName());
                compteBancaire.afficherSolde();
            }


            // Operations 29000 dans le solde + 500 deposé + 500 decouverte = 30000 est possible
            compteCourant.deposer(500);
            compteCourant.transferer(compteEpargne, 30000);

            // uncomment pour generer fonds insuffisants exception
            // compteCourant.retirer(1000);

            // uncomment pour generer compte inexistant exception
            compteCourant.transferer(null, 30000);

        } catch (CompteInexistantException | FondsInsuffisantsException exception) {

            System.out.println("\n***** " + exception.getClass().getSimpleName() + " caught *****");
            System.out.println(exception.getMessage());
        } finally {

            System.out.println("\n***** Apres operations *****");
            for (CompteBancaire compteBancaire : compteBancaires) {
                System.out.println("Compte " + compteBancaire.getClass().getSimpleName());
                compteBancaire.afficherSolde();
            }
        }
    }
}
