public class Appartement {
    private int id;
    private String titre;
    private String description;
    private double loyerMensuel;
    private Statut statut;
    private Endroit endroit;


    public Endroit getEndroit() {
        return endroit;
    }

    public Appartement(int id, String titre, String description, double loyerMensuel, Statut statut, Endroit endroit) {
        this.id = id;
        this.titre = titre;
        this.description = description;
        this.loyerMensuel = loyerMensuel;
        this.statut = statut;
        this.endroit = endroit;
    }


}
