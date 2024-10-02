public class Main {
    public static boolean estAppartementDansQuartier(Quartier qrt, Appartement appt) {
        return qrt.contientAppartement(appt);
    }

    public static int compterAppartementsEndroit(Endroit endroit) {
        return endroit.compterAppartements();
    }
    public static void main(String[] args) {
        // Teste
        Quartier ivandry = new Quartier(1, "Ivandry");
        Immeuble hei = new Immeuble(2, "Immeuble HEI", 120);
        ivandry.ajouterImmeuble(hei);


        Appartement appart1 = new Appartement(1, "Appart 1", "Description 1", 1000, Statut.LIBRE, hei);
        Appartement appart2 = new Appartement(2, "Appart 2", "Description 2", 1200, Statut.OCCUPE, ivandry);

        hei.ajouterAppartement(appart1);
        ivandry.ajouterAppartement(appart2);

        boolean estDansIvandry = estAppartementDansQuartier(ivandry, appart1);
        System.out.println("Appart 1 est dans Ivandry : " + estDansIvandry);

        int totalAppartements = compterAppartementsEndroit(ivandry);
        System.out.println("Nombre total d'appartements dans Ivandry : " + totalAppartements);
    }
}
