package Vehicule;
public class Vehicule {

    // Attributs
    protected String matricule;
    protected String marque;
    protected double vitesse;
    protected int etat; // 0 = arrêté, 1 = en marche

    // Constructeur
    public Vehicule(String matricule, String marque) {
        this.matricule = matricule;
        this.marque = marque;
        this.vitesse = 0;
        this.etat = 0; // véhicule arrêté au début
    }

    // Méthode démarrer
    public void demarrer() {
        if (etat == 0) {
            etat = 1;
            System.out.println("Le véhicule démarre.");
        } else {
            System.out.println("Déjà en marche.");
        }
    }

    // Méthode arrêter
    public void arreter() {
        if (etat == 1) {
            etat = 0;
            vitesse = 0;
            System.out.println("Le véhicule est arrêté.");
        } else {
            System.out.println("Déjà arrêté.");
        }
    }

    // Accélérer
    public void accelerer(double valeur) {
        if (etat == 1) {
            vitesse += valeur;
            System.out.println("Vitesse actuelle : " + vitesse);
        } else {
            System.out.println("Impossible d'accélérer, véhicule arrêté.");
        }
    }

    // Freiner
    public void freiner(double valeur) {
        if (vitesse > 0) {
            vitesse -= valeur;
            if (vitesse < 0) vitesse = 0;
            System.out.println("Vitesse actuelle après freinage : " + vitesse);
        } else {
            System.out.println("Le véhicule est déjà à l'arrêt.");
        }
    }
}
