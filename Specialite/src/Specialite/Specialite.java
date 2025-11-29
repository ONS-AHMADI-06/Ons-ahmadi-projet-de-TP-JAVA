package Specialite;

public class Specialite {
    private int num;
    private String libelle;

    // Constructeur
    public Specialite(int num, String libelle) {
        this.num = num;
        this.libelle = libelle;
    }

    // Getters et Setters
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    // Méthode d'affichage
    public void Afficher() {
        System.out.println("Num: " + num + ", Libellé: " + libelle);
    }
}
