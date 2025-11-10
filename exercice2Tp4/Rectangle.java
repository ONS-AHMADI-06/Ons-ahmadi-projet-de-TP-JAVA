package Rectangle;
public class Rectangle {
    // declaration des  Attributs
    public Double longueur;
    public Double largeur;

    // Constructeur avec paramètres
    public Rectangle(Double longueur, Double largeur) {
        this.longueur = longueur;
        this.largeur = largeur;
    }

    // Méthode surface()
    public Double surface() {
        return longueur * largeur;
    }

    //Méthode perimetre()
    public Double perimetre() {
        return 2 * (longueur + largeur);
    }

    // Méthode afficher()
    public void afficher() {
        System.out.println("Longueur : " + longueur + " cm");
        System.out.println("Largeur  : " + largeur + " cm");
        System.out.println("Surface  : " + surface() + " cm²");
        System.out.println("Périmètre: " + perimetre() + " cm");
    }
}
