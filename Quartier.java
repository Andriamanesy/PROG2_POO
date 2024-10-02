import java.util.ArrayList;
import java.util.List;

public class Quartier extends Endroit {
    private List<Immeuble> immeubles;

    public Quartier(int id, String nom) {
        super(id, nom);
        this.immeubles = new ArrayList<>();
    }

    public void ajouterImmeuble(Immeuble immeuble) {
        immeubles.add(immeuble);
    }

    @Override
    public int compterAppartements() {
        int totalAppartements = this.appartements.size();
        for (Immeuble immeuble : immeubles) {
            totalAppartements += immeuble.compterAppartements();
        }
        return totalAppartements;
    }

    public boolean contientAppartement(Appartement appartement) {
        if (appartements.contains(appartement)) {
            return true;
        }
        for (Immeuble immeuble : immeubles) {
            if (immeuble.getAppartements().contains(appartement)) {
                return true;
            }
        }
        return false;
    }
}
