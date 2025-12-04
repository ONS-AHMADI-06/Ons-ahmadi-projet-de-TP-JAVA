package Vehicule;

public class Camion extends Vehicule {

    private double chargeMax;
    private double poidsChargement;

    // Constructeur
    public Camion(String matricule, String marque, double chargeMax) {
        super(matricule, marque);
        this.chargeMax = chargeMax;
        this.poidsChargement = 0;
    }

    // Charger
    public void charger(double poids) {
        if (poidsChargement + poids <= chargeMax) {
            poidsChargement += poids;
            System.out.println("Chargement ajouté. Poids actuel : " + poidsChargement);
        } else {
            System.out.println("Impossible : surcharge !");
        }
    }

    // Décharger
    public void decharger(double poids) {
        if (poids <= poidsChargement) {
            poidsChargement -= poids;
            System.out.println("Poids après déchargement : " + poidsChargement);
        } else {
            System.out.println("Impossible de décharger plus que le chargement actuel.");
        }
    }
}
