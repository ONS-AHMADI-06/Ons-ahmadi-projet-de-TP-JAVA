package Vehicule;

public class Bus extends Vehicule {

    private int nbrVoyageur;
    private int maxVoyageur;

    // Constructeur
    public Bus(String matricule, String marque, int maxVoyageur) {
        super(matricule, marque);
        this.maxVoyageur = maxVoyageur;
        this.nbrVoyageur = 0;
    }

    // Monter dans le bus
    public void monter(int nb) {
        if (nbrVoyageur + nb <= maxVoyageur) {
            nbrVoyageur += nb;
            System.out.println(nb + " voyageurs sont montés. Total = " + nbrVoyageur);
        } else {
            System.out.println("Bus plein ! Impossible de monter.");
        }
    }

    // Descendre du bus
    public void descendre(int nb) {
        if (nb <= nbrVoyageur) {
            nbrVoyageur -= nb;
            System.out.println(nb + " voyageurs sont descendus. Total = " + nbrVoyageur);
        } else {
            System.out.println("Nombre invalide : plus de passagers à bord.");
        }
    }
}
