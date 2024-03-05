package metier;

public class CompteCourant extends CompteBancaire {
    private double decouverteAutorise;


    public CompteCourant(String numeroCompte, double solde, String nomTitulaire, double decouverteAutorise) {
        super(numeroCompte, solde, nomTitulaire);
        this.decouverteAutorise = decouverteAutorise;
    }

    @Override
    public void retirer(double montant) throws FondsInsuffisantsException {
        if (montant > (this.solde + this.decouverteAutorise)) {
            throw new FondsInsuffisantsException("fonds insuffisants pour effectuer cette operation");
        } else {
            this.solde -= montant;
        }
    }
}
