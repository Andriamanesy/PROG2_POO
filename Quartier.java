import java.util.ArrayList;
import java.util.List;

public class Quartier extends Endroit {
    private List<Immeuble> immeubles;

    public Quartier(int id, String nom) {
        super(id, nom);
        this.immeubles = new ArrayList<>();
    }

    public void ajouterImmeuble(Immeuble imbl) {
        immeubles.add(imbl);
    }

    @Override
    public int compterAppartements() {
        int totalAppartements = this.appartements.size();
        for (Immeuble immeuble : immeubles) {
            totalAppartements += immeuble.compterAppartements();
        }
        return totalAppartements;
    }

    public boolean contientAppartement(Appartement appt) {
        if (appartements.contains(appt)) {
            return true;
        }
        for (Immeuble imbl : immeubles) {
            if (imbl.getAppartements().contains(appt)) {
                return true;
            }
        }
        return false;
    }
}
