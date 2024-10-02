public class Immeuble extends Endroit {
    private int nombreEtages;

    public Immeuble(int id, String nom, int nombreEtages) {
        super(id, nom);
        this.nombreEtages = nombreEtages;
    }

    @Override
    public int compterAppartements() {
        return this.appartements.size();
    }
}
