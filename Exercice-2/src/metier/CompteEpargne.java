package metier;

public class CompteEpargne extends CompteBancaire {
    private double tauxInterets;

    public CompteEpargne(String numeroCompte, double solde, String nomTitulaire, double tauxInterets) {
        super(numeroCompte, solde, nomTitulaire);
        this.tauxInterets = tauxInterets;
    }

    public void genererInterets(double tauxInterets) {
        this.solde += 1 + tauxInterets;
    }
}
