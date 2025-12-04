package Employe;

import java.util.ArrayList;

public class Entreprise {

    private ArrayList<Employe> employes;

    public Entreprise() {
        this.employes = new ArrayList<>();
    }

    // Ajout d’un employé
    public void ajouterEmploye(Employe e) {
        employes.add(e);
    }

    // Calcul du nombre de cadres
    public int getNombreCadres() {
        int count = 0;
        for (Employe e : employes) {
            if (e instanceof Cadre)
                count++;
        }
        return count;
    }

    // Calcul du nombre de non-cadres
    public int getNombreNonCadres() {
        return employes.size() - getNombreCadres();
    }

    // Liste des employés occupant un bureau donné
    public ArrayList<Employe> getEmployesParBureau(int bureau) {
        ArrayList<Employe> list = new ArrayList<>();
        for (Employe e : employes) {
            if (e.getNumBureau() == bureau)
                list.add(e);
        }
        return list;
    }

    // Liste des cadres dont dépend un employé donné (par nom)
    public ArrayList<Cadre> getCadresResponsables(String nom) {
        ArrayList<Cadre> cadres = new ArrayList<>();

        for (Employe e : employes) {
            if (e instanceof Cadre) {
                Cadre c = (Cadre) e;
                for (Employe emp : c.getEquipe()) {
                    if (emp.getNom().equalsIgnoreCase(nom)) {
                        cadres.add(c);
                    }
                }
            }
        }
        return cadres;
    }

    // Salaire moyen des deux catégories
    public double getSalaireMoyenCadres() {
        double somme = 0;
        int count = 0;

        for (Employe e : employes) {
            if (e instanceof Cadre) {
                somme += e.getSalaireAnnuel();
                count++;
            }
        }
        return (count == 0) ? 0 : somme / count;
    }

    public double getSalaireMoyenNonCadres() {
        double somme = 0;
        int count = 0;

        for (Employe e : employes) {
            if (!(e instanceof Cadre)) {
                somme += e.getSalaireAnnuel();
                count++;
            }
        }
        return (count == 0) ? 0 : somme / count;
    }
}
