package Specialite;

public class Test {
    public static void main(String[] args) {

        // 1) Tableau de 10 spécialités
        Specialite[] T = new Specialite[10];

        // 2) Remplir avec 5 Spécialités
        T[0] = new Specialite(1, "Réseau");
        T[1] = new Specialite(2, "MDW");
        T[2] = new Specialite(3, "Génie logiciel");
        T[3] = new Specialite(4, "IA");
        T[4] = new Specialite(5, "cybersécurité");

        // 3) Afficher les éléments
        System.out.println("---- Liste des spécialités ----");
        for (int i = 0; i < 5; i++) {
            T[i].Afficher();
        }

        // 4) Changer libellé "Réseau"
        T[0].setLibelle("Réseau et télécommunication");

        // 5) Afficher numéro de la spécialité "IA"
        System.out.println("\nNuméro de la spécialité IA : " + T[3].getNum());

        // 6) Créer étudiant e1 spécialité "Génie logiciel"
        Etudiant e1 = new Etudiant("Ali", "Karoui", T[2], 3, 14.5);

        // 7) Créer étudiant e2 spécialité "cybersécurité"
        Etudiant e2 = new Etudiant("Sami", "Ben Ali", T[4], 2, 12.0);

        // 8) Afficher libellé spécialité de e2
        System.out.println("\nSpécialité de e2 : " + e2.spec.getLibelle());

        // 9) Afficher nombre total des étudiants
        System.out.println("Nombre total des étudiants : " + Etudiant.cpt);

        // 10) Afficher somme des moyennes
        System.out.println("Somme des moyennes : " + Etudiant.som_moy);

        // 11) Moyenne générale des étudiants
        double moyenneGenerale = Etudiant.som_moy / Etudiant.cpt;
        System.out.println("Moyenne générale des étudiants : " + moyenneGenerale);
    }
}
