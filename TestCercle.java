package exercice3;
public class TestCercle {
    public static void main(String[] args) {
        // Création d'un point centre
        Point centre = new Point(3.0, 4.0);

        // Création du cercle avec centre et rayon
        Cercle c1 = new Cercle(centre, 5.0);

        // Affichage des résultats
        c1.afficher();
    }
}
