package Employe;

public class Employe {

    protected String nom;
    protected int numBureau;
    protected double salaireAnnuel;

    public Employe(String nom, int numBureau, double salaireAnnuel) {
        this.nom = nom;
        this.numBureau = numBureau;
        this.salaireAnnuel = salaireAnnuel;
    }

    public String getNom() {
        return nom;
    }

    public int getNumBureau() {
        return numBureau;
    }

    public double getSalaireAnnuel() {
        return salaireAnnuel;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "nom='" + nom + '\'' +
                ", bureau=" + numBureau +
                ", salaire=" + salaireAnnuel +
                '}';
    }
}
