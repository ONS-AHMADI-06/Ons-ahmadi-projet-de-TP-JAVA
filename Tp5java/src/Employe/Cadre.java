package Employe;

import java.util.ArrayList;

public class Cadre extends Employe {

    private ArrayList<Employe> equipe;

    public Cadre(String nom, int numBureau, double salaireAnnuel) {
        super(nom, numBureau, salaireAnnuel);
        this.equipe = new ArrayList<>();
    }

    public void ajouterEmploye(Employe e) {
        equipe.add(e);
    }

    public ArrayList<Employe> getEquipe() {
        return equipe;
    }

    @Override
    public String toString() {
        return "Cadre{" +
                "nom='" + nom + '\'' +
                ", bureau=" + numBureau +
                ", salaire=" + salaireAnnuel +
                ", equipe=" + equipe.size() +
                '}';
    }
}
