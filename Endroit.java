import java.util.ArrayList;
import java.util.List;

public abstract class Endroit {
    protected int id;
    protected String nom;
    protected List<Appartement> appartements;

    public void ajouterAppartement(Appartement appartement) {
        appartements.add(appartement);
    }

    public List<Appartement> getAppartements() {
        return appartements;
    }

    public abstract int compterAppartements();
    public Endroit(int id, String nom) {
        this.id = id;
        this.nom = nom;
        this.appartements = new ArrayList<>();
    }


}
