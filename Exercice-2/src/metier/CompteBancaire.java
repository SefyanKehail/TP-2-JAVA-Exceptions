package metier;

public class CompteBancaire {
    protected String numeroCompte;
    protected double solde;
    protected String nomTitulaire;

    public CompteBancaire(String numeroCompte, double solde, String nomTitulaire) {
        this.numeroCompte = numeroCompte;
        this.solde = solde;
        this.nomTitulaire = nomTitulaire;
    }

    public void deposer(double montant) {
        this.solde += montant;
    }

    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > this.solde) {
            throw new FondsInsuffisantsException("fonds insuffisants pour effectuer cette operation");
        } else {
            this.solde -= montant;
        }
    }

    public void afficherSolde() {
        System.out.println("Solde actuel: " + this.solde);
    }

    public void transferer(
            CompteBancaire compteBancaire,
            double montant
    ) throws CompteInexistantException, FondsInsuffisantsException {
        if (compteBancaire == null) {
            throw new CompteInexistantException("le Compte de destination est inexistant,");
        } else {
            this.retirer(montant);
            compteBancaire.deposer(montant);
        }
    }
}
