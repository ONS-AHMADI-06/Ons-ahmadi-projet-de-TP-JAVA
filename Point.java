package exercice3;


public class Point {
    public Double abscisse;
    public Double ordonnee;

    // Constructeur
    public Point(Double abscisse, Double ordonnee) {
        this.abscisse = abscisse;
        this.ordonnee = ordonnee;
    }

    // Méthode pour afficher les coordonnées
    public void afficher() {
        System.out.println("Point : (" + abscisse + ", " + ordonnee + ")");
    }
}
