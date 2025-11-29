package Specialite;

public class Etudiant {
    public String nom;
    public String prenom;
    public Specialite spec;
    public int niveau;
    public double moy;

    public static double som_moy = 0;
    public static int cpt = 0;

    // Constructeur
    public Etudiant(String nom, String prenom, Specialite spec, int niveau, double moy) {
        this.nom = nom;
        this.prenom = prenom;
        this.spec = spec;
        this.niveau = niveau;
        this.moy = moy;

        cpt++;            // Incrémenter compteur
        som_moy += moy;   // Ajouter moyenne
    }

    // Méthode d'affichage
    public void Affiche() {
        System.out.println("Nom : " + nom +
                           ", Prénom : " + prenom +
                           ", Spécialité : " + spec.getLibelle() +
                           ", Niveau : " + niveau +
                           ", Moyenne : " + moy);
    }
}
